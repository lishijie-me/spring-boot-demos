package io.adam.mapper;

import io.adam.bean.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author : 成行(lishijie-me)
 * @version : v1.0
 * @createTime : 2024/1/18 20:05
 * @description : 一句话描述该类的功能
 */
@Mapper
public interface OrderMapper {
    List<Order> selectOrderAll();

    Integer addOrder(Order order);
}
