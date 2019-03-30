package com.dbs.remorides.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank_users")
public class BankUsers {
	
	@Id
	@Column(name = "Id")
	int id;
	
	@Column(name = "user_name")
	String username;
	
	@Column(name = "password")
	String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswords() {
		return password;
	}

	public void setPasswords(String passwords) {
		this.password = passwords;
	}
	
	
	
}
