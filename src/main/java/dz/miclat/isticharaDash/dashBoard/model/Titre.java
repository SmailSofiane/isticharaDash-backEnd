package dz.miclat.isticharaDash.dashBoard.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Titre")
public class Titre {

	@Id 
	@Column(name = "num")
	private int num;

	@Column(name = "libRub")
	private String libRub;

	@Column(name="nbVotants")
	private int nbVotants;
	 	 
	public int getNbVotants() {
		return nbVotants;
	}

	public void setNbVotants(int nbVotants) {
		this.nbVotants = nbVotants;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getLibRub() {
		return libRub;
	}

	public void setLibRub(String libRub) {
		this.libRub = libRub;
	}

}
