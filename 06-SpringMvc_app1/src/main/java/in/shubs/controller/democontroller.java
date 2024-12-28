package in.shubs.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class democontroller {
	
	@GetMapping("/welcome")
	public ModelAndView gethash() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Welcome to my workspace");
		
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("/restart")
	public ModelAndView ethash() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "start learning");
		
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("/date")
	public ModelAndView thash() {
		ModelAndView mav = new ModelAndView();
		
		LocalDate date = LocalDate.now();
		String message = "todaydate"+date;
		mav.addObject("msg", message);
		
		mav.setViewName("index");
		return mav;
	}

}
