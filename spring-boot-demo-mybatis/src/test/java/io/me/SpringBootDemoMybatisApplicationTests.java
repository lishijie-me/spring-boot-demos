package io.me;

import io.me.bean.Order;
import io.me.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootDemoMybatisApplicationTests {

    @Autowired
    private OrderService orderService;

    @Test
    void contextLoads() {
        List<Order> orders = orderService.selectOrderAll();
        System.out.println(orders);
    }

}
