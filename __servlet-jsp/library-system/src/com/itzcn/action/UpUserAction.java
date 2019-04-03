package com.itzcn.action;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.struts2.ServletActionContext;

import com.itzcn.entity.Post;
import com.itzcn.entity.User;
import com.itzcn.service.PostService;
import com.itzcn.service.UserService;
import com.itzcn.util.UtilMethod;
import com.opensymphony.xwork2.ActionSupport;

public class UpUserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserService userService;
	private User user;
	private File file;
	
	private String fileFileName;
	
	private PostService postService ;
	
	private String postId;
	
	
	
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getFileFileName() {
		return fileFileName;
	}
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
	public PostService getPostService() {
		return postService;
	}
	public void setPostService(PostService postService) {
		this.postService = postService;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String execute(){
		if (userService.isUpdate(user)) {
			if (postId.equals("0")) {
				addActionError("请选择部门");
				return INPUT;
			} else {
				Integer postIdc = Integer.parseInt(postId); 
				Post post = postService.showByPostId(postIdc);
				User u = userService.showByUserId(user.getUserId());
				if(!postIdc.equals(u.getPost().getPostId())){
					Post post2 = u.getPost();
					Integer postNum = post.getPostNum() + 1;
					Integer postNum2 = post2.getPostNum() - 1;
					post.setPostNum(postNum);
					post2.setPostNum(postNum2);
					postService.upPost(post);
					postService.upPost(post2);
				}
				user.setPost(post);
				String uploadPath  = ServletActionContext.getServletContext().getRealPath("/upload");
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssSSS");//设置日期格式
				String msg =sdf.format(new Date(System.currentTimeMillis()));
				if(file==null || fileFileName==null){
					user.setPhoto(u.getPhoto());
				}else{
					String param = fileFileName.substring(fileFileName.lastIndexOf("."));
					String SaveName = msg + param;
					UtilMethod.Upload(uploadPath, SaveName, file);
					user.setPhoto(SaveName);
				}
			userService.upUser(user);
			return SUCCESS;
			}
		} else {
			return INPUT;
		}
		
	}
}
