package com.leyou.item.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.leyou.item.mapper.UserCouponMapper;
import com.leyou.item.pojo.UserCoupon;
import com.leyou.item.service.UserCouponService;
@Service
public class UserCouponServiceImpl implements UserCouponService{

    @Resource
    private UserCouponMapper userCouponMapper;

    @Override
    public int deleteByPrimaryKey(Long couponCode) {
        return userCouponMapper.deleteByPrimaryKey(couponCode);
    }

    @Override
    public int insert(UserCoupon record) {
        return userCouponMapper.insert(record);
    }

    @Override
    public int insertSelective(UserCoupon record) {
        return userCouponMapper.insertSelective(record);
    }

    @Override
    public UserCoupon selectByPrimaryKey(Long couponCode) {
        return userCouponMapper.selectByPrimaryKey(couponCode);
    }

    @Override
    public int updateByPrimaryKeySelective(UserCoupon record) {
        return userCouponMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserCoupon record) {
        return userCouponMapper.updateByPrimaryKey(record);
    }

}
