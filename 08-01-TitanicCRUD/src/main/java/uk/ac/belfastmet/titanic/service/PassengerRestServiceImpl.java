package uk.ac.belfastmet.titanic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.titanic.domain.Passenger;
import uk.ac.belfastmet.titanic.repository.PassengerRepository;

@Service
public class PassengerRestServiceImpl implements PassengerRestService {
	
	@Autowired
	private PassengerRepository passengerRepository;

	public PassengerRestServiceImpl(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}

	@Override
	public Iterable<Passenger> list() {
		
		return this.passengerRepository.findAll();
	}

	@Override
	public Passenger create(Passenger passenger) {
		
		return this.passengerRepository.save(passenger);
	}

	@Override
	public Passenger read(Integer passengerid) {
		
		return this.passengerRepository.findOne(passengerid);
	}

	@Override
	public Passenger update(Integer passengerid, Passenger passengerToUpdate) {

		Passenger passenger = this.passengerRepository.findOne(passengerid);
		passenger.setSurvived(passengerToUpdate.getSurvived());
		passenger.setPclass(passengerToUpdate.getPclass());
		passenger.setName(passengerToUpdate.getName());
		passenger.setSex(passengerToUpdate.getSex());
		passenger.setAge(passengerToUpdate.getAge());
		passenger.setSibSp(passengerToUpdate.getSibSp());
		passenger.setParch(passengerToUpdate.getParch());
		passenger.setTicket(passengerToUpdate.getTicket());
		passenger.setFare(passengerToUpdate.getFare());
		passenger.setCabin(passengerToUpdate.getCabin());
		passenger.setEmbarked(passengerToUpdate.getEmbarked());
		return passengerRepository.save(passenger);
	}

	@Override
	public void delete(Integer passengerid) {
		
		this.passengerRepository.delete(passengerid);
	}

}
