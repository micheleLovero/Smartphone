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
@Table(name="os")
public class Os implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public Os() {
    }
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	
	@Column(name="descrizione")
	private String descrizione;
	
	@Column(name="company")
	private String company;
	
	@Column(name="open_source")
	private int open_source;
	
	@OneToOne(mappedBy = "os")
    private Os os;
	
	public Os(String descrizione, String company, int open_source) {
		this.descrizione = descrizione;
		this.company = company;
		this.open_source = open_source;
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getOpen_source() {
		return open_source;
	}

	public void setOpen_source(int open_source) {
		this.open_source = open_source;
	}
}

