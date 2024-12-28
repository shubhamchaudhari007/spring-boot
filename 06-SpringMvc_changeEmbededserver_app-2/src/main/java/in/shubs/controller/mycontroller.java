package in.shubs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mycontroller {
	
	@GetMapping("/greet")
	public String greeting(Model model) {
		model.addAttribute("msg", "shubham");
		return "index";
	}

}
