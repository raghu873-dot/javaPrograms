package com.net.Important;

public class Address {
	
	private Integer id;
	private String postalAddress;
	
	public Address(Integer id, String postalAddress) {
		super();
		this.id = id;
		this.postalAddress = postalAddress;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPostalAddress() {
		return postalAddress;
	}
	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", postalAddress=" + postalAddress + "]";
	}

}
