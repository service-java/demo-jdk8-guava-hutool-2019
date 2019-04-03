package com.itzcn.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.itzcn.entity.Post;
import com.itzcn.service.PostService;

public class UtilMethod {
	
	public static List<Post> getPosts(String pathParam){
		String path="/WEB-INF/applicationContext.xml"; 
		ApplicationContext context = new FileSystemXmlApplicationContext(pathParam + path);
		PostService postService = (PostService) context.getBean("postService");
		List<Post> posts = postService.showPosts();
		return posts;
	}
	
	public  static void close(FileOutputStream fos, FileInputStream fis) {
        if (fis != null) {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("FileInputStream关闭失败");
                e.printStackTrace();
            }
        }
        if (fos != null) {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("FileOutputStream关闭失败");
                e.printStackTrace();
            }
        }
    }
	
	public static void Upload(String uploadPath,String SaveName,File file){
		
		if (!(new File(uploadPath)).exists()) {
			new File(uploadPath).mkdirs();
		}
		File saveFile=new File(uploadPath,SaveName);
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try{
			fos = new FileOutputStream(saveFile);  
			fis = new FileInputStream(file);  
	        //设置缓存  
	        byte[] buffer = new byte[1024];  
	  
	        int length = 0;  
	  
	        //读取File文件输出到saveFile文件中  
	        while ((length = fis.read(buffer)) > 0) {  
	            fos.write(buffer, 0, length);  
	        }  
		}catch(Exception e){
			System.out.println("文件上传失败");
            e.printStackTrace();
		} finally {
			UtilMethod.close(fos, fis);
        }
	}
}
