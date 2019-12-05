package com.csi.jpa;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name="State_Name")
private String state;
	@Column(name="Capital_Name")
private String capital;
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCapital() {
	return capital;
}
public void setCapital(String capital) {
	this.capital = capital;
}

}
