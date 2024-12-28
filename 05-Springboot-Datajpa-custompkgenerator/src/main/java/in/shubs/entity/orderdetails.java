package in.shubs.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "order_dtls")
@Setter
@Getter
public class orderdetails {
	
	@Id
	@GeneratedValue(generator = "orderidgen")
	@GenericGenerator(name = "orderidgen", type = in.shubs.generator.orderidgenerator.class )
	private String Order_id;
	
	private String order_by;
	
	@CreationTimestamp
	@Column(name = "Order_placeDate" , updatable = false)
	private LocalDateTime orderplacedate;
	
	public orderdetails() {
		// TODO Auto-generated constructor stub
	}

	public orderdetails(String order_id, String order_by, LocalDateTime orderplacedate) {
		super();
		Order_id = order_id;
		this.setOrder_by(order_by);
		this.orderplacedate = orderplacedate;
	}

	public String getOrder_by() {
		return order_by;
	}

	public void setOrder_by(String order_by) {
		this.order_by = order_by;
	}
	
	

}
