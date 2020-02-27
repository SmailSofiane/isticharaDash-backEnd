package dz.miclat.isticharaDash.dashBoard.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "commune")
public class Commune {
	
	@Column(name = "codew")
	private String codew;
	@Id
	private String codec;
	@Column
	private String LibelleC;
	@Column
	private String LibelleC_AR;

	//@JsonIgnore
	//@OneToMany(mappedBy = "commune")	
	//List<Aviscitoyen> aviscitoyen;
	
	@ManyToOne
	//@JsonManagedReference
	@JsonIgnore 
	@JoinColumn(name="codeW")
	private Wilaya wilaya;
		 
	
	
	public Commune() {
		super();
	}
	public Wilaya getWilaya() {
		return wilaya;
	}
	public void setWilaya(Wilaya wilaya) {
		this.wilaya = wilaya;
	}
	 
	 
	public String getCodew() {
		return codew;
	}
	public void setCodew(String codew) {
		this.codew = codew;
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
	/*public List<Aviscitoyen> getAviscitoyen() {
		return aviscitoyen;
	}
	public void setAviscitoyen(List<Aviscitoyen> aviscitoyen) {
		this.aviscitoyen = aviscitoyen;
	}*/

	
	
	
}
