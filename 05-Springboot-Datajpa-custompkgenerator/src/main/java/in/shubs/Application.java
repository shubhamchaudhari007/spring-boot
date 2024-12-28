package in.shubs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shubs.entity.orderdetails;
import in.shubs.repository.orderreository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		
		orderreository repo = context.getBean(orderreository.class);
		
		orderdetails dts = new orderdetails();
		dts.setOrder_by("shubham");
		
		repo.save(dts);
	}

}
