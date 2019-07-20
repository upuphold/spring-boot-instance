package com.uuh.springbootinstance.dao;

import com.uuh.springbootinstance.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<Category, Integer> {
}
