package in.shubs.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class person {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer personId;
	private String personName;
	private String personGender;
	
	@OneToOne(mappedBy = "Person",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private passport pass;

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonGender() {
		return personGender;
	}

	public void setPersonGender(String personGender) {
		this.personGender = personGender;
	}

	public passport getPass() {
		return pass;
	}

	public void setPass(passport pass) {
		this.pass = pass;
	}

}
