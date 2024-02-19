package com.Jaya;

import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> metroCities = new HashSet<String>();
		metroCities.add("Delhi");
		metroCities.add("Mumbai");
		metroCities.add("Kolkata");
		metroCities.add("Chennai");
		metroCities.add("Bengaluru");
		metroCities.add("Hyderabad");
		Iterator<String> metroItr = metroCities.iterator();
		
		while(metroItr.hasNext()) {
			System.out.println(metroItr.next());
		}
		System.out.println("\n\n");
		List<String> Cities = new ArrayList<String>();
		Cities.add("Delhi");
		Cities.add("Mumbai");
		Cities.add("Chennai");
		Cities.add("Chennai");
		Cities.add("Delhi");
		Cities.add("Hyderabad");
		Iterator<String> cityItr = Cities.iterator();
		
		while(cityItr.hasNext()) {
			System.out.println(cityItr.next());
		}
		
	}

}
