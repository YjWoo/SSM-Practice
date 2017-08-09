package com.woo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.woo.mapper.CategoryMapper;
import com.woo.pojo.Category;
import com.woo.service.CategoryService;
import com.woo.util.Page;

@Service
public class CategoryServiceImpl implements CategoryService
{
	@Autowired
	CategoryMapper categoryMapper;

	public List<Category> list()
	{
		return categoryMapper.list();
	}

	public int total()
	{
		return categoryMapper.total();
	}

	public List<Category> list(Page page)
	{
		return categoryMapper.list(page);
	}

	public void deleteAll()
	{
		List<Category> cs = list();
		for (Category c : cs)
		{

			categoryMapper.delete(c.getId());
		}
	}

	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void addTwo()
	{

		Category c1 = new Category();
		c1.setName("Short Name");
		categoryMapper.add(c1);

		Category c2 = new Category();
		c2.setName("Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow,Long name StackOverFlow");
		categoryMapper.add(c2);
	};

}