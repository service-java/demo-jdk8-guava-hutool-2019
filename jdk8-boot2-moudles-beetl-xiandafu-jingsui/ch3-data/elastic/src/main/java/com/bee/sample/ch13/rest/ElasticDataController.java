package com.bee.sample.ch13.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bee.sample.ch13.dao.BookDao;
import com.bee.sample.ch13.entity.BookEntity;

@RestController
public class ElasticDataController {

    @Autowired
    BookDao dao;


    @RequestMapping("/springdata/book/{id}")
    public BookEntity getLogById(@PathVariable String id) {
        Optional<BookEntity> opt = dao.findById(id);
        BookEntity book = opt.get();
        return book;
    }

    @RequestMapping("/springdata/search/{key}")
    public List<BookEntity> search(@PathVariable String key) {

        List<BookEntity> list = dao.getByMessage(key);
        return list;
    }


    @RequestMapping("/springdata/search/{key}/{page}")
    public List<BookEntity> search(@PathVariable int page, @PathVariable String key) {
        int numberOfPage = 5;
        PageRequest request = PageRequest.of(page, numberOfPage);
        Page<BookEntity> pages = dao.getByMessage(key, request);
        long total = pages.getTotalElements();
        long totalPage = pages.getTotalPages();
        List<BookEntity> list = pages.getContent();
        return list;
    }


}
