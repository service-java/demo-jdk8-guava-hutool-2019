package org.pan.web;

import java.sql.*;
import java.util.Vector;
import org.pan.util.*;
import org.pan.web.book.goodsclass;



public class goodsclasslist extends DataBase {
	private Vector classlist;		//图书类别向量数组
	
	public goodsclasslist() throws Exception{
		super();
	}

	public Vector getClasslist() {
		return classlist;
	}
	
	public String getSql() {
		sqlStr = "select id,classname from my_Goodsclass order by id";
		return sqlStr;
	}

	public boolean excute() throws Exception {
		int id = 0;
		String classname = "";
		int rscount = 0;
		try {
			rs = stmt.executeQuery(getSql());
			rscount = stmt.getMaxRows();
			classlist = new Vector(rscount+1);
			classlist.clear();
			while (rs.next()){				
				id = rs.getInt("id");
				classname = rs.getString("classname");
				goodsclass bc = new goodsclass(id,classname);
				classlist.addElement(bc);
			}
			rs.close();
			return true;
		}
		catch (SQLException sqle){
			System.out.println(sqle);
            return false;
		}
	}
};

