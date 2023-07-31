package com.automation.maven;

import jakarta.persistence.*;

@Entity
@Table(name="city")
public class City {
	/*
	 * city_name, population, latitude, longitude, region
	 */
	
	@Id
	@Column(name="city_id")
	private int city_id;
	
	@Column(name="city_name")
	private String city_name;
	
	@Column(name="population")
	private String population;
	
	@Column(name="latitude")
	private String latitude;
	
	@Column(name="longitude")
	private String longitude;
	
	@Column(name="region")
	private String region;
	
	
   
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public String getCity_name() {
		return city_name;
	}
	public String getPopulation() {
		return population;
	}
	public String getLatitude() {
		return latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public String getRegion() {
		return region;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	
	

}
