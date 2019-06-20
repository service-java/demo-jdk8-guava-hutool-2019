package util;

public class LoginStatusHelper {
    static String userName = "";

    public static void setUserName(String name) {
        userName = name;
    }

    public static String getUserName() {
        return userName;
    }
}
