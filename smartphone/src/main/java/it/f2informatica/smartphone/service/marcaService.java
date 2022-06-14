package it.f2informatica.smartphone.service;

import java.util.List;

import it.f2informatica.smartphone.model.Marca;



public interface marcaService {


List<Marca> findAllGetMarca() ;
	
	int findPostAllMarca(Marca smartphone);
}
