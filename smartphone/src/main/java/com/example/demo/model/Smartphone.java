package com.example.demo.model;

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
@Table(name="smartphone")
public class Smartphone implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L ;
    public Smartphone() {
    	
    }
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="ram")
	private String ram;
	
	@Column(name="cpu")
	private String cpu;
	
	@Column(name="display_ppi")
	private int display_ppi;
	
	@Column(name="display_size")
	private String display_size;
	
	@Column(name="display_resolution")
	private String display_resolution;
	
	@Column(name="dimensioni")
	private String dimensioni;
	
	@Column(name="peso")
	private int peso;
	
	@Column(name="note")
	private String note;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_marca")
	private Marca id_marca;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_os")
	private Os id_os;
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getDisplay_pp() {
		return display_ppi;
	}

	public void setDisplay_pp(int display_pp) {
		this.display_ppi = display_pp;
	}

	public String getDisplay_size() {
		return display_size;
	}

	public void setDisplay_size(String display_size) {
		this.display_size = display_size;
	}

	public String getDisplay_resolution() {
		return display_resolution;
	}

	public void setDisplay_resolution(String display_resolution) {
		this.display_resolution = display_resolution;
	}

	public String getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(String dimensioni) {
		this.dimensioni = dimensioni;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Marca getMarca() {
		return id_marca;
	}

	public void setMarca(Marca marca) {
		this.id_marca = marca;
	}

	public Os getOs() {
		return id_os;
	}

	public void setOs(Os os) {
		this.id_os = os;
	}

	@Override
	public String toString() {
		return "Smartphone [id=" + id + ", nome=" + nome + ", ram=" + ram + ", cpu=" + cpu + ", display_pp="
				+ display_ppi + ", display_size=" + display_size + ", display_resolution=" + display_resolution
				+ ", dimensioni=" + dimensioni + ", peso=" + peso + ", note=" + note + ", marca=" + id_marca + ", os=" + id_os
				+ "]";
	}
	
}

