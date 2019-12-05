package com.csi.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue
private int addId;
private String Country;
@ManyToOne(targetEntity=Employee.class)
private Employee emp;

public Employee getEmp() {
	return emp;
}
public void setEmp(Employee emp) {
	this.emp = emp;
}
public int getAddId() {
	return addId;
}
public void setAddId(int addId) {
	this.addId = addId;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
@Override
public String toString() {
	return "Address [addId=" + addId + ", Country=" + Country + ", emp=" + emp + "]";
}



}
