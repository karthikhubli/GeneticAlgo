package com.worldMap.dto;

public class CityDTO {
	private String name;
	private double latitude;
	private double logitude;
	private String country;
	public  static final long RADIUS= (long) 6371.01;
	
	public CityDTO(String name, double latitude, double logitude, String country) {
		super();
		this.name = name;
		this.latitude = latitude;
		this.logitude = logitude;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLogitude() {
		return logitude;
	}

	public void setLogitude(float logitude) {
		this.logitude = logitude;
	}

	public String getcountry() {
		return country;
	}

	public void setcountry(String country) {
		this.country = country;
	}
	
	public void display(){
		System.out.println(this.getName()+"["+this.getcountry()+"][lat:"+this.getLatitude()+",lon:"+this.getLogitude()+"]");
	}
	
}
	
