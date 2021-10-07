package com.hibernate.entity;

import java.util.List;

public class Question {
	private int id;
	private String qname;
	private List<String> answers;
	
	@Override
	public String toString() {
		return "Question [id=" + id + ", qname=" + qname + ", answers=" + answers + "]";
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	

}
