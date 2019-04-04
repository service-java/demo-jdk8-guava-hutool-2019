package com.itzcn.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.itzcn.dao.AdminDao;
import com.itzcn.entity.Admin;

public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao {

	public List<Admin> findAllAdmin() {
		String hql = "from Admin admin order by adminId";
		return (List<Admin>) this.getHibernateTemplate().find(hql);
	}

	public List<Admin> findByAdminUserNameAndPwd(String adminUserName,
			String adminUserPwd) {
		String hql = "from Admin admin where adminUserName ='"+ adminUserName +"' and adminUserPwd='" +
				adminUserPwd + " ' order by adminId";
		return (List<Admin>) this.getHibernateTemplate().find(hql);
	}

	public Admin findByAdminId(Integer adminId) {
		Admin admin = (Admin) this.getHibernateTemplate().get(Admin.class, adminId);
		return admin;
	}

}
