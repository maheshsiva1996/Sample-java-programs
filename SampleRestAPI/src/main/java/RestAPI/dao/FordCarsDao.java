package RestAPI.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import RestAPI.model.FordCars;

@Repository
public class FordCarsDao {
	
	Map<Integer, FordCars> carData = new HashMap<Integer, FordCars>();

	public FordCarsDao() {
		
		FordCars ecoSport = new FordCars("ecoSport", 7.91, 15, 5, "Orange", 4.5);
		FordCars figo = new FordCars("figo", 5.91, 16, 4, "white", 4.0);
		FordCars kuga = new FordCars("kuga", 9, 13, 5, "Black", 4.5);
		
		this.carData.put(1, ecoSport);
		this.carData.put(2, figo);
		this.carData.put(3, kuga);		
		
	}

	public List<FordCars> getFordCars() {
		// TODO Auto-generated method stub
		List<FordCars> carList = new ArrayList<FordCars>();
		Set<Integer> carSet = carData.keySet();
		carSet.forEach(key -> carList.add(carData.get(key)));
		return carList;
	}

}
