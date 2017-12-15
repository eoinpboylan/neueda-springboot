package uk.ac.belfastmet.titanic.service;

import uk.ac.belfastmet.titanic.domain.Passenger;


public interface PassengerRestService {
	Iterable<Passenger> list();
	
	Passenger create(Passenger passenger);
	
	Passenger read(Integer passengerid);
	
	Passenger update(Integer passengerid, Passenger passenger);
	
	void delete(Integer passengerid);
}
