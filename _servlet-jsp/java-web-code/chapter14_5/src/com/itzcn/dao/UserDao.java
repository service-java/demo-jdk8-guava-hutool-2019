package com.itzcn.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDao extends HibernateDaoSupport {
	
	public void insert(Info info){
		this.getHibernateTemplate().save(info);
	}

}
