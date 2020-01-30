package dz.miclat.isticharaDash.dashBoard.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Wilaya")
public class Wilaya {
    @Id
	@Column(name = "codeW")
	private String codeW;
	
	@Column(name = "libelFr")
	private String libelFr;
	
	@Column(name = "libelAr")
	private String libelAr;
		
	@OneToMany(mappedBy="wilaya" ,fetch = FetchType.EAGER)
	List<Commune> commune;
	
	public String getCodeW() {
		return codeW;
	}

	public void setCodeW(String codeW) {
		this.codeW = codeW;
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
