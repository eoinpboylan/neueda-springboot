package uk.ac.belfastmet.events.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		model.addAttribute("events", allEventsArray());
		return "homePage";
	}
	
	@GetMapping("/event/{identifier}")
	public String event(@PathVariable String identifier, Model model) {
		
		model.addAttribute("pageTitle", "Events");
		model.addAttribute("events", showEventById(identifier));
		return "eventPage";
	}
	
	public ArrayList<Event> allEventsArray(){
		
		String allEventsUrl="http://neueda-flask-bndouglas.c9users.io/belfast-events/api/";
		RestTemplate restTemplate = new RestTemplate();
		AllEvents allEvents = restTemplate.getForObject(allEventsUrl, AllEvents.class);
		return allEvents.getAllEvents();
	}
	
	
	public Event showEventById(String identifier) {
		 ArrayList<Event> allEventsArray = this.allEventsArray();
		for(int i = 0; i < allEventsArray.size(); i++) {
				Event currentEvent = allEventsArray().get(i);
					
				if(currentEvent.getIdentifier().equals(identifier)) {
					return currentEvent;	
					}
		 }return null;
	}
	

}
