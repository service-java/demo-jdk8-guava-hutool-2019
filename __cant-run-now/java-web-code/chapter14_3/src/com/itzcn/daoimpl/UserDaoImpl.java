package com.itzcn.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.itzcn.dao.User;
import com.itzcn.dao.UserDao;

public class UserDaoImpl implements UserDao {
	private DataSource dataSource;
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public int addUser(User user) throws SQLException {
		
		Connection conn = null;
		PreparedStatement pst = null;
		conn = dataSource.getConnection();
		String sql = "insert into info(id,name,pass) values(?,?,?)";
		pst = conn.prepareStatement(sql);
		pst.setInt(1, user.getId());
		pst.setString(2, user.getName());
		pst.setString(3, user.getPass());
		int param = -1;
		param = pst.executeUpdate();
		return param;

	}

}
