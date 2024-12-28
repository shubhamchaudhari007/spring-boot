package in.shubs.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class democontroller {
	
	@GetMapping("/setname/{strrr}")
	public String getas(@PathVariable String strrr, Model model) {
		
		model.addAttribute("msg","the democontroller print its name " + strrr);
		
		return "index";
	}

}
