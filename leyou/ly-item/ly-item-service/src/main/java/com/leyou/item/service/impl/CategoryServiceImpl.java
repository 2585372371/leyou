package com.leyou.item.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.leyou.item.pojo.Category;
import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{

    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Category record) {
        return categoryMapper.insert(record);
    }

    @Override
    public int insertSelective(Category record) {
        return categoryMapper.insertSelective(record);
    }

    @Override
    public Category selectByPrimaryKey(Long id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Category record) {
        return categoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Category record) {
        return categoryMapper.updateByPrimaryKey(record);
    }

	@Override
	public List<Category> selectByParentId(Long parentId){
		 return categoryMapper.selectByParentId(parentId);
	}




}
