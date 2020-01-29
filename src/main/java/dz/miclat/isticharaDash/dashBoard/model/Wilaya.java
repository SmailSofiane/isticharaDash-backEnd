package dz.miclat.isticharaDash.dashBoard.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Wilaya")
public class Wilaya {
	

	private String codeW;
	private String libelFr;
	private String libelAr;
	private int nbVotants;
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
	public int getNbVotants() {
		return nbVotants;
	}
	public void setNbVotants(int nbVotants) {
		this.nbVotants = nbVotants;
	}

}
