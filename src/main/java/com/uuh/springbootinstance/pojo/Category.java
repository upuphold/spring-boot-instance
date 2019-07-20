package com.uuh.springbootinstance.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * Description:
 * Date: 2019年07月21日 2:40
 * Author: cg
 * Version: 1.0
 */
@Data
@Entity
@Table(name = "category_")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private String name;

}
