package io.adam.service;

import io.adam.bean.Order;

import java.util.List;

/**
 * @author : 成行(lishijie-me)
 * @version : v1.0
 * @createTime : 2024/1/18 21:32
 * @description : 订单service层接口
 */
public interface OrderService {
    List<Order> selectOrderAll();
    Order selectOrderById(Long id);

    Integer addOrder(Order order);

    Integer updateOrder(Order order);

    Integer deleteOrder(Long id);
}
