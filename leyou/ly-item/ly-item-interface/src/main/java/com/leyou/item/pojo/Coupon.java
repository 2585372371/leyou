package com.leyou.item.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coupon implements Serializable {
    /**
    * 优惠卷id
    */
    private Long id;

    /**
    * 优惠卷名称
    */
    private String name;

    /**
    * 优惠卷类型,1、抵扣  2、折扣(打折）
    */
    private Object type;

    /**
    * 抵扣或折扣条件，如果没有限制，则设置为0
    */
    private Long condition;

    /**
    * 优惠金额
    */
    private Long reduction;

    /**
    * 如果没有折扣，为100。如果是八五折，折扣为85
    */
    private Integer discount;

    /**
    * 优惠券可以生效的sku的id拼接，以,分割
    */
    private String targets;

    /**
    * 剩余优惠券数量
    */
    private Integer stock;

    /**
    * 优惠券生效时间
    */
    private Date startTime;

    /**
    * 优惠券失效时间
    */
    private Date endTime;

    private static final long serialVersionUID = 1L;
}