package com.shop.pojo;


import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.List;

@Data
public class Category {

  private Long id;
  private String name;
  private Long parentId;
  private Long sortOrder;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;

  @TableField(exist = false)
  private List<Category> subcategories;
}
