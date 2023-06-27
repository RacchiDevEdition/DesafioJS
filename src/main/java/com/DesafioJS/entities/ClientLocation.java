package com.DesafioJS.entities;

import com.DesafioJS.entities.enums.ClientRegion;

public class ClientLocation {

	private ClientRegion region;
	private String street;
	private String city;
	private String state;
	private Integer postCode;
	

	public ClientLocation(ClientRegion region, String street, String city, String state, Integer postCode) {
		this.region = region;
		this.street = street;
		this.city = city;
		this.state = state;
		this.postCode = postCode;
	
	}

	public ClientLocation() {

	}

	public ClientRegion getRegion() {
		return region;
	}

	public void setRegion(ClientRegion region) {
		this.region = region;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPostCode() {
		return postCode;
	}

	public void setPostCode(Integer postCode) {
		this.postCode = postCode;
	}


	@Override
	public String toString() {
		return "ClientLocation [region=" + region + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", postCode=" + postCode + "]";
	}

}
