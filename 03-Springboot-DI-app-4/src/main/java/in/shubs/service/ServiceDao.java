package in.shubs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import in.shubs.Repository.repositoryDao;
import in.shubs.io.ireport;

@Service
public class ServiceDao {
	
	@Value("${report.type}")
	private String str;
	private ireport Reposit;
	
	public void setDI(repositoryDao Reposit) {
		System.out.println("set method");
		this.Reposit=Reposit;
	}

	public ServiceDao(repositoryDao Reposi) {
		System.out.println("construcot");
		this.Reposit = Reposi;
	}
	
	public void printName(Integer Userid) {
		System.out.println("string " + str);
		String str = Reposit.getName(Userid);
		System.out.println(str);
	}

}
