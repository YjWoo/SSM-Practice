package com.woo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.woo.pojo.Category;
import com.woo.service.CategoryService;
import com.woo.util.Page;

@Controller
@RequestMapping("")
public class CategoryController
{
	@Autowired
	CategoryService categoryService;

	@RequestMapping("listCategory")
	public ModelAndView listCategory(Page page)
	{

		ModelAndView mav = new ModelAndView();
		List<Category> cs = categoryService.list(page);
		int total = categoryService.total();

		page.caculateLast(total);

		// 放入转发参数
		mav.addObject("cs", cs);
		// 放入jsp路径
		mav.setViewName("listCategory");
		return mav;
	}

}