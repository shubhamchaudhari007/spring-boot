package in.shubs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mycontroller {
	
	@GetMapping("/welcome")
	public String welcomecnc(Model model) {
		model.addAttribute("msg", "welcome to thymeleaf");
		return "index";
	}

}
