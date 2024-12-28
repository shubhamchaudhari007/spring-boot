package in.shubs.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "Studt_Dtl")
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer StudentId;
	private String StudentName;
	private String StudentGender;
	private Integer studentAge;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name = "Student_course_table",
	joinColumns = {
			@JoinColumn(name = "students_id" ,referencedColumnName = "StudentId")
	},
	 inverseJoinColumns = {
			 @JoinColumn(name = "Cources", referencedColumnName = "Courceid")
	 })
	private List<Cources> cources;

	public Integer getStudentId() {
		return StudentId;
	}

	public void setStudentId(Integer studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentGender() {
		return StudentGender;
	}

	public void setStudentGender(String studentGender) {
		StudentGender = studentGender;
	}

	public Integer getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	public List<Cources> getCources() {
		return cources;
	}

	public void setCources(List<Cources> cources) {
		this.cources = cources;
	}
	

}
