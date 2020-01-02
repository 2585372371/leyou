package com.leyou.item.mapper;

import com.leyou.item.pojo.CategoryBrand;
import org.apache.ibatis.annotations.Param;

public interface CategoryBrandMapper {
    int deleteByPrimaryKey(@Param("categoryId") Long categoryId, @Param("brandId") Long brandId);

    int insert(CategoryBrand record);

    int insertSelective(CategoryBrand record);
}