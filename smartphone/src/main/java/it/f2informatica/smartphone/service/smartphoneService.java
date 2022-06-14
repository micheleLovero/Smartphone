package it.f2informatica.smartphone.service;

import java.util.List;

import it.f2informatica.smartphone.model.Smartphone;




public interface smartphoneService {

	List<Smartphone> findAll();
	
	
	int findPostAll(Smartphone smartphone);
}
