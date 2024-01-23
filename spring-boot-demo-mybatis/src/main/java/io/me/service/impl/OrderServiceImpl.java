package io.me.service.impl;

import io.me.bean.Order;
import io.me.mapper.OrderMapper;
import io.me.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : 成行(lishijie-me)
 * @version : v1.0
 * @createTime : 2024/1/18 21:32
 * @description : 订单service层实现类
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<Order> selectOrderAll() {
        return orderMapper.selectOrderAll();
    }
}
