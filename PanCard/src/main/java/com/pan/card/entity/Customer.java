package com.pan.card.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String firstName;
	private String lastName;
	private String middleName;
	private String department;
	private Double salary;
	private Long mobile;
	private String country;
	
	// task -- getfunction allrecord start with s....
	// -----get given contry name is minus other contry will show.(expect)
	// Generate Getters and Setters...
}

