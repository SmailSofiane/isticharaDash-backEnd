package dz.miclat.isticharaDash.dashBoard.model.embeddedId;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Projectid implements Serializable {

	@Column(name="codeTitre")
	private int codeTitre;
	@Column(name="codeprojet")
	private int codeprojet;

	public Projectid() {
		super();
		// TODO Auto-generated constructor stub
	}

	 
	public int getCodeTitre() {
		return codeTitre;
	}


	public void setCodeTitre(int codeTitre) {
		this.codeTitre = codeTitre;
	}


	public int getCodeprojet() {
		return codeprojet;
	}

	public void setCodeprojet(int codeprojet) {
		this.codeprojet = codeprojet;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codeTitre;
		result = prime * result + codeprojet;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projectid other = (Projectid) obj;
		if (codeTitre != other.codeTitre)
			return false;
		if (codeprojet != other.codeprojet)
			return false;
		return true;
	}

 

}
