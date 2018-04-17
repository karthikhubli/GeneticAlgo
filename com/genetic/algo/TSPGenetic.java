package com.genetic.algo;

import com.worldMap.dto.CityDTO;

public class TSPGenetic {
	
	public void createRoute(){
		TSP_DTO bostonHome= new TSP_DTO(new CityDTO("Boston", 42.32996014, -71.07001367,"United States of America"));
		bostonHome.display();
	}

}
