package com.shop.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shop.mapper.ProductMapper;
import com.shop.pojo.Product;
import com.shop.service.ProductService;
import org.springframework.stereotype.Service;
import com.shop.util.ResultJSON;

import javax.annotation.Resource;

/**
 * @Author: Insight
 * @Description: TODO
 * @Date: 2024/12/11 18:27
 * @Version: 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;
    @Override
    public ResultJSON<Product> findList() {
        QueryWrapper<Product> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("sales");
        queryWrapper.last("LIMIT 9");
        return ResultJSON.success(productMapper.selectList(queryWrapper));
    }

    @Override
    public ResultJSON<Product> findfindListByCate(Long id,String name) {
        QueryWrapper<Product> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("category_id",id);
        if (name != null){
            queryWrapper.like("name",name);
        }
        queryWrapper.orderByDesc("sales");
        return ResultJSON.success(productMapper.selectList(queryWrapper));
    }

    @Override
    public ResultJSON<Product> findProductByid(Long id) {
        return ResultJSON.success(productMapper.selectById(id));
    }

    @Override
    public ResultJSON<Product> buyNow(Long id) {
        Product product = productMapper.selectById(id);
        product.setSales(product.getSales() + 1);
        product.setStock(product.getStock() - 1);
        return ResultJSON.success(productMapper.updateById(product));
    }
}
