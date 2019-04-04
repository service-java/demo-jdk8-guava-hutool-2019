package com.itzcn.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AddUserDao extends JdbcDaoSupport{
	
	public void addUser(User user){
		String sql = "insert into info(id,name,pass) values('" 
	+user.getId()+ "','" + user.getName() +"','" + user.getPass() +"')";
		
		getJdbcTemplate().execute(sql);//Ö´ÐÐSQL
		getJdbcTemplate().execute(sql);//Ö´ÐÐSQL
	}

}
