package in.shubs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shubs.entity.student;
import in.shubs.repository.studentrepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		studentrepository studrepo = context.getBean(studentrepository.class);
		
		student stud = studrepo.findById(101).get();
		stud.setActivesw("N");
		
		studrepo.save(stud);
		
		System.out.println("record saved");
	}

}
