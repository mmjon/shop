package com.shop.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shop.mapper.CategoryMapper;
import com.shop.pojo.Category;
import com.shop.service.CategoryService;
import com.shop.util.ResultJSON;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Insight
 * @Description: TODO
 * @Date: 2024/12/12 10:00
 * @Version: 1.0
 */

@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper;


    @Override
    public ResultJSON<Category> findList() {
//        最终的列表
        List<Category> EndMenu = new ArrayList<>();
//        获得父级菜单
        QueryWrapper<Category> root = new QueryWrapper<>();
        root.eq("parent_id",0);
        List<Category> parent1 = categoryMapper.selectList(root);
//        获得父级意外的菜单
        QueryWrapper<Category> allchild = new QueryWrapper<>();
        allchild.ne("parent_id",0);
        List<Category> childrenList = categoryMapper.selectList(allchild);
//      调用递归方法  依次加入子级
        for (Category child : parent1){
//            QueryWrapper<Category> childquery = new QueryWrapper<>();
//            childquery.eq("parent_id",child.getId());
//            List<Category> childlist = categoryMapper.selectList(childquery);
//            child.setSubcategories(childlist);
            EndMenu.add(findchildren(child,childrenList));
        }
//        System.out.println(parent1.toString());
        return ResultJSON.success(EndMenu);
    }

    public static Category findchildren(Category parent1,List<Category> allchild){
        parent1.setSubcategories(new ArrayList<>());
        for (Category child : allchild){
                if (parent1.getId().equals(child.getParentId())){
                    parent1.getSubcategories().add(findchildren(child,allchild));
                }
        }
        return parent1;
    }
}
