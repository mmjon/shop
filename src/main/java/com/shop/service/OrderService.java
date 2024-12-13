package com.shop.service;

import com.shop.pojo.Order;
import com.shop.util.ResultJSON;

/**
 * @Author: Insight
 * @Description: TODO
 * @Date: 2024/12/12 17:52
 * @Version: 1.0
 */

public interface OrderService {
    public ResultJSON addOrder(Order order);
}
