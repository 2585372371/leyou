package com.leyou.item.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.leyou.item.mapper.SpuMapper;
import com.leyou.item.pojo.Spu;
import com.leyou.item.service.SpuService;
@Service
public class SpuServiceImpl implements SpuService{

    @Resource
    private SpuMapper spuMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return spuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Spu record) {
        return spuMapper.insert(record);
    }

    @Override
    public int insertSelective(Spu record) {
        return spuMapper.insertSelective(record);
    }

    @Override
    public Spu selectByPrimaryKey(Long id) {
        return spuMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Spu record) {
        return spuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Spu record) {
        return spuMapper.updateByPrimaryKey(record);
    }

}
