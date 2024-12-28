package in.shubs;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.shubs.entity.student;
import in.shubs.repository.studentrepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		studentrepository studentrepo = context.getBean(studentrepository.class);
		
		//pagination / paging
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter page no");
//		int pageno = sc.nextInt();
//		
//		int pagesize = 3;
//		PageRequest pagereq = PageRequest.of(pageno-1, pagesize);
//		Page<student> page = studentrepo.findAll(pagereq);
//		List<student> studs= page.getContent();
//		studs.forEach(System.out::println);
		
		
		
		//sorting using jparepository
//		List<student> students = studentrepo.findAll(Sort.by("gender").descending());
//		students.forEach(System.out::println);
		
		
		//Query By Example
		
		student s = new student();
		s.setGender("male");
		s.setRank(90l);
		
		Example<student> exp = Example.of(s);
		List<student> stud = studentrepo.findAll(exp);
		stud.forEach(System.out::println);
	}

}
