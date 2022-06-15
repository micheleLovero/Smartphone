package it.f2informatica.smartphone.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="marca")
public class Marca implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L ;
    
	public Marca() {
		
	}
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="nazionalita")
	private String nazionalita;
	
	@OneToOne(mappedBy = "marca")
    private Marca marca;
	
	public Marca(String brand, String nazionalita) {
		this.brand = brand;
		this.nazionalita= nazionalita;
		
	}
	
	
	public String getBrand() {
		return this.brand;
	}
	
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getNazionalita() {
		return this.nazionalita;
	}
	
	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}
	
}
