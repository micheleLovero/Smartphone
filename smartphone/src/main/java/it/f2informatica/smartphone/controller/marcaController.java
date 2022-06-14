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

import it.f2informatica.smartphone.model.Marca;
import it.f2informatica.smartphone.service.marcaService;



@RestController
@RequestMapping("/api")
public class marcaController {
	@Autowired
	//@Qualifier("MYSQL")
	marcaService repoMarca;
	
	@GetMapping(path="/marca")
	public List<Marca> allMarca(){
		return repoMarca.findAllGetMarca();
	}
	
	@PostMapping(path="/postMarca")
	public ResponseEntity<String> allSmartphonePost(@RequestBody Marca marca) {
		
		if(this.repoMarca.findPostAllMarca(marca)>0) {
			return new ResponseEntity<String>("Ok", HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>("KO", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}