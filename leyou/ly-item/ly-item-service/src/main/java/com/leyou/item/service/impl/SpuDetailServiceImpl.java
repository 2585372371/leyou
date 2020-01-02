package com.leyou.item.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.leyou.item.mapper.SpuDetailMapper;
import com.leyou.item.pojo.SpuDetail;
import com.leyou.item.service.SpuDetailService;
@Service
public class SpuDetailServiceImpl implements SpuDetailService{

    @Resource
    private SpuDetailMapper spuDetailMapper;

    @Override
    public int deleteByPrimaryKey(Long spuId) {
        return spuDetailMapper.deleteByPrimaryKey(spuId);
    }

    @Override
    public int insert(SpuDetail record) {
        return spuDetailMapper.insert(record);
    }

    @Override
    public int insertSelective(SpuDetail record) {
        return spuDetailMapper.insertSelective(record);
    }

    @Override
    public SpuDetail selectByPrimaryKey(Long spuId) {
        return spuDetailMapper.selectByPrimaryKey(spuId);
    }

    @Override
    public int updateByPrimaryKeySelective(SpuDetail record) {
        return spuDetailMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SpuDetail record) {
        return spuDetailMapper.updateByPrimaryKey(record);
    }

}
