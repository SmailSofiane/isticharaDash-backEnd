package dz.miclat.isticharaDash.dashBoard.model.embeddedId;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AviscitoyenId implements Serializable {
	
	@Column(name="num")
	private String num;
	@Column(name="nin")
	private String nin;
	
	
	
	public AviscitoyenId() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nin == null) ? 0 : nin.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
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
		AviscitoyenId other = (AviscitoyenId) obj;
		if (nin == null) {
			if (other.nin != null)
				return false;
		} else if (!nin.equals(other.nin))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}


 



	 
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getNin() {
		return nin;
	}
	public void setNin(String nin) {
		this.nin = nin;
	}
	

}
