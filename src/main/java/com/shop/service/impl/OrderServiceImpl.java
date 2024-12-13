package com.shop.service.impl;

import com.shop.mapper.OrderMapper;
import com.shop.pojo.Order;
import com.shop.service.OrderService;
import com.shop.util.ResultJSON;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Insight
 * @Description: TODO
 * @Date: 2024/12/12 17:52
 * @Version: 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;
    @Override
    public ResultJSON addOrder(Order order) {
        return ResultJSON.success(orderMapper.insert(order));
    }
}
