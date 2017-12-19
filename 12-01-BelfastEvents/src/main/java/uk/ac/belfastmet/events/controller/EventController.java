package uk.ac.belfastmet.events.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.events.domain.AllEvents;
import uk.ac.belfastmet.events.domain.Event;

@Controller
@RequestMapping("")
public class EventController {
	
	public EventController() {
		super();
	}
	
	@GetMapping("/")
	public String home(Model model) {
		
		model.addAttribute("pageTitle", "Events");
		model.addAttribute("pageHeader", "All Events");
		
		String allEventsUrl="http://neueda-flask-bndouglas.c9users.io/belfast-events/api/";
		
		RestTemplate restTemplate = new RestTemplate();
		
		AllEvents allEvents = restTemplate.getForObject(allEventsUrl, AllEvents.class);
		
		model.addAttribute("events", allEvents.getAllEvents());
		return "homePage";
	}
	
	@GetMapping("/event/{identifier}")
	public String event(Model model) {
		
		model.addAttribute("pageTitle", "Events");
		String allEventsUrl="http://neueda-flask-bndouglas.c9users.io/belfast-events/api/";
		RestTemplate restTemplate = new RestTemplate();
		Event event = restTemplate.getForObject(allEventsUrl, Event.class);
		model.addAttribute("event", event.getIdentifier());
		return "eventPage";
	}
	

}
