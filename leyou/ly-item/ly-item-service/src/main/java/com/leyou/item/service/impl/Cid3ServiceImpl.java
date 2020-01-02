package com.leyou.item.service.impl;

import com.leyou.item.pojo.Cid3;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.leyou.item.mapper.Cid3Mapper;
import com.leyou.item.service.Cid3Service;

@Service
public class Cid3ServiceImpl implements Cid3Service {

    @Resource
    private Cid3Mapper cid3Mapper;

    @Override
    public int insert(Cid3 record) {
        return cid3Mapper.insert(record);
    }

    @Override
    public int insertSelective(Cid3 record) {
        return cid3Mapper.insertSelective(record);
    }

}

