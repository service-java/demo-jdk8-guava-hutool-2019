package www.itzcn;

import java.sql.*;

public class testConnection {

	public static Connection conn() {
		Connection connection=null;
		try {
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver); // 加载驱动
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.print("驱动加载失败");
		}
		try {
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/dbd_book", "root", "123456"); // 获取连接
			System.out.println("数据库连接成功!");
			// connection.close(); //关闭连接，释放资源
		} catch (Exception e) {
			System.out.println("数据库连接失败!<br/>");
			System.out.print("错误信息：" + e.toString());
		}
		return connection;

	}
	public static void main(String[] args) {
		
		System.out.print(conn());
		
		
	}

}
