package com.leyou.item.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.leyou.item.pojo.Sku;
import com.leyou.item.mapper.SkuMapper;
import com.leyou.item.service.SkuService;
@Service
public class SkuServiceImpl implements SkuService{

    @Resource
    private SkuMapper skuMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return skuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Sku record) {
        return skuMapper.insert(record);
    }

    @Override
    public int insertSelective(Sku record) {
        return skuMapper.insertSelective(record);
    }

    @Override
    public Sku selectByPrimaryKey(Long id) {
        return skuMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Sku record) {
        return skuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Sku record) {
        return skuMapper.updateByPrimaryKey(record);
    }

}
