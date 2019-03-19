package com.example.demo.service;

import com.example.demo.model.AyUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Future;

/**
 * 描述：用户服务层接口
 * @author 阿毅
 * @date   2017/10/14
 */
public interface AyUserService {

    AyUser findById(String id);

    List<AyUser> findAll();

    Future<List<AyUser>> findAsynAll();

    AyUser save(AyUser ayUser);

    void delete(String id);

    Page<AyUser> findAll(Pageable pageable);

    List<AyUser> findByName(String name);

    AyUser findByUserName(String name);

    List<AyUser> findByNameLike(String name);

    List<AyUser> findByIdIn(Collection<String> ids);

    AyUser findByNameAndPassword(String name, String password);

    AyUser findByNameAndPasswordRetry(String name, String password);

    boolean update(AyUser ayUser);

    Long findUserTotalNum();
}
