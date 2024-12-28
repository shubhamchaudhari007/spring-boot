package in.shubs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

@Entity

public class product {
	
	@Id
	@TableGenerator(initialValue = 100, name = "pid", table = "pid_seq")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "pid")
	private Integer productid;
	private String productname;
	private Double productprice;
	
	public product() {
		// TODO Auto-generated constructor stub
	}

	public product(Integer productid, String productname, Double productprice) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
	}

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Double getProductprice() {
		return productprice;
	}

	public void setProductprice(Double productprice) {
		this.productprice = productprice;
	}

	@Override
	public String toString() {
		return "product [productid=" + productid + ", productname=" + productname + ", productprice=" + productprice
				+ "]";
	}
	
	

}
