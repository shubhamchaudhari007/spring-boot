package in.shubs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shubs.entity.product;
import in.shubs.repository.productrepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		productrepository repo = context.getBean(productrepository.class);
		
		product p1 = new product();
		p1.setProductname("mouse");
		p1.setProductprice(20d);
		repo.save(p1);
	}

}
