package uk.ac.belfastmet.rhi.service;

import uk.ac.belfastmet.rhi.domain.Payment;
import uk.ac.belfastmet.rhi.repositories.PaymentRepository;

public class PaymentRestServiceImpl implements PaymentRestService {

	public PaymentRestServiceImpl(PaymentRepository paymentRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}
	
	@Override
	public Iterable<Payment> list() {
		
		return this.paymentRepository.findAll();
	}

	@Override
	public Payment create(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment read(Integer paymentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment update(Integer paymentId, Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer paymentId) {
		// TODO Auto-generated method stub

	}

}
