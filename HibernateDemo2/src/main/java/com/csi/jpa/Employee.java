package com.csi.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
private int empId;
	@Column(name="Employee_Name")
private String empName;
	@Column(name="Employee_Address")
private String empAddress;
	@Column(name="Employee_Number")
private long empContactNumber;
	@Column(name="Employee_Salary")
private float empSalary;

	public long getEmpContactNumber() {
	return empContactNumber;
}
public void setEmpContactNumber(long empContactNumber) {
	this.empContactNumber = empContactNumber;
}
public float getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(float empSalary) {
	this.empSalary = empSalary;
}
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
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress
				+ ", empContactNumber=" + empContactNumber + ", empSalary=" + empSalary + "]";
	}
	

}
