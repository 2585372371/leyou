package com.leyou.item.service;

import com.leyou.item.pojo.CategoryBrand;
public interface CategoryBrandService{


    int deleteByPrimaryKey(Long categoryId,Long brandId);

    int insert(CategoryBrand record);

    int insertSelective(CategoryBrand record);

}
