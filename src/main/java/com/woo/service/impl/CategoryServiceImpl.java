package com.woo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woo.mapper.CategoryMapper;
import com.woo.pojo.Category;
import com.woo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService
{
	@Autowired
	CategoryMapper categoryMapper;

	public List<Category> list()
	{
		return categoryMapper.list();
	};

}