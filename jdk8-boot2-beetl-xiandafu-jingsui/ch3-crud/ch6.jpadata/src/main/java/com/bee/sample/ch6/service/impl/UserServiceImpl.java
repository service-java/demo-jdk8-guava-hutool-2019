package com.bee.sample.ch6.service.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.bee.sample.ch6.repository.UserRepository;
import com.bee.sample.ch6.entity.Department;
import com.bee.sample.ch6.entity.User;
import com.bee.sample.ch6.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userDao;

    @Autowired
    EntityManager em;

    public void updateUser() {
//		int id = 1;
//		User user = em.find(User.class, 1);
//		user.setName("haha");

        User user = new User();
        user.setId(1);
        user.setName("hhaancd");
        em.merge(user);
    }

    public User findUser(int id) {
        Optional<User> user = userDao.findById(id);
        return user.orElse(null);
    }

    public Integer addUser(User user) {
//        userDao.save(user);
//        user.setName("新建" + user.getName());
        userDao.save(user);
        return user.getId();
    }

    public List<User> getAllUser(int page, int size) {
        PageRequest pageable = PageRequest.of(page, size);
        Page<User> pageObject = userDao.findAll(pageable);
        int totalPage = pageObject.getTotalPages();
        int realSize = pageObject.getSize();
        long count = pageObject.getTotalElements();

        return pageObject.getContent();
    }

    public User getUser(String name) {
        return userDao.findByName(name);
    }

    public User getUser(String name, Integer departmentId) {
//		getUser(departmentId);
        return userDao.nativeQuery2(name, departmentId);
//		return userDao.findUserByDepartment(name, departmentId);
    }

    private void getUser(Integer departmentId) {
        List<Object[]> list = userDao.queryUserCount();
        List<Integer> ids = userDao.queryUserIds(departmentId);
        int a = 1;
    }

    public Page<User> queryUser(Integer departmentId, Pageable page) {
        return userDao.queryUsers(departmentId, page);
    }

    public Page<User> queryUser2(Integer departmentId, Pageable page) {
        //构造JPQL和实际的参数
        StringBuilder baseJpql = new StringBuilder("from User u where 1=1 ");
        Map<String, Object> paras = new HashMap<String, Object>();
        if (departmentId != null) {
            baseJpql.append("and  u.department.id=:deptId");
            paras.put("deptId", departmentId);
        }
        //查询满足条件的总数
        long count = getQueryCount(baseJpql, paras);
        if (count == 0) {
            return new PageImpl(Collections.emptyList(), page, 0);
        }
        //查询满足条件结果集
        List list = getQueryResult(baseJpql, paras, page);


        //返回结果
        Page ret = new PageImpl(list, page, count);
        return ret;
    }

    public List<User> getByExample(String name) {
        User user = new User();
        Department dept = new Department();
        user.setName(name);
        dept.setId(1);
        user.setDepartment(dept);
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("name", GenericPropertyMatchers.startsWith().ignoreCase());
        Example<User> example = Example.of(user, matcher);
//		Example<User> example = Example.of(user);
        List<User> list = userDao.findAll(example);
        return list;
    }

    private List getQueryResult(StringBuilder baseJpql, Map<String, Object> paras, Pageable page) {
        Query query = em.createQuery("select u " + baseJpql.toString());
        setQueryParameter(query, paras);
        query.setFirstResult((int) page.getOffset());
        query.setMaxResults(page.getPageNumber());
        List list = query.getResultList();
        return list;
    }

    private Long getQueryCount(StringBuilder baseJpql, Map<String, Object> paras) {
        Query query = em.createQuery("select count(1) " + baseJpql.toString());
        setQueryParameter(query, paras);
        Number number = (Number) query.getSingleResult();
        return number.longValue();
    }

    private void setQueryParameter(Query query, Map<String, Object> paras) {
        for (Entry<String, Object> entry : paras.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
    }

}
