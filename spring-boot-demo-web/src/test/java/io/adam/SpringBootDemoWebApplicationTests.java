package io.adam;

import io.adam.bean.Order;
import io.adam.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootDemoWebApplicationTests {
    @Autowired
    private OrderService orderService;
    @Test
    void contextLoads() {
        List<Order> orders = orderService.selectOrderAll();
        System.out.println(orders);
    }

}
