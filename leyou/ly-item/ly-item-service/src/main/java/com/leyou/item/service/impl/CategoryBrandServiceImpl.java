package com.leyou.item.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.leyou.item.pojo.CategoryBrand;
import com.leyou.item.mapper.CategoryBrandMapper;
import com.leyou.item.service.CategoryBrandService;
@Service
public class CategoryBrandServiceImpl implements CategoryBrandService{

    @Resource
    private CategoryBrandMapper categoryBrandMapper;

    @Override
    public int deleteByPrimaryKey(Long categoryId,Long brandId) {
        return categoryBrandMapper.deleteByPrimaryKey(categoryId,brandId);
    }

    @Override
    public int insert(CategoryBrand record) {
        return categoryBrandMapper.insert(record);
    }

    @Override
    public int insertSelective(CategoryBrand record) {
        return categoryBrandMapper.insertSelective(record);
    }

}
