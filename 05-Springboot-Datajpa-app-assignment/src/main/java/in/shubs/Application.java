package in.shubs;

import java.util.List;

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
		
		studentrepository studrepo = context.getBean(studentrepository.class);
		

		
//		List<student> repo= studrepo.getallstudents();
//		repo.forEach(System.out::println);
		
//		List<student> repo1 = studrepo.getbyhql();
//		repo1.forEach(System.out::println);
		
//		List<student> repo2 = studrepo.getbysql1();
//		repo2.forEach(System.out::println);
		
//		List<student> repo3 = studrepo.getbyhql1();
//		repo3.forEach(System.out::println);
		
//		List<student> repo3 = studrepo.getbysql2();
//		repo3.forEach(System.out::println);
//		
//		List<student> repo4 = studrepo.getbyhql2();
//		repo4.forEach(System.out::println);
//		
//		List<student> repo5= studrepo.getbysql3();
//		repo5.forEach(System.out::println);
		
//		PageRequest page = PageRequest.of(0, 3);
//		Page<student> pag = studrepo.findAll(page);
//		List<student> str= pag.getContent();
//		str.forEach(System.out::println);
		
		
//		List<student> stud = studrepo.findAll(Sort.by("gender"));
//		stud.forEach(System.out::println);
		
//		student s = new student();
//		s.setGender("male");
//		s.setRank(1l);
//		
//		Example<student> exp =Example.of(s);
//		List<student> lis = studrepo.findAll(exp);
//		lis.forEach(System.out::println);
//		
//		studrepo.deletestudent(104);
		
//		studrepo.updatestudent(101, "male");
		
		studrepo.insertstud(104, "orlen", "male");
	}

}
