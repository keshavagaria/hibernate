package com.csi.jpa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Questions {
	@Id
	@GeneratedValue
private int id;

private String questions;
@ManyToMany(targetEntity=Answers.class,mappedBy="q")
private List<Answers> a;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getQuestions() {
	return questions;
}
public void setQuestions(String questions) {
	this.questions = questions;
}
public List<Answers> getA() {
	return a;
}
public void setA(List<Answers> a) {
	this.a = a;
}


}
