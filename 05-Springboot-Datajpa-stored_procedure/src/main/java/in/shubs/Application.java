package in.shubs;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shubs.entity.product;
import in.shubs.repository.productrepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		productrepo repo = context.getBean(productrepo.class);
		
		 List<product> prods = repo.getproducts();
		 prods.forEach(System.out::println);
	}

}
