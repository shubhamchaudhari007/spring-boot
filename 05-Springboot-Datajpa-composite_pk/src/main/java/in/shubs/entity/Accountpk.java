package in.shubs.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Accountpk {
	
	private Integer Acc_id;
	
	private String Acc_type;
	
	private Long Acc_no;

	public Integer getAcc_id() {
		return Acc_id;
	}

	public void setAcc_id(Integer acc_id) {
		Acc_id = acc_id;
	}

	public String getAcc_type() {
		return Acc_type;
	}

	public void setAcc_type(String acc_type) {
		Acc_type = acc_type;
	}

	public Long getAcc_no() {
		return Acc_no;
	}

	public void setAcc_no(Long acc_no) {
		Acc_no = acc_no;
	}

	@Override
	public String toString() {
		return "Accountpk [Acc_id=" + Acc_id + ", Acc_type=" + Acc_type + ", Acc_no=" + Acc_no + "]";
	}

	
	
	

}
