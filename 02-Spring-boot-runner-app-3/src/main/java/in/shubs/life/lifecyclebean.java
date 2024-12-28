package in.shubs.life;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class lifecyclebean {
	
	@PostConstruct
	public void init() {
		System.out.println("Started init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method called");
	}

}
