package com.uuh.springbootinstance.web;

import com.uuh.springbootinstance.dao.CategoryDAO;
import com.uuh.springbootinstance.pojo.Category;
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
public class CategoryController {

	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping("categoryList")
	public String categoryList(Model model) {
		List<Category> categories = categoryDAO.findAll();
		model.addAttribute("categories", categories);
		return "categoryList";
	}
}
