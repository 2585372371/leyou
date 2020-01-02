package com.leyou.item.service;
import java.util.List;

import com.leyou.item.pojo.Category;
public interface CategoryService{


    int deleteByPrimaryKey(Long id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);



	List<Category> selectByParentId(Long parentId);


}
