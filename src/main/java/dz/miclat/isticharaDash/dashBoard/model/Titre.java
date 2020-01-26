package dz.miclat.isticharaDash.dashBoard.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Titre")
public class Titre {

	@Id 
	@Column(name = "codeTitre")
	private int codeTitre;


	@Column(name = "libRub")
	private String libRub;

	
	
	public int getCodeTitre() {
		return codeTitre;
	}

	public void setCodeTitre(int codeTitre) {
		this.codeTitre = codeTitre;
	}

	//@JsonIgnore
	/*@OneToMany(mappedBy = "titre",cascade = CascadeType.ALL)
	private List<Project> projets;

	public List<Project> getProjets() {
		return projets;
	}

	public void setProjets(List<Project> projets) {
		this.projets = projets;
	}*/

	 
	public String getLibRub() {
		return libRub;
	}

	public void setLibRub(String libRub) {
		this.libRub = libRub;
	}

}
