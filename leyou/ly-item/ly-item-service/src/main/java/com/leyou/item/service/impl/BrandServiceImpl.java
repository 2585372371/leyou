package com.leyou.item.service.impl;

import java.util.List;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.common.vo.PageResult;

import com.leyou.item.mapper.CategoryBrandMapper;
import com.leyou.item.pojo.CategoryBrand;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.leyou.item.pojo.Brand;
import com.leyou.item.mapper.BrandMapper;
import com.leyou.item.service.BrandService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;


/**
 * @author 25853
 */
@Slf4j
@Service
public class BrandServiceImpl implements BrandService {

    @Resource
    private BrandMapper brandMapper;
    @Resource
    private CategoryBrandMapper categoryBrandMapper;

    @Transactional
    @Override
    public void insertBrand(Brand brand,List<Long> cids){
        int count = brandMapper.insert(brand);
        if(count!=1){
            throw new LyException(ExceptionEnum.BRAND_SAVE_FAILURE);
        }
//        新增中间表
        for (Long cid:
             cids
        ) {
            int i = categoryBrandMapper.insert(new CategoryBrand(cid, brand.getId()));
            log.info(i+"");
        }
    }
    @Override
    public PageResult<Brand> queryBrandByPage(Integer page, Integer rows, String sortBy, Boolean desc, String key) {
        PageHelper.startPage(page, rows);
        Example example = new Example(Brand.class);
        if (StringUtils.isNotBlank(key)) {
            example.createCriteria().orLike("name", "%" + key + "%").orEqualTo("letter", key.toUpperCase());
        }

        if (StringUtils.isNotBlank(sortBy)) {
            String s = sortBy + (desc ? " DESC " : " ASC");
            example.setOrderByClause(s);
        }
        List<Brand> brands = brandMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(brands)) {
            throw new LyException(ExceptionEnum.BRAND_NOT_FOUND);
        }
        PageInfo<Brand> brandPageInfo = new PageInfo<>(brands);
        PageResult<Brand> pageResult = new PageResult<>();
        int totlapage= (int) (brandPageInfo.getTotal()/rows);
        pageResult.setTotalPage(totlapage);
        pageResult.setTotal(brandPageInfo.getTotal());
        pageResult.setItems(brands);
        return pageResult;
    }
}



