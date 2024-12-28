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
		
		studentrepository obj = context.getBean(studentrepository.class);
		System.out.println(obj.getClass().getName());
		
		student s = new student();
		s.setId(102);
		s.setName("omkar");
		s.setAge(51);
		s.setAddress("latur");
		s.setGrades('a');
		
		obj.save(s);
		System.out.println("record inserted");
	}

}
