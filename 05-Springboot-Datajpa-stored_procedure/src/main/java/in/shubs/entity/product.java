package in.shubs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class product {
	
	@Id
	private Integer productid;
	
	private String productname;
	
	private Double productprice;

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
