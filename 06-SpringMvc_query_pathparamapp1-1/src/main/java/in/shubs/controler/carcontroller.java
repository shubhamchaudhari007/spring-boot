package in.shubs.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import jakarta.websocket.server.PathParam;

@Controller
public class carcontroller {
	
	@GetMapping("/car/{carid}/hyd")
	public ModelAndView carcolour(@PathVariable Integer carid) {
		
		String colour = null;
		ModelAndView mav = new ModelAndView();
		if(carid >= 100) {
			colour = "red";
		}else {
			colour= "green";
		}
		mav.addObject("msg", "car colour is: " + colour);
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("/carsinfo/{name}/location/{city}")
	public ModelAndView carinfo(@PathVariable String name, @PathVariable String city) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", name + "  is not available in city " + city);
		mav.setViewName("index");
		return mav;
	}

}
