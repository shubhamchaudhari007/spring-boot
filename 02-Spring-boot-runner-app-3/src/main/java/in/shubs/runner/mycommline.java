package in.shubs.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class mycommline implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Commandline runner executed");
	
	}

}
