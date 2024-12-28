package in.shubs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_dtl")
public class student {
	
	@Id
	@Column(name = "stud_id")
	private Integer id;
	
	@Column(name = "stud_name")
	private String name;
	
	@Column(name = "stud_gender")
	private String gender;
	
	@Column(name = "stud_rank")
	private Long rank;
	
	public student() {
		// TODO Auto-generated constructor stub
	}

	public student(Integer id, String name, String gender, Long rank) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.rank = rank;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getRank() {
		return rank;
	}

	public void setRank(Long rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", gender=" + gender + ", rank=" + rank + "]";
	}
	
	
	
	

}
