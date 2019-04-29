package Object;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import DBQuery.DataProcess;
import Object.Pageable;


public class News {

	private int id;

	private String title;

	private String content;

	private String time;

	News() {

	}

	News(int id, String title, String content, String time) {
		this.id = id;

		this.title = title;

		this.content = content;

		this.time = time;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTime() {
		return this.time;
	}

	
	public static Vector search(String strSql, int page) throws Exception {

		Vector Items = new Vector();

		Connection con = DataProcess.getConnection();

		PreparedStatement pStmt = null;

		ResultSet rs = null;

		try {
			pStmt = con.prepareStatement(strSql,
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			rs = pStmt.executeQuery();

			Pageable pgb = new Pageable(rs);

			pgb.setPageSize(5);

			pgb.gotoPage(page);

			rs.absolute(pgb.getRowsCount());

			int i = 0;
            System.out.println("page===="+page);
            if(rs!=null&&!rs.wasNull()){
            do{
            	 
            	if(pgb!=null&& pgb.getCurrentPageRowsCount()!=0){
						String iid = rs.getString("id");
						// int id=rs.getInt("id");
						String title = rs.getString("title");
						String content = rs.getString("content");
						String dateTime = rs.getString("datetime");
						Items.add(new News(Integer.parseInt(iid), title,content, dateTime));
				 
					i++;
            	}
				 
            }while (rs.next() && i < pgb.getCurrentPageRowsCount());
            }

			return Items;

		} finally {
			try {
				rs.close();
				pStmt.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static News getNews(int ID) {
		String selectStr = "select * from news where id=" + ID;

		Connection con = DataProcess.getConnection();

		News news = new News();

		try {

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(selectStr);

			if (rs.next()) {
				String title = rs.getString("title");

				String content = rs.getString("content");

				String time = rs.getString("datetime");

				news.setId(ID);

				news.setTitle(title);

				news.setContent(content);

				news.setTime(time);
			}

			rs.close();

			stmt.close();

			con.close();

			return news;

		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}
	}
}
