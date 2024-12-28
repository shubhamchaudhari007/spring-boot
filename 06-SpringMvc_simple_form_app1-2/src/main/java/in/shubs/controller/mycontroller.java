package in.shubs.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.shubs.binding.User;
import in.shubs.binding.product;
import in.shubs.entity.user;
import in.shubs.repository.userrepo;

@Controller
public class mycontroller {
	
	@Autowired
	private userrepo repo;
	
	@GetMapping("/")
	public String loadform(Model model) {
		
	
		return "index";
		}
	
	@PostMapping("/user")
	public String saveform(User user,Model model) {
		System.out.println(user);
		
		user use = new user();
		BeanUtils.copyProperties(user, use);
		repo.save(use);
		
		model.addAttribute("msg", "form submitted successfully !!");
		return "index";
	}

}
