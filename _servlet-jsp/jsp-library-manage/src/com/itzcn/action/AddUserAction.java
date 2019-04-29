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

public class AddUserAction extends ActionSupport {

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
	
	

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public PostService getPostService() {
		return postService;
	}

	public void setPostService(PostService postService) {
		this.postService = postService;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
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
		if(userService.isExist(user.getUserName())){
			return INPUT;
		}else{
			if (postId.equals("0")) {
				return INPUT;
			} else {
				Integer postIdc = Integer.parseInt(postId); 
				Post post = postService.showByPostId(postIdc);
				Integer postNum = post.getPostNum();
				postNum = postNum + 1;
				post.setPostNum(postNum);//更新部门人数
				postService.upPost(post);
				user.setPost(post);
				String uploadPath  = ServletActionContext.getServletContext().getRealPath("/upload");
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssSSS");//设置日期格式
				String msg =sdf.format(new Date(System.currentTimeMillis()));
				if(file==null || fileFileName==null){
					user.setPhoto("default.jpg");
				}else{
					String param = fileFileName.substring(fileFileName.lastIndexOf("."));
					String SaveName = msg + param;
					UtilMethod.Upload(uploadPath, SaveName, file);
					user.setPhoto(SaveName);
				}
				if (user.getRemark().trim().equals("")) {
					user.setRemark("无");
				}
				userService.addUser(user);
				return SUCCESS;
			}
		}
		
	}
}
