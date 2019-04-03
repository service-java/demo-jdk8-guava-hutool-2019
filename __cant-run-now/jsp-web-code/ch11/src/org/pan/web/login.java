package org.pan.web;

import java.sql.*;
import org.pan.util.*;



public class login extends DataBase {
	private String username;	//登录用户名
	private String passwd;		//登录密码
	private boolean isadmin;	//是否管理员登录
	private long userid=0;		//用户ID号
	
	
	public login() throws Exception{
		super();
		username = "";
		passwd = "";
		isadmin =false;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String newusername) {
		username = newusername;
	}

	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String newpasswd) {
		passwd = newpasswd;
	}

	public boolean getIsadmin() {
		return isadmin;
	}
	public void setIsadmin(boolean newIsadmin) {
		isadmin = newIsadmin;
	}
	
	public long getUserid() {
		return userid;
	}

	public void setUserid (long uid) {
		userid = uid;
	}

	public String getSql() {
		if (isadmin) {
			sqlStr = "select * from my_GoodsAdminuser where adminuser = '" + strFormat.toSql(username) + "' and adminpass = '" + strFormat.toSql(passwd) + "'";
			
		}else {
			sqlStr = "select * from my_users where username = '" + strFormat.toSql(username) + "' and password = '" + strFormat.toSql(passwd) + "'";
		}
		return sqlStr;
	}

	public boolean excute() throws Exception {
		boolean flag = false;
		rs = stmt.executeQuery(getSql());
		if (rs.next()){
			if (!isadmin)
			{
				userid = rs.getLong("Id");
			}			
			flag = true;
		}
		rs.close();
		close();
		return flag;		
	}
};

