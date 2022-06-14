package it.f2informatica.smartphone.service;

import java.util.List;

import it.f2informatica.smartphone.model.Os;


public interface osService {

	List<Os> getAll();

	int postOs(Os o);
	
	
}
