package com.leyou.item.service;

import com.leyou.item.pojo.Spu;
public interface SpuService{


    int deleteByPrimaryKey(Long id);

    int insert(Spu record);

    int insertSelective(Spu record);

    Spu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Spu record);

    int updateByPrimaryKey(Spu record);

}
