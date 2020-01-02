package com.leyou.item.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.leyou.item.mapper.SpecificationMapper;
import com.leyou.item.pojo.Specification;
import com.leyou.item.service.SpecificationService;
@Service
public class SpecificationServiceImpl implements SpecificationService{

    @Resource
    private SpecificationMapper specificationMapper;

    @Override
    public int deleteByPrimaryKey(Long categoryId) {
        return specificationMapper.deleteByPrimaryKey(categoryId);
    }

    @Override
    public int insert(Specification record) {
        return specificationMapper.insert(record);
    }

    @Override
    public int insertSelective(Specification record) {
        return specificationMapper.insertSelective(record);
    }

    @Override
    public Specification selectByPrimaryKey(Long categoryId) {
        return specificationMapper.selectByPrimaryKey(categoryId);
    }

    @Override
    public int updateByPrimaryKeySelective(Specification record) {
        return specificationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Specification record) {
        return specificationMapper.updateByPrimaryKey(record);
    }

}
