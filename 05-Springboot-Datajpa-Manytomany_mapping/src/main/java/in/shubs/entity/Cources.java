package in.shubs.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cources_tbl")
public class Cources {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer CourceId;
	private String CourceName;
	private Integer Fees;
	private String Abreviation;
	
	@ManyToMany(mappedBy = "cources",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Students> stud;

	public Integer getCourceId() {
		return CourceId;
	}

	public void setCourceId(Integer courceId) {
		CourceId = courceId;
	}

	public String getCourceName() {
		return CourceName;
	}

	public void setCourceName(String courceName) {
		CourceName = courceName;
	}

	
	public Integer getFees() {
		return Fees;
	}

	public void setFees(Integer fees) {
		Fees = fees;
	}

	public String getAbreviation() {
		return Abreviation;
	}

	public void setAbreviation(String abreviation) {
		Abreviation = abreviation;
	}

	public List<Students> getStud() {
		return stud;
	}

	public void setStud(List<Students> stud) {
		this.stud = stud;
	}

}
