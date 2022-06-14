package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Marca;




public interface  marcaService {

List<Marca> findAllGetMarca() ;
	
	int findPostAllMarca(Marca smartphone);
}
