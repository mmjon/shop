package com.shop.constroller;

import com.shop.service.CategoryService;
import com.shop.util.ResultJSON;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Insight
 * @Description: TODO
 * @Date: 2024/12/12 10:02
 * @Version: 1.0
 */
@RestController
@CrossOrigin
@RequestMapping("/category")
public class CategoryMapperController {
    @Resource
    private CategoryService categoryService;

    @RequestMapping("/findlist")
    public ResultJSON findList(){
        return categoryService.findList();
    }
}
