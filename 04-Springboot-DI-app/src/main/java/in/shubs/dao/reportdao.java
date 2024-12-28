package in.shubs.dao;

import org.springframework.stereotype.Repository;

@Repository
public class reportdao {
	
	public String getName(int userid) {
		if(userid == 100)
		return "john";
		else if(userid == 101)
			return "many";
		else
			return "name not found";
	}

}
