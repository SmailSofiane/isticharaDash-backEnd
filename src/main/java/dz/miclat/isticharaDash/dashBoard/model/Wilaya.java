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
 

	@OneToMany(mappedBy="wilaya" ,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JsonBackReference
	List<Commune> commune;
	
	 

	public List<Commune> getCommune() {
		return commune;
	}

	public void setCommune(List<Commune> commune) {
		this.commune = commune;
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
