package com.csi.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
private int vehicleid;
private String vehiclename;
public int getVehicleid() {
	return vehicleid;
}
public void setVehicleid(int vehicleid) {
	this.vehicleid = vehicleid;
}
public String getVehiclename() {
	return vehiclename;
}
public void setVehiclename(String vehiclename) {
	this.vehiclename = vehiclename;
}

}
