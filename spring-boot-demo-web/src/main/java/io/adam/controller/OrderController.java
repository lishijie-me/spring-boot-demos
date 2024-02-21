package io.adam.controller;

import io.adam.bean.Order;
import io.adam.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author : 成行(lishijie-me)
 * @version : v1.0
 * @createTime : 2024/2/3 19:32
 * @description : 一句话描述该类的功能
 */
@RequestMapping("/order")
@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/selectOrderAll")
    public String selectOrderAll(Model model){
        List<Order> orders = orderService.selectOrderAll();
        model.addAttribute("orders", orders);
        System.out.println("订单列表为："+orders);
        return "orderList";
    }

    @RequestMapping("/insertPage")
    public String insert(){
        // 跳转到指定页面
        return "insertPage";
    }

    @RequestMapping("/insert")
    public String addOrder(Order order){
        Integer i = orderService.addOrder(order);
        // 跳转到指定页面
        return "redirect:/selectOrderAll";
    }

    @RequestMapping("/updatePage/{id}")
    public String updateOrder(Model model, @PathVariable Long id){
        Order order = orderService.selectOrderById(id);
        model.addAttribute("order", order);
        // 跳转到指定页面
        return "updatePage";
    }

    @RequestMapping("/update")
    public String updateOrder(Order order){
        Integer i = orderService.updateOrder(order);
        System.out.println("修改订单信息为"+order);
        // 跳转到指定页面
        return "redirect:/selectOrderAll";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        orderService.deleteOrder(id);
        return "redirect:/selectOrderAll";
    }
}
