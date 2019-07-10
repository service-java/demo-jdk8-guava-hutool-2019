package com.bee.sample.ch16.service.impl;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bee.sample.ch16.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    Log log = LogFactory.getLog(OrderServiceImpl.class);
    @Autowired
    CuratorFramework zkClient;
    String lockPath = "/lock/order";

    //处理某种订单类型
    public void makeOrderType(String type) {
        String path = lockPath + "/" + type;
        log.info("try do job for " + type);
        try {
            InterProcessMutex lock = new InterProcessMutex(zkClient, path);
            if (lock.acquire(10, TimeUnit.HOURS)) {
                try {

                    //模拟用时5秒
                    Thread.sleep(1000 * 5);
                    log.info("do job " + type + " done");
                } finally {
                    lock.release();
                }

            }
        } catch (Exception ex) {
            //zk异常
            ex.printStackTrace();
        }
    }
}
