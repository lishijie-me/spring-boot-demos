package io.adam.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @author : 成行(lishijie-me)
 * @version : v1.0
 * @createTime : 2024/1/18 20:55
 * @description : 订单实体类
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Order {
    /**
     * id
     * */
    private Long id;
    /**
     * 用户ID
     * */
    private Long userId;
    /**
     * 用户名称
     * */
    private String userName;
    /**
     * 联系电话
     * */
    private String phone;
    /**
     * 地址
     * */
    private String address;
    /**
     * 商品总价
     * */
    private BigDecimal totalPrice;
}
