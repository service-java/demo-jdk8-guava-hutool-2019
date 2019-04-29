package business ;
import java.sql.*;
import java.sql.Statement;
import java.util.ArrayList;

import DBQuery.DataProcess;
import Object.Manager;

public class Admin_Manager {

	public static boolean CheckAdmin(String username, String password) {
		String query = "select count(*) from admin where admin.name='"
				+ username + "' and admin.password='" + password + "'";

		int count = DataProcess.nCount(query);

		if (count > 0) {
			return true;
		} else
			return false;
	}

	
	public static boolean HasAdmin(String username) {
		String query = "select count(*) from admin where admin.name='"
				+ username + "'";

		int count = DataProcess.nCount(query);

		if (count > 0) {
			return true;
		} else
			return false;
	}

	
	public static void add_Admin(String username, String password) {

		String query = "insert into admin(admin.name,admin.password) values('"
				+ username + "','" + password + "')";

		try {
			DataProcess.ExeQuery(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void Edit_Admin(String username, String password) {
		String query = "update admin set admin.password='" + password
				+ "' where admin.name='" + username + "'";

		try {
			DataProcess.ExeQuery(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public static void Delete_Admin(String username) {
		String query = "delete from admin where admin.name='" + username + "'";
		System.out.println(query);
		try {
			DataProcess.ExeQuery(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public static Manager getManager(String username) {
		String selectStr = "select * from admin where admin.name='" + username
				+ "'";

		Connection con = DataProcess.getConnection();

		Manager ma = Manager.getInstance();

		try {

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(selectStr);

			if (rs.next()) {
				String password = rs.getString("admin.password");

				ma.setUsername(username);

				ma.setPassword(password);
			}

			rs.close();

			stmt.close();

			con.close();

			return ma;

		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}
	}

	
	public static ArrayList getManagerList() {
		String query = "select * from admin";

		Connection con = DataProcess.getConnection();

		ArrayList al = new ArrayList();

		try {

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				String username = rs.getString("admin.name");

				String password = rs.getString("admin.password");

				Manager ma = Manager.getInstance();

				ma.setUsername(username);

				ma.setPassword(password);

				al.add(ma);
			}

			rs.close();

			stmt.close();

			con.close();

			return al;

		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}

	}

}
