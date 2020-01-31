package com.spring.demo.autowireing.bytype;

public class Address {

	private String city;
	
	private String pinCode;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	
}
