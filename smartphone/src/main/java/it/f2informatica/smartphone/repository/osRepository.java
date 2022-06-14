package it.f2informatica.smartphone.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import it.f2informatica.smartphone.model.Os;
import it.f2informatica.smartphone.service.osService;

@Repository
public class osRepository implements osService{
	@Autowired
	JdbcTemplate jdbcTemplate;
	

	@Override
	public List<Os> getAll() {
		return jdbcTemplate.query("SELECT * FROM os", BeanPropertyRowMapper.newInstance(Os.class));
	}
	
	@Override
	public int postOs(Os o) {
		return jdbcTemplate.update("INSERT INTO os (company,descrizione,open_source) VALUE(?,?,?)", new Object[] {o.getCompany(),o.getDescrizione(),o.getOpen_source()});
	}
}
