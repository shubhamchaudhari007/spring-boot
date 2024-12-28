package in.shubs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.shubs.binding.product;
import jakarta.validation.Valid;

@Controller
public class productcontroller {
	
	@GetMapping("/")
	public String productdtl(Model model) {
		model.addAttribute("product", new product());
		return "index";
	}
	
	@PostMapping("/Product")
	public String setcon(@Valid product p, BindingResult result, Model model) {
		
		System.out.println(p);
		
		if(result.hasErrors()) {
			return "index";
		}else {
			model.addAttribute("msg", "form data saved successfully");
		}
		
		
		return "index";
	}

}
