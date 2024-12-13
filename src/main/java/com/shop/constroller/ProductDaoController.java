package com.shop.constroller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shop.pojo.Product;
import com.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.shop.util.ResultJSON;

/**
 * @Author: Insight
 * @Description: TODO
 * @Date: 2024/12/11 18:26
 * @Version: 1.0
 */

@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductDaoController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/findList")
    public ResultJSON<Product> findList(){
        return productService.findList();
    }

    @RequestMapping("/findListByCate")
    public ResultJSON<Product> findfindListByCate(Long id,String name){

        return productService.findfindListByCate(id,name);
    }

    @RequestMapping("/findProductByid")
    public ResultJSON<Product> findProductByid(Long id){
        return productService.findProductByid(id);
    }

    @Transactional
    @RequestMapping("/buyNow")
    public ResultJSON<Product> buyNow(Long id){
        return productService.buyNow(id);
    }
}
