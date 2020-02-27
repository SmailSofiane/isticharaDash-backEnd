package dz.miclat.isticharaDash.dashBoard.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Wilaya")
public class Wilaya {
    @Id
	@Column(name = "codew")
  
	private String codew;
	
	@Column(name = "libelfr")
	private String libelFr;
	
	@Column(name = "libelar")
	private String libelAr;
 
	@Column(name="nbVotants")
	private int nbVotants;
	
/*
	@OneToMany(mappedBy="wilaya" ,fetch = FetchType.EAGER)
	//@JsonBackReference
	@JsonIgnore
	 @JsonProperty("communes")
	private List<Commune> comms;*/
	 
	public int getNbVotants() {
		return nbVotants;
	}

	public void setNbVotants(int nbVotants) {
		this.nbVotants = nbVotants;
	}

	public Wilaya() {
		super();
	}

	public String getCodew() {
		return codew;
	}

	public void setCodew(String codew) {
		this.codew = codew;
	}

	public String getLibelFr() {
		return libelFr;
	}

	public void setLibelFr(String libelFr) {
		this.libelFr = libelFr;
	}

	public String getLibelAr() {
		return libelAr;
	}

	public void setLibelAr(String libelAr) {
		this.libelAr = libelAr;
	}

	 

	 

}
