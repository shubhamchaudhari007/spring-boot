package in.shubs.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_dtls")
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
	
	@Column(name = "Active_SW")
	private String Activesw;
	
	@CreationTimestamp
	@Column(name = "Created_date" , updatable = false)
	private LocalDateTime createdate;
	
	@UpdateTimestamp
	@Column(name = "updated_date" , insertable = false)
	private LocalDateTime updatedate;
	
	public student() {
		// TODO Auto-generated constructor stub
	}
	
	

	public student(Integer id, String name, String gender, Long rank, String activesw) {
		
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.rank = rank;
		Activesw = activesw;
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

	public String getActivesw() {
		return Activesw;
	}

	public void setActivesw(String activesw) {
		Activesw = activesw;
	}

	public LocalDateTime getCreatedate() {
		return createdate;
	}

	public void setCreatedate(LocalDateTime createdate) {
		this.createdate = createdate;
	}

	public LocalDateTime getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(LocalDateTime updatedate) {
		this.updatedate = updatedate;
	}



	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", gender=" + gender + ", rank=" + rank + ", Activesw="
				+ Activesw + ", createdate=" + createdate + ", updatedate=" + updatedate + "]";
	}
	
	

}
