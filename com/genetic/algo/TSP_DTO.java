package com.genetic.algo;

import java.util.ArrayList;
import java.util.List;

import com.worldMap.dto.CityDTO;

import co.worldMap.util.InitializeCities;

public class TSP_DTO {
	
	private CityDTO homeTown;
	private List<CityDTO> travelCities;
	
	
	
	public TSP_DTO(CityDTO homeTown) {
		super();
		this.homeTown = homeTown;
		List<CityDTO> travelCities = new ArrayList<>();
		InitializeCities.createCityList(travelCities);
		this.travelCities=travelCities;
	}
	public CityDTO getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(CityDTO homeTown) {
		this.homeTown = homeTown;
	}
	public List<CityDTO> getTravelCities() {
		return travelCities;
	}
	public void setTravelCities(List<CityDTO> travelCities) {
		this.travelCities = travelCities;
	}
	
	public  void display(){
		System.out.print("Home:");
		this.homeTown.display();
		int count=1;
		System.out.println("-----------Travel--------------");
		for(CityDTO city:this.travelCities){
			System.out.print(count+")");
			city.display();
			count++;
		}
	}

}
