package com.demo.in;

public class Address {
	private String Street;
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", City=" + City + ", State=" + State + "]";
	}

	private String City;
	private String State;

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

}
