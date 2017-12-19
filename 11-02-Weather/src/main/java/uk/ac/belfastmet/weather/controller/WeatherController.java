
package uk.ac.belfastmet.weather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.weather.domain.TodaysWeather;
import uk.ac.belfastmet.weather.domain.Weather;

@Controller
@RequestMapping("")
public class WeatherController {

	public WeatherController() {
		super();
	}
	
	@GetMapping("/")
	public String home(Model model) {
		
		model.addAttribute("pageTitle", "Weather");
		model.addAttribute("pageHeader", "Belfast");
		String belfastWeatherUrl= "http://www.codingfury.net/training/weathersample/weather.php?location=belfast";
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(belfastWeatherUrl, TodaysWeather.class);
		Weather weather = todaysWeather.getWeather();
		
		model.addAttribute("weather", weather);
		
		return "homePage";
	}
	
	@GetMapping("/london")
	public String london(Model model) {
		
		model.addAttribute("pageTitle", "Weather");
		model.addAttribute("pageHeader", "London");
		String londonWeatherUrl= "http://www.codingfury.net/training/weathersample/weather.php?location=london";
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(londonWeatherUrl, TodaysWeather.class);
		Weather weather = todaysWeather.getWeather();
		
		model.addAttribute("weather", weather);
		
		return "homePage";
	}
	
	@GetMapping("/dublin")
	public String dublin(Model model) {
		
		model.addAttribute("pageTitle", "Weather");
		model.addAttribute("pageHeader", "Dublin");
		String dublinWeatherUrl= "http://www.codingfury.net/training/weathersample/weather.php?location=dublin";
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(dublinWeatherUrl, TodaysWeather.class);
		Weather weather = todaysWeather.getWeather();
		
		model.addAttribute("weather", weather);
		
		return "homePage";
	}
	
	
	

}
