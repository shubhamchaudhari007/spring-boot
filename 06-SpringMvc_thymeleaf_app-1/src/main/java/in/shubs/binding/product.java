package in.shubs.binding;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class product {
	
	@NotNull(message = "id is required")
	private Integer pid;
	@NotEmpty(message = "pname is required")
	private String pname;
	@NotNull(message = "pprice is required")
	private Long pprice;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Long getPprice() {
		return pprice;
	}
	public void setPprice(Long pprice) {
		this.pprice = pprice;
	}
	@Override
	public String toString() {
		return "product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}
	
	

}
