package com.csi.jpa;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Details")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Employee_Id")
private int id;
	@Column(name="Employee_Name")
private String name;
@Embedded
@AttributeOverrides({
@AttributeOverride(name="state",column=@Column(name="Home_State")),
@AttributeOverride(name="capital", column=@Column(name="Home_Capital"))
                                })
private Address homeAddress;
@Embedded
private Address officeAddress;
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
public Address getHomeAddress() {
	return homeAddress;
}
public void setHomeAddress(Address homeAddress) {
	this.homeAddress = homeAddress;
}
public Address getOfficeAddress() {
	return officeAddress;
}
public void setOfficeAddress(Address officeAddress) {
	this.officeAddress = officeAddress;
}


}
