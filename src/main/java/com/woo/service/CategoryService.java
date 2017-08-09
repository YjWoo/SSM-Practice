package com.woo.service;

import java.util.List;

import com.woo.pojo.Category;
import com.woo.util.Page;

public interface CategoryService
{

	List<Category> list();

	int total();

	List<Category> list(Page page);

	void addTwo();

	void deleteAll();
}