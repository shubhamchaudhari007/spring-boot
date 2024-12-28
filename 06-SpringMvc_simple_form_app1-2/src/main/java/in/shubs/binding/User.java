package in.shubs.binding;

public class User {
	
	
	private String Name;
	private String Email;
	private Integer Phone;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Integer getPhone() {
		return Phone;
	}
	public void setPhone(Integer phone) {
		Phone = phone;
	}
	@Override
	public String toString() {
		return "User [Name=" + Name + ", Email=" + Email + ", Phone=" + Phone + "]";
	}
	

}
