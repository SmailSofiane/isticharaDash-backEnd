package dz.miclat.isticharaDash.dashBoard.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import dz.miclat.isticharaDash.dashBoard.model.embeddedId.Projectid;

@Entity
@Table(name = "listprojetsCom")
public class Project {

	@EmbeddedId
	private Projectid projetId;

	@Column(name = "libprojet")
	private String libprojet;

	 
	@Column (name="nbVotants")
	private String nbVotants;

	//@JsonIgnore
	///@OneToMany(mappedBy = "projet",fetch = FetchType.LAZY)
	//private List<Aviscitoyen> aviscitoyen;

	 
	
	public String getNbVotants() {
		return nbVotants;
	}


	public void setNbVotants(String nbVotants) {
		this.nbVotants = nbVotants;
	}


	
 

	/*
	 * @OneToOne private Aviscitoyen aviscitoyen;
	 */
	/*@ManyToOne
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
*/
	/*
	 * public Aviscitoyen getAviscitoyen() { return aviscitoyen; }
	 * 
	 * public void setAviscitoyen(Aviscitoyen aviscitoyen) { this.aviscitoyen =
	 * aviscitoyen; }
	 */
	public Projectid getProjetId() {
		return projetId;
	}

	public void setProjetId(Projectid projetId) {
		this.projetId = projetId;
	}

	public String getLibprojet() {
		return libprojet;
	}

	public void setLibprojet(String libprojet) {
		this.libprojet = libprojet;
	}

	 
}
