package co.worldMap.util;

import java.util.List;

import com.worldMap.dto.CityDTO;

public class CityDistance {

	public static double getDistanceBwCities(CityDTO city1, CityDTO city2) {
		double distance = 0;
		double dLat = (double) Math.toRadians(city2.getLatitude() - city1.getLatitude());
		double dLon = (double) Math.toRadians(city2.getLogitude() - city1.getLogitude());
		double a = (double) (Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(Math.toRadians(city1.getLatitude()))
				* Math.cos(Math.toRadians(city2.getLatitude())) * Math.sin(dLon / 2) * Math.sin(dLon / 2));
		double c = (double) (2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a)));
		distance = CityDTO.RADIUS * c;

		return distance;
	}
	
	public static double getTotalDistance(List<CityDTO> cityList){
		double totalDist=0;
		
		for(int i=0;i<cityList.size()-1;i++){
			totalDist=totalDist+getDistanceBwCities(cityList.get(i), cityList.get(i+1));
		}
		
		return totalDist;
	}

}
