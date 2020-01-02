package com.leyou.item.service;

import com.leyou.item.pojo.UserCoupon;
public interface UserCouponService{


    int deleteByPrimaryKey(Long couponCode);

    int insert(UserCoupon record);

    int insertSelective(UserCoupon record);

    UserCoupon selectByPrimaryKey(Long couponCode);

    int updateByPrimaryKeySelective(UserCoupon record);

    int updateByPrimaryKey(UserCoupon record);

}
