package com.bee.sample.ch3.entity.form;

import java.util.List;

import com.bee.sample.ch3.entity.Order;
import com.bee.sample.ch3.entity.OrderDetail;
import lombok.Data;

@Data
public class OrderPostForm {
    public Order order;
    public List<OrderDetail> details;
}
