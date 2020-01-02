package com.leyou.item.mapper;

import com.leyou.item.pojo.Specification;

public interface SpecificationMapper {
    int deleteByPrimaryKey(Long categoryId);

    int insert(Specification record);

    int insertSelective(Specification record);

    Specification selectByPrimaryKey(Long categoryId);

    int updateByPrimaryKeySelective(Specification record);

    int updateByPrimaryKey(Specification record);
}