package com.leyou.item.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.leyou.item.pojo.Stock;
import com.leyou.item.mapper.StockMapper;
import com.leyou.item.service.StockService;
@Service
public class StockServiceImpl implements StockService{

    @Resource
    private StockMapper stockMapper;

    @Override
    public int deleteByPrimaryKey(Long skuId) {
        return stockMapper.deleteByPrimaryKey(skuId);
    }

    @Override
    public int insert(Stock record) {
        return stockMapper.insert(record);
    }

    @Override
    public int insertSelective(Stock record) {
        return stockMapper.insertSelective(record);
    }

    @Override
    public Stock selectByPrimaryKey(Long skuId) {
        return stockMapper.selectByPrimaryKey(skuId);
    }

    @Override
    public int updateByPrimaryKeySelective(Stock record) {
        return stockMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Stock record) {
        return stockMapper.updateByPrimaryKey(record);
    }

}
