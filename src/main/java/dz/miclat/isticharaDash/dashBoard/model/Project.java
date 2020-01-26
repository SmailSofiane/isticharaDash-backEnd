package dz.miclat.isticharaDash.dashBoard.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import dz.miclat.isticharaDash.dashBoard.model.embeddedId.Projetid;

@Entity
@Table(name = "listprojets")
public class Project {

	@EmbeddedId
	private Projetid projetId;

	@Column(name = "libprojet")
	private String libprojet;

	@Column(name = "libprojetFr")
	private String libprojetFr;

	//@JsonIgnore
	@OneToMany(mappedBy = "projet",fetch = FetchType.LAZY)
	private List<Aviscitoyen> aviscitoyen;

	
	
	public Project() {
		super();
	}

	public Project(Projetid projetId, String libprojet, String libprojetFr, List<Aviscitoyen> aviscitoyen,
			Titre titre) {
		super();
		this.projetId = projetId;
		this.libprojet = libprojet;
		this.libprojetFr = libprojetFr;
		this.aviscitoyen = aviscitoyen;
		this.titre = titre;
	}

	/*
	 * @OneToOne private Aviscitoyen aviscitoyen;
	 */
	@ManyToOne
	@JoinColumn(name = "codeTitre", referencedColumnName = "codeTitre", insertable = false, updatable = false)
	private Titre titre;

	public Titre getTitre() {
		return titre;
	}

	public void setTitre(Titre titre) {
		this.titre = titre;
	}

	public List<Aviscitoyen> getAviscitoyen() {
		return aviscitoyen;
	}

	public void setAviscitoyen(List<Aviscitoyen> aviscitoyen) {
		this.aviscitoyen = aviscitoyen;
	}

	/*
	 * public Aviscitoyen getAviscitoyen() { return aviscitoyen; }
	 * 
	 * public void setAviscitoyen(Aviscitoyen aviscitoyen) { this.aviscitoyen =
	 * aviscitoyen; }
	 */
	public Projetid getProjetId() {
		return projetId;
	}

	public void setProjetId(Projetid projetId) {
		this.projetId = projetId;
	}

	public String getLibprojet() {
		return libprojet;
	}

	public void setLibprojet(String libprojet) {
		this.libprojet = libprojet;
	}

	public String getLibprojetFr() {
		return libprojetFr;
	}

	public void setLibprojetFr(String libprojetFr) {
		this.libprojetFr = libprojetFr;
	}

}
