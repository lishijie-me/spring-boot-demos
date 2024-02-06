package io.adam;

import io.adam.bean.Order;
import io.adam.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class SpringBootDemoWebApplicationTests {
    @Autowired
    private OrderService orderService;
    @Test
    void selectOrderAll() {
        List<Order> orders = orderService.selectOrderAll();
        System.out.println("List 查询成功"+orders);
    }

    @Test
    void selectOrderById() {
        Order order = orderService.selectOrderById(10L);
        System.out.println("根据ID查询成功"+order);
    }

    @Test
    void addOrder() {
        Order order = new Order(3L, "成行", "021-8888", "上海市人民大道201号", new BigDecimal("199"));
        System.out.println("请求参数" + order);
        Integer m = orderService.addOrder(order);

        System.out.println("新增成功"+m);
    }

    @Test
    void updateOrder() {
        Integer k = orderService.updateOrder(new Order(15L,3L, "成行", "021-9999", "上海市人民大道201号", new BigDecimal("199")));
        System.out.println("更新成功"+k);
    }

    @Test
    void deleteOrder() {
        Integer i = orderService.deleteOrder(15L);
        System.out.println("删除成功"+i);
    }

}
