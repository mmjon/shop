package com.shop.constroller;

import com.shop.pojo.Order;
import com.shop.service.OrderService;
import com.shop.util.ResultJSON;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Insight
 * @Description: TODO
 * @Date: 2024/12/12 17:51
 * @Version: 1.0
 */

@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrderMapperController {
    @Resource
    private OrderService orderService;
    @RequestMapping("/addorder")
    public ResultJSON addOrder(Order order) {
        return orderService.addOrder(order);
    }
}
