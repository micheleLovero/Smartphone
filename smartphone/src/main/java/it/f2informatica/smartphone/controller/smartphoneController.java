package it.f2informatica.smartphone.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.f2informatica.smartphone.model.Smartphone;
import it.f2informatica.smartphone.service.smartphoneService;

@RestController
@RequestMapping("/api")
public class smartphoneController {

	@Autowired
	//@Qualifier("MYSQL")
	smartphoneService repo;
	
	@GetMapping(path="/smartphone")
	public List<Smartphone> allSmartphone(){
		return repo.findAll();
	}

	@PostMapping(path="/postSmartphone")
	public ResponseEntity<String> allSmartphonePost(@RequestBody Smartphone smartphone) {
		
		if(this.repo.findPostAll(smartphone)>0) {
			return new ResponseEntity<String>("Ok", HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>("KO", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
