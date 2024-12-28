package in.shubs.Repository;

import org.springframework.stereotype.Repository;

import in.shubs.io.ireport;

@Repository
public class repositoryDao implements ireport {
	
	public String getName(Integer Userid) {
		if(Userid == 100) {
			return "john";
		}else if(Userid == 101) {
			return "shon";
		}else {
		return "Name not found";
		}
	}

}
