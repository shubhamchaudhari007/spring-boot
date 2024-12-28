package in.shubs;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shubs.entity.Cources;
import in.shubs.entity.Students;
import in.shubs.repository.courcerepo;
import in.shubs.repository.studentrepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		studentrepo stud = context.getBean(studentrepo.class);
		
		courcerepo cour = context.getBean(courcerepo.class);
		
		Students studen = new Students();
		studen.setStudentName("shubham");
		studen.setStudentAge(21);
		studen.setStudentGender("male");
		
		Students studen1 = new Students();
		studen1.setStudentName("sandesh");
		studen1.setStudentAge(21);
		studen1.setStudentGender("male");
		
		Cources cours = new Cources();
		cours.setCourceName("SpringBoot");
		cours.setFees(10000);
		cours.setAbreviation("SB");
		
		Cources cours1 = new Cources();
		cours1.setCourceName("java");
		cours1.setFees(80000);
		cours1.setAbreviation("java");
		
		Cources cours2 = new Cources();
		cours2.setCourceName("javascript");
		cours2.setFees(12000);
		cours2.setAbreviation("js");
		
		List<Cources>arr = Arrays.asList(cours,cours1);
		studen.setCources(arr);
		List<Students>arr1 = Arrays.asList(studen,studen1);
		cours.setStud(arr1);
		
		stud.save(studen);
	}

}
