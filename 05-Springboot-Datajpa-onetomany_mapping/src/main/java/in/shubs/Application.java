package in.shubs;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shubs.entity.Address;
import in.shubs.entity.Employee;
import in.shubs.repository.addressrepo;
import in.shubs.repository.emprepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		emprepo emp = context.getBean(emprepo.class);
		addressrepo add = context.getBean(addressrepo.class);
		
//		Employee e = new Employee();
//		e.setEmpName("shubham");
//		e.setEmpSalary(40000.00);
//		
//		Address A1 = new Address();
//		A1.setCity("pune");
//		A1.setState("maha");
//		A1.setCountry("india");
//		A1.setEmp(e);
//		
//		Address A2 = new Address();
//		A2.setCity("jamkhed");
//		A2.setState("maha");
//		A2.setCountry("india");
//		A2.setEmp(e);
//		
//		
//		List<Address> arrlist = Arrays.asList(A1,A2);
//		e.setAddr(arrlist);
		
//		emp.save(e);
		
		emp.findById(1);
	}

}
