package _file;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.io.*;


public class FileStreamDemo {

    @Test
    public void writeAndRead() {

        try {
            // 文件乱码
            byte bWrite[] = {11, 21, 3, 40, 5};
            OutputStream os = new FileOutputStream("test.txt");

            // writes the bytes
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]);
            }
            os.close();


            InputStream is = new FileInputStream("test.txt");
            int size = is.available();
            for (int i = 0; i < size; i++) {
                Console.log(is.read());
            }
            is.close();

        } catch (IOException e) {
            Console.log("Exception");
        }
    }

    @Test
    public void writeTextAndRead() throws IOException {

        // 构建FileOutputStream对象,
        // 文件不存在会自动新建
        File f = new File("a.txt");
        FileOutputStream fop = new FileOutputStream(f);

        // 构建OutputStreamWriter对象,
        // 参数可以指定编码,
        // 默认为操作系统默认编码,
        // windows上是gbk
        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");

        // 写入内容
        writer.append("中文输入");
        writer.append("\r\n");

        // 刷新缓存冲,写入到文件,
        // 如果下面已经没有写入的内容了,直接close也会写入
        writer.append("English");


        //关闭写入流, 同时会把缓冲区内容写入文件, 所以上面的注释掉
        writer.close();
        // 关闭输出流,释放系统资源
        fop.close();

        // 构建FileInputStream对象
        FileInputStream fip = new FileInputStream(f);
        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");

        // 构建InputStreamReader对象,编码与写入相同
        StringBuffer sb = new StringBuffer();

        // 转成char加到StringBuffer对象中
        while (reader.ready()) {
            sb.append((char) reader.read());
        }

        System.out.println(sb.toString());
        // 关闭读取流
        reader.close();

        // 关闭输入流,释放系统资源
        fip.close();
    }
}
