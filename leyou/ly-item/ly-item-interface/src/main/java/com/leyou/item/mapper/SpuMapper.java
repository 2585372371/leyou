package com.leyou.item.mapper;

import com.leyou.item.pojo.Spu;

public interface SpuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Spu record);

    int insertSelective(Spu record);

    Spu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Spu record);

    int updateByPrimaryKey(Spu record);
}