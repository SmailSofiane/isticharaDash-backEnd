package dz.miclat.isticharaDash.dashBoard.model.embeddedId;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Projectid implements Serializable {

	@Column(name="codeArticl")
	private int codeArticl;
	@Column(name="codeprojet")
	private int codeprojet;

	public Projectid() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	public int getCodeArticl() {
		return codeArticl;
	}

	public void setCodeArticl(int codeArticl) {
		this.codeArticl = codeArticl;
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
		result = prime * result + codeArticl;
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
		if (codeArticl != other.codeArticl)
			return false;
		if (codeprojet != other.codeprojet)
			return false;
		return true;
	}

 

}
