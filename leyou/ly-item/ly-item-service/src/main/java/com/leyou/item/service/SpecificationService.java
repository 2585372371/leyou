package com.leyou.item.service;

import com.leyou.item.pojo.Specification;
public interface SpecificationService{


    int deleteByPrimaryKey(Long categoryId);

    int insert(Specification record);

    int insertSelective(Specification record);

    Specification selectByPrimaryKey(Long categoryId);

    int updateByPrimaryKeySelective(Specification record);

    int updateByPrimaryKey(Specification record);

}
