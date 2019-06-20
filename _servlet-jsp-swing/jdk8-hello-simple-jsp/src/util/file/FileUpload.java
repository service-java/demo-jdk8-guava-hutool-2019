package util.file;

/**
 * Created by Luo_0412 on 2017/4/11.
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


public class FileUpload extends HttpServlet {

    /**
     * Constructor of the object.
     */
    public FileUpload() {
        super();
    }

    /**
     * Destruction of the servlet. <br>
     */
    public void destroy() {
        super.destroy(); // Just puts "destroy" string in log
        // Put your code here
    }

    /**
     * The doGet method of the servlet. <br>
     *
     * This method is called when a form has its tag value method equals to get.
     *
     * @param request
     *            the request send by the client to the server
     * @param response
     *            the response send by the server to the client
     * @throws ServletException
     *             if an error occurred
     * @throws IOException
     *             if an error occurred
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
        out.println("<HTML>");
        out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
        out.println("  <BODY>");
        out.print("    This is ");
        out.print(this.getClass());
        out.println(", using the GET method");
        out.println("  </BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();
    }

    /**
     * The doPost method of the servlet. <br>
     *
     * This method is called when a form has its tag value method equals to
     * post.
     *
     * @param request
     *            the request send by the client to the server
     * @param response
     *            the response send by the server to the client
     * @throws ServletException
     *             if an error occurred
     * @throws IOException
     *             if an error occurred
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String uploadpath = "";// 定义上传文件地址
        // 实例化一个硬盘文件工厂，用来配置上传组件ServletFileupload
        DiskFileItemFactory factory = new DiskFileItemFactory();
        // 创建处理工具（ServletFileupload对象）
        ServletFileUpload upload = new ServletFileUpload(factory);
        int maxsize = 5 * 1024 * 1024;
        upload.setHeaderEncoding("utf-8");
        List<FileItem> items = null;
        try {// 解析请求
            items = upload.parseRequest(request);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
        Iterator<FileItem> iterator = items.iterator();// 创建列表迭代器
        File uploadFile = new File(request.getSession().getServletContext()
                .getRealPath("/")
                + "upload/");


        uploadpath = uploadFile.getAbsolutePath() + File.separator + uploadpath;
        if (uploadFile.exists() == false) {
            uploadFile.mkdir();
        }
        while (iterator.hasNext()) {
            FileItem item = (FileItem) iterator.next();
            if (!item.isFormField()) {
                String filePath = item.getName(); // 获取源文件路径
                if (filePath != null) {
                    File filename = new File(item.getName());
                }
                if (item.getSize() > maxsize) {
                    out.print("<p align='center'>上传失败，文件大小不得超过5M</p>");
                    break;
                }

                File saveFile = new File(uploadpath,filePath);
                try {
                    item.write(saveFile);
                    out.println("<p align='center'>文件上传成功!!<p>");
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    out.println("<p align='center'>文件上传失败!!<p>");
                }
            }
        }
    }

    /**
     * Initialization of the servlet. <br>
     *
     * @throws ServletException
     *             if an error occurs
     */
    public void init() throws ServletException {
        // Put your code here
    }

}
