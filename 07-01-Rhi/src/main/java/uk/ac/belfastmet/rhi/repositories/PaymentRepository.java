package uk.ac.belfastmet.rhi.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.rhi.domain.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer>{

}
