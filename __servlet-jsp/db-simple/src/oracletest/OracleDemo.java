package oracletest;

import mysqltest.GetConn;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDemo {

    public Connection conn = null; // 创建Connection对象

    public Connection getConnection() { // 获取数据库连接方?
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); // 加载数据库驱?
            String url = "jdbc:oracle:thin:@localhost:1521:orcl"; // 指定连接数据库的URL
            String user = "system"; // 指定连接数据库的用户?
            String passWord = "justice"; // 指定连接数据库的密码
            conn = DriverManager.getConnection(url, user, passWord);
            if (conn != null) { // 如果Connection实例不为?
                System.out.println("数据库连接成?"); // 提示信息
            }
        } catch (Exception e) {
            e.printStackTrace();
        } // 异常处理
        return conn; // 返回Connection对象
    }

    public static void main(String[] args) { // 程序主方?
        GetConn getConn = new GetConn(); // 创建GetConn对象
        getConn.getConnection(); // 调用连接数据库方?
    }
}
