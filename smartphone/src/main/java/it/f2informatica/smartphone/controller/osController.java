package it.f2informatica.smartphone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.f2informatica.smartphone.model.Os;
import it.f2informatica.smartphone.service.osService;

@RestController
@RequestMapping("/api")
public class osController {
	
	@Autowired
	//@Qualifier("MYSQL")
	osService repo;
	
	@GetMapping(path="/os")
	public List<Os> allOs(){
		return repo.getAll();
	}
	
	@PostMapping(path="/os")
	public ResponseEntity<String> postOs(@RequestBody Os newOs) {
		
		if(this.repo.postOs(newOs)>0) {
			return new ResponseEntity<String>("Ok", HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>("KO", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


}
