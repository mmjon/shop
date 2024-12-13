package com.shop.service;

import com.shop.pojo.Product;
import com.shop.util.ResultJSON;

/**
 * @Author: Insight
 * @Description: TODO
 * @Date: 2024/12/11 18:27
 * @Version: 1.0
 */

public interface ProductService {
    public ResultJSON<Product> findList();
    public ResultJSON<Product> findfindListByCate(Long id,String name);
    public ResultJSON<Product> findProductByid(Long id);

    public ResultJSON<Product> buyNow(Long id);
}
