package com.uuh.springbootinstance.pojo;

/**
 * Description:
 * Date: 2019年07月21日 2:40
 * Author: cg
 * Version: 1.0
 */

public class Category {

	private Integer id;

	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
