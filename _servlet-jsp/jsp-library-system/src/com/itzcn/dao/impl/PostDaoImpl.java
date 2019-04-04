package com.itzcn.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.itzcn.dao.PostDao;
import com.itzcn.entity.Post;

public class PostDaoImpl extends HibernateDaoSupport implements PostDao {

	public void insertPost(Post post) {
		this.getHibernateTemplate().save(post);
	}

	public void upPost(Post post) {
		this.getHibernateTemplate().update(post);
	}

	public void delPost(Post post) {
		this.getHibernateTemplate().delete(post);
	}

	public List<Post> findAllPost() {
		String hql = "from Post post order by post.postId";
		return (List<Post>) this.getHibernateTemplate().find(hql);
	}

	public Post findByPostId(Integer postId) {
		Post post = (Post) this.getHibernateTemplate().get(Post.class, postId);
		return post;
	}

	public List<Post> findByPostName(String postName) {
		String hql = "from Post post where postName ='" +
				postName +"' order by post.postId";
		return (List<Post>) this.getHibernateTemplate().find(hql);
	}
}
