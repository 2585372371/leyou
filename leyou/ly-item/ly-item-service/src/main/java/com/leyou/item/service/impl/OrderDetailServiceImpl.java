package com.leyou.item.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.leyou.item.pojo.OrderDetail;
import com.leyou.item.mapper.OrderDetailMapper;
import com.leyou.item.service.OrderDetailService;
@Service
public class OrderDetailServiceImpl implements OrderDetailService{

    @Resource
    private OrderDetailMapper orderDetailMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return orderDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OrderDetail record) {
        return orderDetailMapper.insert(record);
    }

    @Override
    public int insertSelective(OrderDetail record) {
        return orderDetailMapper.insertSelective(record);
    }

    @Override
    public OrderDetail selectByPrimaryKey(Long id) {
        return orderDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderDetail record) {
        return orderDetailMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderDetail record) {
        return orderDetailMapper.updateByPrimaryKey(record);
    }

}
