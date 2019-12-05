package com.csi.jpa;





//import java.sql.Date;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
@Entity
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="Employee_ID")
private int empId;
	@Column(name="Employee_Name")
private String empName;
	@Column(name="Employee_Address")
private String empAddress;
	@Column(name="Employee_ContactNumber")
private long empContactNumber;
	@Column(name="Employee_Salary")
private double empSalary;
	@Column(name="Employee_AadharNumer",unique=true)
private long empUID;
	@Column(name="Employee_DOB")
	@Temporal(TemporalType.DATE)
private Date empDOB;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpAddress() {
	return empAddress;
}
public void setEmpAddress(String empAddress) {
	this.empAddress = empAddress;
}
public long getEmpContactNumber() {
	return empContactNumber;
}
public void setEmpContactNumber(long empContactNumber) {
	this.empContactNumber = empContactNumber;
}
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}
public long getEmpUID() {
	return empUID;
}
public void setEmpUID(long empUID) {
	this.empUID = empUID;
}
public Date getEmpDOB() {
	return empDOB;
}
public void setEmpDOB(Date empDOB) {
	this.empDOB = empDOB;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empContactNumber="
			+ empContactNumber + ", empSalary=" + empSalary + ", empUID=" + empUID + ", empDOB=" + empDOB + "]";
}



}
