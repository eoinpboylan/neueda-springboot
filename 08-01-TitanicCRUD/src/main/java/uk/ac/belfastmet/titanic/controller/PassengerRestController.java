package uk.ac.belfastmet.titanic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.titanic.domain.Passenger;
import uk.ac.belfastmet.titanic.service.PassengerRestService;

@RestController
@RequestMapping("/api")
public class PassengerRestController {
	
	@Autowired
	PassengerRestService passengerRestService;
	
	public PassengerRestController(PassengerRestService passengerRestService) {
		super();
		this.passengerRestService = passengerRestService;
	}

	@GetMapping("/")
	public Iterable<Passenger>list(){
		
		return passengerRestService.list();
	}
	
	@PostMapping("/")
	public Passenger create(@RequestBody Passenger passenger ){
		return passengerRestService.create(passenger);
	}
	
	@GetMapping("/{passengerid}")
	public Passenger read(@PathVariable("passengerid") Integer passengerid){
		
		return passengerRestService.read(passengerid);
	}
	
	@PutMapping("/{passengerid}")
	public Passenger update(@PathVariable("passengerid") Integer passengerid, @RequestBody Passenger passenger ){
		return passengerRestService.update(passengerid, passenger);
	}
	
	@DeleteMapping("/{passengerid}")
	public void delete(@PathVariable("passengerid") Integer passengerid){
		passengerRestService.delete(passengerid);
	}
}
