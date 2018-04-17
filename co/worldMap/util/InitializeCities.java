package co.worldMap.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.worldMap.dto.CityDTO;

public class InitializeCities {

	public static void main(String[] args) {
		/*CityDTO boston = new CityDTO("Boston", 42.361145, -71.057083,"USA");
		CityDTO nyc = new CityDTO("New York City", 40.74997906, -73.935242,"United States of America");
		System.out.println(CityDistance.getDistanceBwCities(boston, nyc)+" Km");
		boston.showCity();*/
		
		List<CityDTO> cityList = new ArrayList<>();
		createCityList(cityList);
		for(CityDTO city:cityList){
			city.display();
		}
		
		System.out.println("Total distance :"+CityDistance.getTotalDistance(cityList));
		
		System.out.println("------------");
		Collections.shuffle(cityList);
		for(CityDTO city:cityList){
			city.display();
		}
		System.out.println("Total distance :"+CityDistance.getTotalDistance(cityList));
		System.out.println("------------");
		Collections.shuffle(cityList);
		for(CityDTO city:cityList){
			city.display();
		}
		System.out.println("Total distance :"+CityDistance.getTotalDistance(cityList));
		
	}
	
	public static void createCityList(List<CityDTO> cityList){
		//UK
		cityList.add(new CityDTO("Cambridge", 52.20039125, 0.116623086, "United Kingdom"));
		cityList.add(new CityDTO("Edinburgh", 55.94832786, -3.219090618, "United Kingdom"));
		cityList.add(new CityDTO("Liverpool", 53.41600181, -2.917997886, "United Kingdom"));
		cityList.add(new CityDTO("Manchester", 53.50041526,-2.247987103, "United Kingdom"));
		cityList.add(new CityDTO("London", 51.49999473, -0.116721844, "United Kingdom"));
		
		//USA
		cityList.add(new CityDTO("New York City", 40.74997906, -73.935242,"United States of America"));
		cityList.add(new CityDTO("Seattle", 47.57000205, -122.339985,"United States of America"));
		cityList.add(new CityDTO("Tampa", 27.94698793, -82.45862085,"United States of America"));
		
		//Europe
		cityList.add(new CityDTO("Paris", 48.86669293, 2.333335326,"France"));
		cityList.add(new CityDTO("Barcelona", 41.38329958, 2.183370319,"Spain"));
		cityList.add(new CityDTO("Berlin", 52.52181866, 13.40154862,"Geramany"));
		cityList.add(new CityDTO("Madrid", 40.40002626, -3.683351686,"Spain"));
		
		//Asia
		cityList.add(new CityDTO("Mumbai", 19.01699038, 72.8569893,"India"));
		cityList.add(new CityDTO("Shanghai", 31.21645245, 121.4365047,"China"));
		cityList.add(new CityDTO("Bangalore", 12.96999514, 77.56000972,"India"));
		//cityList.add(new CityDTO("Bangalore", 12.96999514, 77.56000972,"India"));
		cityList.add(new CityDTO("Beijing", 39.92889223, 116.3882857,"China"));
		cityList.add(new CityDTO("Moscow", 55.75216412, 37.61552283,"Russia"));
		cityList.add(new CityDTO("Jakarta", -6.174417705, 106.8294376,"Indonesia"));
		
		
		//Rest
		cityList.add(new CityDTO("McMurdo Station", -77.73228239, 166.8694157,"Antartica"));
		cityList.add(new CityDTO("Sydney", -33.92001097, 151.1851798,"Australia"));
		
		
		
	}
	
	}
