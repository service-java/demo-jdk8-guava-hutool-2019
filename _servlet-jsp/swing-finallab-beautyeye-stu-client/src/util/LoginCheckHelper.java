package util;

import db.MySQLDBHelper;

public class LoginCheckHelper {

    public static boolean authenticate(String username, String password) {
        String dbPwd = "";

        try {

            MySQLDBHelper mysqlHelper = new MySQLDBHelper();
            mysqlHelper.queryDB("Select user_pwd From user Where user_name = '" + username + "'");

            if (mysqlHelper.getTableData().length == 0) {
                System.out.println(username + "账号不存在");
                return false;
            } else {

                mysqlHelper.queryDB("Select user_pwd From user Where user_name = '" + username + "'");
                dbPwd = mysqlHelper.getTableData()[0][0];

                System.out.println(MD5ConvertHelper.md5(username + MD5ConvertHelper.md5(password)));
                if (MD5ConvertHelper.md5(username + MD5ConvertHelper.md5(password)).equals(dbPwd)) {
                    LoginStatusHelper.setUserName(username);
                    return true;
                } else {
                    return false;
                }
            }

        } catch (Exception e) {

        }
        return false;
    }
}
