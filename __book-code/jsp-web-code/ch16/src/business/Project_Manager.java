
package business;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import DBQuery.DataProcess;
import Object.Project;

public class Project_Manager {

	public static void Add_Project(String name, String info, String time) {

		String query = "insert into project(name,info,time) values('" + name
				+ "','" + info + "','" + time + "')";

		try {
			DataProcess.ExeQuery(query);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

	public static void Edit_Project(int id, String name, String info,
			String time) {


		String query = "update project set name='" + name + "',info='" + info
				+ "',time='" + time + "' where id=" + id;

		try {
			DataProcess.ExeQuery(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public static void Delete_Project(int id) {
		String query = "delete from project where id=" + id;

		try {
			DataProcess.ExeQuery(query);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	

	public static Project getProject(int ID) {
		String selectStr = "select * from project where id=" + ID;

		Connection con = DataProcess.getConnection();

		Project pro = Project.getInstance();

		try {

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(selectStr);

			if (rs.next()) {
				String name = rs.getString("name");

				String info = rs.getString("info");

				String time = rs.getString("time");

				pro.setId(ID);

				pro.setName(name);

				pro.setInfo(info);

				pro.setTime(time);
			}

			rs.close();

			stmt.close();

			con.close();

			return pro;

		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}
	}

	
	
	public static ArrayList getProjectList() {
		String query = "select * from project";

		Connection con = DataProcess.getConnection();

		ArrayList pl = new ArrayList();

		try {

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				int ID = rs.getInt("id");

				String name = rs.getString("name");

				String info = rs.getString("info");

				String time = rs.getString("time");

				Project pro = Project.getInstance();

				pro.setId(ID);

				pro.setName(name);

				pro.setInfo(info);

				pro.setTime(time);

				pl.add(pro);
			}

			rs.close();

			stmt.close();

			con.close();

			return pl;

		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}

	}

}
