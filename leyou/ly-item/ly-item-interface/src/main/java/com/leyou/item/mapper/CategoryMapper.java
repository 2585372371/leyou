package com.leyou.item.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.leyou.item.pojo.Category;

public interface CategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    List<Category> selectByParentId(@Param("parentId")Long parentId);


}