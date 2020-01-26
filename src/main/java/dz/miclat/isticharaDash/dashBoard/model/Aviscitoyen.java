package dz.miclat.isticharaDash.dashBoard.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import dz.miclat.isticharaDash.dashBoard.model.embeddedId.AviscitoyenId;

@Entity
@Table(name = "Aviscitoyen")
public class Aviscitoyen {

	@EmbeddedId
	private AviscitoyenId aviscitoyenId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "CodeCR", referencedColumnName = "codec", insertable = false, updatable = false)
	private Commune commune;
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "codeTitre", referencedColumnName = "codeTitre", insertable = false, updatable = false),
			@JoinColumn(name = "codeprojet", referencedColumnName = "codeprojet", insertable = false, updatable = false) })
	private Project projet;

	@Column
	private String remarque;
	
	@Column
	private String adress;


	public Aviscitoyen() {
		super();
		// TODO Auto-generated constructor stub
	}

	 

	public Commune getCommune() {
		return commune;
	}



	public void setCommune(Commune commune) {
		this.commune = commune;
	}



	public Project getProjet() {
		return projet;
	}

	public void setProjet(Project projet) {
		this.projet = projet;
	}

	public AviscitoyenId getAviscitoyenId() {
		return aviscitoyenId;
	}

	public void setAviscitoyenId(AviscitoyenId aviscitoyenId) {
		this.aviscitoyenId = aviscitoyenId;
	}

	 

	public String getRemarque() {
		return remarque;
	}

	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}
