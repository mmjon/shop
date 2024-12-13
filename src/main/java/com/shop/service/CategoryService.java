package com.shop.service;

import com.shop.pojo.Category;
import com.shop.util.ResultJSON;

/**
 * @Author: Insight
 * @Description: TODO
 * @Date: 2024/12/12 10:00
 * @Version: 1.0
 */

public interface CategoryService {

    public ResultJSON<Category> findList();
}
