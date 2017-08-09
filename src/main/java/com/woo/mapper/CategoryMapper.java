package com.woo.mapper;

import java.util.List;

import com.woo.pojo.Category;
import com.woo.util.Page;

public interface CategoryMapper
{

	public void add(Category category);

	public void delete(int id);

	public Category get(int id);

	public void update(Category category);

	public List<Category> list();

	public List<Category> list(Page page);

	public int total();
}