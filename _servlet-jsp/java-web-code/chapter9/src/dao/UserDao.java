package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entity.User;

public class UserDao {
	Connection conn = null;
	PreparedStatement pre = null;
	ResultSet res = null;

	//根据用户名和密码来查询用户信息
	public User getUser(String account, String pwd) {

		User user = new User();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(	"jdbc:mysql://localhost:3306/message", "root", "123456");
			String sql = "select * from user_info where user_account=? and user_pwd=?";
			pre = conn.prepareStatement(sql);
			pre.setString(1, account);
			pre.setString(2, pwd);
			res = pre.executeQuery();
			while (res.next()) {
				user.setUser_account(res.getString("user_account"));
				user.setUser_id(res.getInt("user_id"));
				user.setUser_pwd(res.getString("user_pwd"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

}
