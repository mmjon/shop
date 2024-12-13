package com.shop.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class Product {
  private Long id;
  private String name;
  private String description;
  private double price;
  private double price2;
  private Long stock;
  private Long sales;
  private String imageUrl;
  private Long categoryId;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;

  @TableField(exist = false)
  private Category category;
}
