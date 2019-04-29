package com.bee.sample.ch10.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bee.sample.ch10.entity.Order;

@RestController
@RequestMapping("/api/v1")
public class OrderApiCrontroller {


    @GetMapping("/order/{orderId}")
    public Order getOrder(@PathVariable String orderId) throws Exception {
        Order order = new Order();
        order.setId("O170501-" + orderId);
        return order;
    }

    @GetMapping("/order")
    public List<Order> getOrder(Integer offset) throws Exception {
        Order order = new Order();
        order.setId("O170501-1");
        List<Order> list = new ArrayList<Order>();
        list.add(order);
        return list;
    }

    @PostMapping("/order")
    public String addOrder(@RequestBody Order order) throws Exception {
        return "{\"success\":true,\"message\":\"添加成功\"}";
    }


    @PostMapping("/orders")
    public String batchAdd(@RequestBody List<Order> order) throws Exception {
        return "{success:true,message:\"批量添加成功\"}";
    }

    @PutMapping("/order")
    public String updateOrder(Order order) throws Exception {
        return "{\"success\":true,\"message\":\"更新成功\"}";
    }


    @DeleteMapping("/order/{orderId}")
    public String cancelOrder(@PathVariable() String orderId) throws Exception {
        return "{\"success\":true,\"message\":\"订单取消成功\"}";
    }

}
