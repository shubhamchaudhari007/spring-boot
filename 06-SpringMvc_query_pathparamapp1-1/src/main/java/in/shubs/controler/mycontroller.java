package in.shubs.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mycontroller {
	
	@GetMapping("/welcome")
	public ModelAndView getben() {
		
		ModelAndView mav = new ModelAndView();
		String Str = "shubham";
		mav.addObject("msg", Str+" welcome to new world");
		mav.setViewName("index");
		return mav;
	}
	
	//Localhost:8080/msg?str=shubham
	@GetMapping("/msg")
	public ModelAndView get(@RequestParam String str) {
		
		ModelAndView mav = new ModelAndView();
		String str1 = str + "  good morning";
		
		mav.addObject("msg", str1);
		
		mav.setViewName("index");
		return mav;
	}
	
	//Localhost:8080/msg?str=shubham
		@GetMapping("/msgtxt")
		public ModelAndView get(@RequestParam String str,Integer in,Long inser) {
			
			ModelAndView mav = new ModelAndView();
			String str1 = str + "  good morning";
			//int age = in + 10;
			mav.addObject("msg", str1 + " the age "+ in + " the salary " + inser);
			
			mav.setViewName("index");
			return mav;
		}

}
