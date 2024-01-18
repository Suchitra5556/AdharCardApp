package com.adhar.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AdharEntity {

	@Id
	private Long adharNo;
	private String firstName;
	private String lastName;
	private Long phNo;
	private String address;
	private String state;
	private String contry;

	public AdharEntity() {
		super();

	}

	public AdharEntity(String firstName, String lastName, long adharNo, long phNo, String address, String state,
			String contry) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.adharNo = adharNo;
		this.phNo = phNo;
		this.address = address;
		this.state = state;
		this.contry = contry;
	}

	public String getFirstName() {

		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {

		this.phNo = phNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getContry() {
		return contry;
	}

	public void setContry(String contry) {
		this.contry = contry;
	}

}
