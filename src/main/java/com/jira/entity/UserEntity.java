package com.jira.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserEntity {

	private String email;
	private String name;
	@Id
	private Long mobileNumber;
	private String password;

	public UserEntity() {
		super();
	}

	public UserEntity(String email, String name, long mobileNumber, String password) {
		super();
		this.email = email;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserEntity [email=" + email + ", name=" + name + ", mobileNumber=" + mobileNumber + ", password="
				+ password + "]";
	}

}
