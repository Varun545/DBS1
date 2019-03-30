package com.dbs.remorides.model;

import javax.persistence.Entity;


public class RemoRidesRequestModel {

	
	public int id;
	
	public String name;
	
	public RemoRidesRequestModel(){
		
	}
	
	public RemoRidesRequestModel(int id,String name){
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
