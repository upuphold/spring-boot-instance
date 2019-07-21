package com.uuh.springbootinstance;

import com.uuh.springbootinstance.mapper.CategoryMapper;
import com.uuh.springbootinstance.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Description: 测试类
 * Date: 2019年07月21日 12:02
 * Author: cg
 * Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootInstanceApplication.class)
public class TestJPA {

	@Autowired
	private CategoryMapper categoryMapper;

	@Test
	public void test() {
		List<Category> categories = categoryMapper.findAll();
		for (Category category : categories) {
			System.out.println(category.toString());
		}

	}
}
