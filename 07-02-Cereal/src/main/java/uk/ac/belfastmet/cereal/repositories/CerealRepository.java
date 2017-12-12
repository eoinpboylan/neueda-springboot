package uk.ac.belfastmet.cereal.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.cereal.domain.Cereal;

public interface CerealRepository  extends CrudRepository<Cereal, Integer> {

	Iterable<Cereal> findByOrderByCerealId();

	Iterable<Cereal> findByOrderByName();


	
	
}
