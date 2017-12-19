package uk.ac.belfastmet.events.domain;

import java.util.ArrayList;

public class AllEvents {
	private ArrayList<Event> allEvents = new ArrayList<Event>();

	public AllEvents() {
		super();
	}

	public AllEvents(ArrayList<Event> allEvents) {
		super();
		this.allEvents = allEvents;
	}

	public ArrayList<Event> getAllEvents() {
		return allEvents;
	}

	public void setAllEvents(ArrayList<Event> allEvents) {
		this.allEvents = allEvents;
	}
	
	

}
