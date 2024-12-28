package in.shubs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer AddrId;
	private String City;
	private String State;
	private String Country;
	
	@ManyToOne
	@JoinColumn(name = "empId")
	private Employee emp;

	public Integer getAddrId() {
		return AddrId;
	}

	public void setAddrId(Integer addrId) {
		AddrId = addrId;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Address [AddrId=" + AddrId + ", City=" + City + ", State=" + State + ", Country=" + Country + ", emp="
				+ emp + "]";
	}
	
	
	
}
