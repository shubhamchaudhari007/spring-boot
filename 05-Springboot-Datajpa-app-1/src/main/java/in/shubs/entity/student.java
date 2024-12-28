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
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "grades")
	private Character grades;
	
	@Column(name = "age")
	private Integer age;
	
	public student() {
		// TODO Auto-generated constructor stub
	}

	public student(Integer id, String name, String address, Character grades, Integer age) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.grades = grades;
		this.age = age;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Character getGrades() {
		return grades;
	}

	public void setGrades(Character grades) {
		this.grades = grades;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", address=" + address + ", grades=" + grades + ", age=" + age
				+ "]";
	}
	
	
}
