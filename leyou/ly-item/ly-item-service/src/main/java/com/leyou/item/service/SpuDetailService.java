package com.leyou.item.service;

import com.leyou.item.pojo.SpuDetail;
public interface SpuDetailService{


    int deleteByPrimaryKey(Long spuId);

    int insert(SpuDetail record);

    int insertSelective(SpuDetail record);

    SpuDetail selectByPrimaryKey(Long spuId);

    int updateByPrimaryKeySelective(SpuDetail record);

    int updateByPrimaryKey(SpuDetail record);

}
