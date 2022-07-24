package grandcircus.co.weatherAPI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import grandcircus.co.weatherAPI.Service.WeatherApiService;

@Controller
public class HomeController {
	
	@Autowired
	private WeatherApiService weatherService;
	
	@RequestMapping("/")
	public String displayHome(Model model) {
		
		model.addAttribute("location", weatherService.getAreaDescription());
		model.addAttribute("time", weatherService.getTimeStartPeriodName());
		model.addAttribute("obsName", weatherService.getCurrentObName());
		model.addAttribute("obsTemp", weatherService.getCurrentObTemp());
		model.addAttribute("obsDewp", weatherService.getCurrentObDewp());
		
		//to see if data is being passed to controller
		System.out.println(weatherService.getAreaDescription());
		System.out.println(weatherService.getTimeStartPeriodName());
		System.out.println(weatherService.getCurrentObName());
		System.out.println(weatherService.getCurrentObTemp());
		System.out.println(weatherService.getCurrentObDewp());
		return "index";
	}
	
//	@RequestMapping("/search")
//	public String displaySearch(Model model, @RequestParam double latitude, @RequestParam double longitude) {
		
		
//		model.addAttribute("location", weatherService.getAreaDescriptionSearch(latitude, longitude));
//		model.addAttribute("time", weatherService.getTimeStartPeriodName());
//		model.addAttribute("obsName", weatherService.getCurrentObName());
//		model.addAttribute("obsTemp", weatherService.getCurrentObTemp());
//		model.addAttribute("obsDewp", weatherService.getCurrentObDewp());
//		
//		//to see if data is being passed to controller
//		System.out.println(weatherService.getAreaDescriptionSearch(latitude, longitude));
//		System.out.println(weatherService.getTimeStartPeriodName());
//		System.out.println(weatherService.getCurrentObName());
//		System.out.println(weatherService.getCurrentObTemp());
//		System.out.println(weatherService.getCurrentObDewp());
		
//		return "search";
//	}

}
