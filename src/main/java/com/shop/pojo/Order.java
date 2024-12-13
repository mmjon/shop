package com.shop.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("order1")
public class Order {
  @TableId(value = "id",type = IdType.AUTO)
  private Long id;
  private Long userId;
  private Long productId;
  private double totalAmount;
  private Long status;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;
}
