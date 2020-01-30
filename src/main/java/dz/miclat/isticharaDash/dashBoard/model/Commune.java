package dz.miclat.isticharaDash.dashBoard.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "commune")
public class Commune {

	
	@Column(name = "codeW")
	private String CodeW;
	@Id
	private String codec;
	@Column
	private String LibelleC;
	@Column
	private String LibelleC_AR;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "commune")	
	List<Aviscitoyen> aviscitoyen;
	
	@ManyToOne
	Wilaya wilaya;
	
	
	 
	public String getCodeW() {
		return CodeW;
	}
	public void setCodeW(String codeW) {
		CodeW = codeW;
	}
	 
	public String getCodec() {
		return codec;
	}
	public void setCodec(String codec) {
		this.codec = codec;
	}
	public String getLibelleC() {
		return LibelleC;
	}
	public void setLibelleC(String libelleC) {
		LibelleC = libelleC;
	}
	public String getLibelleC_AR() {
		return LibelleC_AR;
	}
	public void setLibelleC_AR(String libelleC_AR) {
		LibelleC_AR = libelleC_AR;
	}
	public List<Aviscitoyen> getAviscitoyen() {
		return aviscitoyen;
	}
	public void setAviscitoyen(List<Aviscitoyen> aviscitoyen) {
		this.aviscitoyen = aviscitoyen;
	}

	
	
	
}
