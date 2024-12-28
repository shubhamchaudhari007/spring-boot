package in.shubs.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class passport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer PassportId;
	
	public Integer getPassportId() {
		return PassportId;
	}

	public void setPassportId(Integer passportId) {
		PassportId = passportId;
	}

	public Integer getPasssportNum() {
		return PasssportNum;
	}

	public void setPasssportNum(Integer passsportNum) {
		PasssportNum = passsportNum;
	}

	public LocalDate getIssuedate() {
		return Issuedate;
	}

	public void setIssuedate(LocalDate issuedate) {
		Issuedate = issuedate;
	}

	public LocalDate getExpirydate() {
		return Expirydate;
	}

	public void setExpirydate(LocalDate expirydate) {
		Expirydate = expirydate;
	}

	public person getPerson() {
		return Person;
	}

	public void setPerson(person person) {
		Person = person;
	}

	private Integer PasssportNum;
	
	private LocalDate Issuedate;
	
	private LocalDate Expirydate;
	
	@OneToOne
	@JoinColumn(name = "personId")
	private person Person;

}
