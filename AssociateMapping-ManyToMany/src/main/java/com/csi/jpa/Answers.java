package com.csi.jpa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Answers {
	@Id
	@GeneratedValue
private int id;
private String name;

@ManyToMany(targetEntity=Questions.class)
private List<Questions> q;

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

public List<Questions> getQ() {
	return q;
}

public void setQ(List<Questions> q) {
	this.q = q;
}

}
