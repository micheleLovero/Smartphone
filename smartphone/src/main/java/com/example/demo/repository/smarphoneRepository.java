package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Smartphone;
import com.example.demo.service.smartphoneService;

@Repository
public class smarphoneRepository implements smartphoneService{

	@Autowired //crea template
	JdbcTemplate jdbcTemplate;// interroga il adtabase
	
	
	@Override
	public List<Smartphone> findAll() {
		
		return jdbcTemplate.query("SELECT * FROM smartphone", BeanPropertyRowMapper.newInstance(Smartphone.class));
		
		
	}


	@Override
	public int findPostAll(Smartphone smartphone) {
		
		return jdbcTemplate.update("INSERT INTO smartphone (cpu, dimensioni, display_ppi, display_resolution, display_size, nome , note, peso, ram) VALUE(?,?,?,?,?,?,?,?,?)", new Object[] {smartphone.getCpu(), smartphone.getDimensioni(), smartphone.getDisplay_pp(), smartphone.getDisplay_resolution(), smartphone.getDisplay_size(), smartphone.getNome() , smartphone.getNote(),  smartphone.getPeso() ,smartphone.getRam()});
	}
	
	
	

	
}
