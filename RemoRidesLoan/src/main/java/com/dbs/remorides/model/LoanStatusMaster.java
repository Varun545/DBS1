package com.dbs.remorides.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan_status_master")
public class LoanStatusMaster {

	@Id
	@Column(name = "Id")
	int id;
	
	@Column(name = "name")
	String name;
}
