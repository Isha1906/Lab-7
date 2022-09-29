/*----POJO class----*/

package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Agent {
	@Id
	private int id;
	private String name,city;
	private int commission_amount;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCommission_amount() {
		return commission_amount;
	}
	public void setCommission_amount(int commission_amount) {
		this.commission_amount = commission_amount;
	}
	@Override
	public String toString() {
		return "Agent [id=" + id + ", name=" + name + ", city=" + city + ", commission_amount=" + commission_amount
				+ "]";
	}
	
	

}
