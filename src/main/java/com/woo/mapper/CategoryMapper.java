package com.woo.mapper;

import java.util.List;

import com.woo.pojo.Category;

public interface CategoryMapper
{

	public void add(Category category);

	public void delete(int id);

	public Category get(int id);

	public void update(Category category);

	public List<Category> list();

	public int count();

}