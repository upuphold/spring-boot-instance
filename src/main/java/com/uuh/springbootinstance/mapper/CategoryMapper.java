package com.uuh.springbootinstance.mapper;

import com.uuh.springbootinstance.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

	//	@Select("select * from category_")
	List<Category> findAll();
}
