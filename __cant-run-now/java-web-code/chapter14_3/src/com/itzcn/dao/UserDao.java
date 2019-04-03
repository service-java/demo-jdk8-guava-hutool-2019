package com.itzcn.dao;

import java.sql.SQLException;

public interface UserDao {
	
	public int addUser(User user) throws SQLException;//添加用户信息

}
