package com.leyou.item.service;
import java.util.List;

import com.leyou.common.vo.PageResult;
import com.leyou.item.pojo.Brand;

public interface BrandService {


    PageResult<Brand> queryBrandByPage(Integer page, Integer rows, String sortBy, Boolean desc, String key);
     void insertBrand(Brand brand,List<Long> cids);

}




