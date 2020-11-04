package _ch1_file;

import org.junit.Test;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.net.URL;
import java.util.Date;

/**
 * 文件操作有关的演示
 *
 * @author Luo_0412
 */
public class FileBasicsDemo {

    @Test
    public void createDir() {
        String dirname = "d:/tmp/user2222/java/bin";

        File d = new File(dirname);
        // 现在创建目录
        if (!d.exists()) {
            d.mkdirs();
        }
    }

    @Test
    public void catchUrl() throws IOException {
        URL url = new URL("http://www.w3cschool.cc");
        InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
        BufferedReader reader = new BufferedReader(inputStreamReader);
        FileWriter fileWriter = new FileWriter("data.html");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        reader.close();
        bufferedWriter.close();
    }

    @Test
    public void listDir() {
        String dirname = "d:/tmp";
        File file = new File(dirname);

        if (file.isDirectory()) {
            System.out.println("遍历文件夹 " + dirname + " 的第一层 -> ");
            String s[] = file.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println("目录: " + s[i]);
                } else {
                    System.out.println("文件: " + s[i]);
                }
            }

        } else {
            System.out.println(dirname + " 不是文件夹");
        }
    }


    /**
     * 文件创建与删除的切换
     * 文件存在则删除，不存在则创建
     *
     * @param file
     */
    public static void createFile(File file) {
        if (file.exists()) {
            String name = file.getName(); // 获取文件名称
            long length = file.length(); // 获取文件长度
            boolean hidden = file.isHidden(); // 判断文件是否是隐藏文件
            System.out.println("文件名称：" + name); // 输出信息
            System.out.println("文件长度是：" + length);
            System.out.println("该文件是隐藏文件吗？" + hidden);
//            file.delete();
//            System.out.println("文件已删除");
        } else {
            try { // 捕捉可能出现的异常
                file.createNewFile();
                System.out.println("文件已创建");
            } catch (IOException e) { // catch处理该异常
                e.printStackTrace(); // 输出异常信息
            }
        }
    }

    /**
     * 编辑文件内容
     *
     * @param out
     * @param file
     * @param txtContent
     */
    public static void editTxt(File file, FileOutputStream out, String txtContent) {
        try {
            out = new FileOutputStream(file);// 创建FileOutputStream对象
            out.write(txtContent.getBytes());// 将数组中信息写入到文件中
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace(); // 输出异常信息
        } finally {
            // 如果输出流存在
            if (out != null) {
                try {
                    out.close();// 将流关闭
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 输出文件信息
     *
     * @param file
     * @param in
     */
    public static void printTxtInfo(File file, FileInputStream in) {
        try {
            in = new FileInputStream(file);
            byte[] content = new byte[1024]; // 创建byte数组
            int length = in.read(content); // 从文件中读取信息
            System.out.println("文件中的信息是：" + new String(content, 0, length)); // 将文件中信息输出
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();// 输出异常信息
        } finally {
            if (in != null) {
                try {
                    in.close();// 关闭流
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 主方法
     *
     */
    @Test
    public void main() {
        String filePath = "d:/tmp";

        String fileName = "test.txt";
        String txtContent = "[info]\n" +
                "date=16:51 2019/03/27\n" +
                "ForeGroundUrl = http://pmpub.pinming.cn/app_background/ss5/index.zip";

        FileInputStream in = null;
        FileOutputStream out = null;

        File file = new File(filePath, fileName); // 创建文件对象
        createFile(file); // 创建实体文件
        editTxt(file, out, txtContent); // 文件中添加信息

        printTxtInfo(file, in); // 输出文件信息

    }

    @Test
    public void simple() {
        File file = new File("E:/myword", "work.txt"); // 创建文件对象
        FileOutputStream fos = null;
        FileInputStream fis = null;
        DataOutputStream dos = null;
        DataInputStream dis = null;


        try {
            fos = new FileOutputStream(file);// 创建FileOutputStream对象
            dos = new DataOutputStream(fos);// 创建DataOutputStream对象
            dos.writeUTF("明日科技");// 将字符串信息写入到文件中
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {// catch语句处理异常信息
            e.printStackTrace();// 输出异常信息
        } finally {
            if (dos != null) {
                try {
                    dos.close();// 将流关闭
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();// 将流关闭
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            fis = new FileInputStream(file);// 创建FileInputStream对象
            dis = new DataInputStream(fis);// 创建DataInputStream对象

            System.out.println("文件中的信息是：" + dis.readUTF());// 将文件中信息输出
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (dis != null) {
                try {
                    dis.close();// 将流关闭
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();// 将流关闭
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Test
    public void demo() throws ClassNotFoundException {
        String filePath = "d:/tmp";
        String fileName = "test.dat";

        int[] arr = {1, 2, 3, 4, 5};
        double pi = 3.14159;
        Date date = new Date();
        File file = new File(filePath, fileName); // 创建文件对象
        FileOutputStream fos = null;
        FileInputStream fis = null;
        DataOutputStream dos = null;
        ObjectOutputStream objOut = null;
        ObjectInputStream objIn = null;
        DataInputStream dis = null;


        try {
            fos = new FileOutputStream(file);// 创建FileOutputStream对象

            dos = new DataOutputStream(fos);// 创建DataOutputStream对象
            objOut = new ObjectOutputStream(fos);
            objOut.writeObject(date);
            dos.writeDouble(pi);


            for (int i = 0, len = arr.length; i < len; i++) {
                dos.writeInt(arr[i]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {// catch语句处理异常信息
            e.printStackTrace();// 输出异常信息
        } finally {
            if (dos != null) {
                try {
                    dos.close();// 将流关闭
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();// 将流关闭
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        try {
            fis = new FileInputStream(file); // 文件输入流
            objIn = new ObjectInputStream(fis); // 对象输入数据流
            dis = new DataInputStream(fis); // 数据输入流

            System.out.println("对象是：" + objIn.readObject());// 将文件中信息输出
            System.out.println("double是：" + dis.readDouble());// 将文件中信息输出

            for (int i = 0, len = arr.length; i < len; i++) {
                System.out.println("arr[" + i + "] : " + dis.readInt());// 将文件中信息输出
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dis != null) {
                try {
                    dis.close();// 将流关闭
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();// 将流关闭
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Test
    public void h () {
        try {
            FileInputStream fileInputStream = new FileInputStream(ResourceUtils.getFile(ResourceUtils.CLASSPATH_URL_PREFIX + "excelTemplate"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
