package com.leyou.item.pojo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCoupon implements Serializable {
    /**
    * 每张优惠券的编号
    */
    private Long couponCode;

    /**
    * 优惠卷id（coupon表的id）
    */
    private Long couponId;

    /**
    * 用户id
    */
    private Long userId;

    /**
    * 是否使用，0、未使用  1、已使用  2、已过期
    */
    private Object status;

    private static final long serialVersionUID = 1L;
}