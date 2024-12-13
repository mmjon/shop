package com.shop.pojo;

import lombok.Data;

@Data
public class Carousel {
  private long id;
  private String imageUrl;
  private String title;
  private String linkUrl;
  private long sortOrder;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;
}
