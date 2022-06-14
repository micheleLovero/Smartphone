package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Smartphone;


public interface smartphoneService {

	List<Smartphone> findAll();
	
	
	int findPostAll(Smartphone smartphone);
}
