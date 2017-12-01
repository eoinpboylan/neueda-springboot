package uk.ac.belfastmet.titanic.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.titanic.domain.Passenger;
import uk.ac.belfastmet.titanic.repository.PassengerRepository;



@Service
public class DataLoader {
	
	
	@Autowired
	private PassengerRepository passengerRepository;
	
	public DataLoader(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}
	
	//add @PostConstruct to add to the database
	//@PostConstruct
	public void loadData() {
		//function will add Passengers to the database using a constructor
		
			
			
			
	}
	
}
