package it.f2informatica.smartphone.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import it.f2informatica.smartphone.model.Marca;
import it.f2informatica.smartphone.service.marcaService;


	@Repository
	public class marcaRepository implements marcaService {

		@Autowired //crea template
		JdbcTemplate jdbcTemplate;
		
		@Override
		public List<Marca> findAllGetMarca() {
			return jdbcTemplate.query("SELECT * FROM marca", BeanPropertyRowMapper.newInstance(Marca.class));
			
		}

		@Override
		public int findPostAllMarca(Marca marca) {
			return jdbcTemplate.update("INSERT INTO marca (brand , nazionalita) VALUE(?,?)", new Object[] {marca.getBrand(), marca.getNazionalita()});
		
			
		}
}
