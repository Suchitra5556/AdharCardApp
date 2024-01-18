package com.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
	
	@Id
	@Column(name = "EmpId")
	private Integer id;
	@Column(name="EmpName")
	@NotBlank(message = "Please Enter Name")
	private String name;
	@Column(name = "EmpSalary")
	@NotNull(message = "Please Enter salary")
	private Long salary;
	@Column(name = "EmpAddress")
	@NotBlank(message = "Please Enter Address")
	private String address;
	
	
	
}