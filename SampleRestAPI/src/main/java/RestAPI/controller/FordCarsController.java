package RestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RestAPI.dao.FordCarsDao;
import RestAPI.model.FordCars;

@RestController
@RequestMapping("/api")
public class FordCarsController {
	
	@Autowired
	FordCarsDao fordCarsDao;
	
	@GetMapping("/fordcars")
	public  List<FordCars> getFordCars(){
		
		return fordCarsDao.getFordCars();
		
	}

}
