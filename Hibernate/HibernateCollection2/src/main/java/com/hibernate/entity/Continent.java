package com.hibernate.entity;

import java.util.HashMap;
import java.util.Map;

public class Continent {
	
	public Continent() {
		
	}
	
	private int id;
	private String cname;
	private Map<String,String> countries;
	
	public Continent(String string, HashMap<String, String> map1) {
		
	}
	
	
	
	public Continent(int id, String cname, Map<String, String> countries) {
		super();
		this.id = id;
		this.cname = cname;
		this.countries = countries;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Map<String, String> getCountries() {
		return countries;
	}
	public void setCountries(Map<String, String> countries) {
		this.countries = countries;
	}
	

}
