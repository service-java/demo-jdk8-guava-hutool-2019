package util;

import java.security.MessageDigest;

public class MD5ConvertHelper {
    public static String md5(String pwd) throws Exception {

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(pwd.getBytes()); // byte
        byte byteData[] = md.digest(); // 消化byte

        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            String hex = Integer.toHexString(0xff & byteData[i]);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }

        return hexString.toString();
    }
}
