package in.shubs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class student {
	
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private Integer age;
	@Column(name = "address")
	private String address;
	@Column(name = "grades")
	private Character grades;
	
//	public student() {
//		// TODO Auto-generated constructor stub
//	}
//	public student(Integer id,String name,Integer age,String address,Character grades) {
//		this.id=id;
//		this.address=address;
//		this.name = name;
//		this.age = age;
//		this.grades=grades;
//	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setGrades(Character grades) {
		this.grades = grades;
	}


}
