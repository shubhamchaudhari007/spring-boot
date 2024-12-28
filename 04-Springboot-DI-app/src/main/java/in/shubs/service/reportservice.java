package in.shubs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.shubs.dao.reportdao;

@Service
public class reportservice {
	
	private reportdao Reportdao;
	
	
	public reportservice(reportdao Reportdao) {
		this.Reportdao = Reportdao;
	}
	
	
	public void Setmethod(reportdao Reportdao) {
		this.Reportdao = Reportdao;
	}
	
	public void printname(int userid) {
		String name = Reportdao.getName(userid);
		System.out.println(name);
	}
	
	
		

	

}
