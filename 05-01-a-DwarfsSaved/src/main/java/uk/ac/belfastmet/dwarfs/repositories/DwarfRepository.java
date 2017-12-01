package uk.ac.belfastmet.dwarfs.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

public interface DwarfRepository extends CrudRepository<Dwarf, Integer> {

	Object findByAuthor(String string);

}
