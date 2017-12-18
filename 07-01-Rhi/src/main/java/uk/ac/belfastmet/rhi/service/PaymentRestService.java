package uk.ac.belfastmet.rhi.service;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.rhi.domain.Payment;

public interface PaymentRestService {
	Iterable<Payment> list();
	
	Payment create(Payment payment);

	Payment read(Integer paymentId);
	
	Payment update(Integer paymentId, Payment payment);
	
	void delete(Integer paymentId);
}
