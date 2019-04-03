package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entity.Message;
import entity.User;

public class MessageDao {
	Connection conn = null;
	PreparedStatement pre = null;
	ResultSet res = null;

	// 得到消息的集合
	public List<Message> meList() {
		List<Message> meList = new ArrayList<Message>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/message", "root", "123456");
			String sql = "select * from message_info,user_info where message_info.user_id=user_info.user_id";
			pre = conn.prepareStatement(sql);
			res = pre.executeQuery();
			while (res.next()) {
				Message message = new Message();
				message.setMessage_content(res.getString("message_content"));
				message.setMessage_id(res.getInt("message_id"));
				message.setMessage_time(res.getString("message_time"));
				User user = new User();
				user.setUser_account(res.getString("user_account"));
				user.setUser_id(res.getInt("user_id"));
				user.setUser_pwd(res.getString("user_pwd"));
				message.setUser(user);
				meList.add(message);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return meList;
	}

	public int addMessage(Message message) {
		int i = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/message", "root", "123456");
			String sql = "insert into message_info(user_id,message_content,message_time) values(?,?,?)";
			pre = conn.prepareStatement(sql);
			pre.setInt(1, message.getUser().getUser_id());
			pre.setString(2, message.getMessage_content());
			pre.setString(3, message.getMessage_time());
			i = pre.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public static void main(String[] args) {
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	System.out.println(sdf.format(new Date()));

	}

}
