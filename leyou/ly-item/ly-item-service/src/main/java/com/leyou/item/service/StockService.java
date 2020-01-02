package com.leyou.item.service;

import com.leyou.item.pojo.Stock;
public interface StockService{


    int deleteByPrimaryKey(Long skuId);

    int insert(Stock record);

    int insertSelective(Stock record);

    Stock selectByPrimaryKey(Long skuId);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);

}
