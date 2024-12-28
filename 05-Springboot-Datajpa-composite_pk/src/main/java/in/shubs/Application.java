package in.shubs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shubs.entity.Account;
import in.shubs.entity.Accountpk;
import in.shubs.repository.Accountrepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		Accountrepository repo = context.getBean(Accountrepository.class);
		
		Accountpk pk = new Accountpk();
		pk.setAcc_id(1);
		pk.setAcc_no(12457622l);
		pk.setAcc_type("current");
		
		Account acc =new Account();
		acc.setAcc_branch("jamkhed");
		acc.setAcc_name("shubham");
		acc.setAccountpk(pk);
		
		repo.save(acc);
		
	}

}
