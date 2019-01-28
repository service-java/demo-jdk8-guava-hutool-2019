package _collections.str;

import java.io.UnsupportedEncodingException;

/**
 * 利用getBytes()函数实现加解密
 *
 * @author Luo_0412
 */
public class DemoGetBytes {
    /**
     * 主方法
     *
     * @param args
     */
    public static void main(String[] args) {
        // string with numbers and some special characters
        String str = "今生今世UI￥#";
        byte[] str_bytes = null;
        byte[] tmp = null;
        byte[] bytesISO8859 = null;

        try {
            // byte array with charset
            str_bytes = str.getBytes("UTF-8");
            displayBytes(str_bytes);
            System.out.println("返回值：" + str_bytes + "\n");

            // GBK等其他编码
            str_bytes = str.getBytes("GBK");
//		    str_bytes = str.getBytes( "ISO-8859-1" );
            System.out.println("返回值：" + str_bytes + "\n");

            // 加密处理
            tmp = progressBytes(str_bytes);
            System.out.println("加密后字符串：" +
                    new String(tmp, "ISO8859-1") + "\n");

            // 编码转化
            String s_iso88591 = new String(str.getBytes("UTF-8"), "ISO8859-1"); // 加密
            String s_utf8 = new String(s_iso88591.getBytes("ISO8859-1"), "UTF-8"); // 解密

            System.out.println("密文： " + s_iso88591);
            System.out.println("明文：  " + s_utf8);
            System.out.println();
        } catch (UnsupportedEncodingException e) {
            System.out.println("don't support this charset");
        }


        try {
            bytesISO8859 = str.getBytes("iso-8859-1");
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("bytes is:     " + arrayToString(bytesISO8859));
        System.out.println("hex format is:" + encodeHex(bytesISO8859));
    }

    /**
     * 展示字节数组
     *
     * @param bstr
     */
    public static void displayBytes(byte[] bstr) {
        // prints the byte array
        for (int i = 0; i < bstr.length; i++) {
            System.out.print(bstr[i] + " ");
        }
        System.out.println("\nend");
    }

    /**
     * 加密处理byte数组
     *
     * @param bstr
     * @return
     */
    public static byte[] progressBytes(byte[] bstr) {
        for (int i = 0, len = bstr.length; i < len; i++) {
            bstr[i] ^= 110;// 对数组中每个元素进行异或运算
        }
        return bstr;
    }

    /**
     * 转化成十六进制
     *
     * @param bytes
     * @return
     */
    public static final String encodeHex(byte[] bytes) {
        StringBuffer buff = new StringBuffer(bytes.length * 2); // 字节转化??
        String b;
        for (int i = 0, len = bytes.length; i < len; i++) {
            b = Integer.toHexString(bytes[i]);
            // byte是两个字节的,而上面的Integer.toHexString会把字节扩展为4个字节
            buff.append(b.length() > 2 ? b.substring(6, 8) : b);
            buff.append(" ");
        }
        return buff.toString();
    }

    /**
     * 数组转化成字符串
     *
     * @param bytes
     * @return
     */
    public static final String arrayToString(byte[] bytes) {
        StringBuffer buff = new StringBuffer();
        for (int i = 0, len = bytes.length; i < len; i++) {
            buff.append(bytes[i] + " ");
        }
        return buff.toString();  // StringBuffer对象转化成String
    }

}
