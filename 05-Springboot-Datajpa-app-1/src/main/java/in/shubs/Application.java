package in.shubs;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shubs.entity.student;
import in.shubs.repository.studentrepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		studentrepository repo = context.getBean(studentrepository.class);
		
//		List<student> youngs = repo.findByAgeLessThanEqual(50);
//		youngs.forEach(System.out::println);
		
//		List<student> grade = repo.findByGrades('a');
//		grade.forEach(System.out::println);
//		
//		List<student> off = repo.findByGradesAndAgeLessThan('a', 50);
//		off.forEach(System.out::println);
		
//		List<student> bysql = repo.getallstudents();
//		bysql.forEach(System.out::println);
		
		List<student> byhql = repo.getstudent();
		byhql.forEach(System.out::println);
	
	}

}
