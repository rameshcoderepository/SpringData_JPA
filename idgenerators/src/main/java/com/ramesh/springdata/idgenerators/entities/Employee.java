package com.ramesh.springdata.idgenerators.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Employee {

	// Configure the Table Strategy
	//@TableGenerator(name = "employee_gen", table = "id_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 100)
	//@Id
	//@GeneratedValue(strategy = GenerationType.TABLE, generator = "employee_gen")
	//private Long id;
	

	// Custom Random Generator
	// @GenericGenerator(name="emp_id",strategy="com.ramesh.springdata.idgenerators.CustomRandomIDGenerator")
	// @GeneratedValue(generator="emp_id")

	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
