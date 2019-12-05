package com.csi.jpa;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class Address {
	@Column(name="EMPLOYEE_CITY")
private String city;
	@Column(name="EMPLOYEE_COUNTRY")
private String country;
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

}
