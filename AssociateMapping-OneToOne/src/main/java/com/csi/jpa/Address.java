package com.csi.jpa;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
@Id
@GeneratedValue
private int id;
private String city;
private String country;
@OneToOne(targetEntity=Employee.class)
private Employee employee;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
/*@Override
public String toString() {
	return "Address [id=" + id + ", city=" + city + ", country=" + country + ", employee=" + employee + "]";
}*/
}
