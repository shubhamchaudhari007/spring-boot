package in.shubs.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Account {
	
	private String Acc_name;
	private String Acc_branch;
	
	@EmbeddedId
	private Accountpk accountpk;

	public String getAcc_name() {
		return Acc_name;
	}

	public void setAcc_name(String acc_name) {
		Acc_name = acc_name;
	}

	public String getAcc_branch() {
		return Acc_branch;
	}

	public void setAcc_branch(String acc_branch) {
		Acc_branch = acc_branch;
	}

	public Accountpk getAccountpk() {
		return accountpk;
	}

	public void setAccountpk(Accountpk accountpk) {
		this.accountpk = accountpk;
	}

	@Override
	public String toString() {
		return "Account [Acc_name=" + Acc_name + ", Acc_branch=" + Acc_branch + ", accountpk=" + accountpk + "]";
	}
	
	
	
	

}
