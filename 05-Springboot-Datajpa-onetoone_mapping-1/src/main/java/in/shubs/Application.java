package in.shubs;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shubs.entity.passport;
import in.shubs.entity.person;
import in.shubs.repository.passportrepo;
import in.shubs.repository.personrepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		personrepo repo =  context.getBean(personrepo.class);
		
		passportrepo pas = context.getBean(passportrepo.class);
		
		person p1= new person();
		p1.setPersonName("Shubham");
		p1.setPersonGender("male");
		
		passport pass = new passport();
		pass.setPasssportNum(123456);
		pass.setIssuedate(LocalDate.now());
		pass.setExpirydate(LocalDate.now().plusYears(10));
		
		p1.setPass(pass);
		pass.setPerson(p1);
		
		repo.save(p1);
	}

}
