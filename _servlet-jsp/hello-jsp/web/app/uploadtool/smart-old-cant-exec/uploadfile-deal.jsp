<%@ page contentType="text/html; charset=utf-8" language="java"%>
<jsp:useBean id="upFile" scope="page" class="com.jspsmart.upload.SmartUpload" />
<jsp:useBean id="conn" scope="page" class="db.ConnDB" />


<%

upFile.initialize(pageContext);
upFile.upload();
long size = upFile.getFiles().getSize();

System.out.println("文件大小 : "+size);

if(size > 2000000){
	out.println("<script>alert('您上传的文件太大，不能完成上传！');history.back(-1);</script>");
}

else {
	String getFileName = upFile.getFiles().getFile(0).getFileName();
	String sql = "INSERT INTO tb_file (name,file_size) values('" + getFileName + "'," + size+")";
	conn.executeUpdate(sql);
	out.println("<script>alert('文件上传成功！');window.close();</script>");

	try {
		upFile.save("./upload");
//        upFile.save("e:/" + getFileName);// 保存文件到C盘根目录

	} catch(Exception e){
		System.out.println("上传文件出现错误："+e.getMessage());
	}

//    response.sendRedirect("uploadfile-index.jsp");

}
%>