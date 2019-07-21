package com.uuh.springbootinstance.web;

import com.uuh.springbootinstance.mapper.CategoryMapper;
import com.uuh.springbootinstance.pojo.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Description:
 * Date: 2019年07月21日 2:46
 * Author: cg
 * Version: 1.0
 */
@Controller
@Slf4j
public class CategoryController {

	@Autowired
	private CategoryMapper categoryMapper;

	@RequestMapping("categoryList")
	public String categoryList(Model model) {
		List<Category> categories = categoryMapper.findAll();
		log.info("数据有：{}", categories);
		model.addAttribute("cs", categories);
		return "categoryList";
	}
}
