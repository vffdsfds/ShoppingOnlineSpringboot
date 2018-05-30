package edu.mum.onlineshoping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.onlineshoping.model.MyTax;
import edu.mum.onlineshoping.repository.MyTaxRepository;
import edu.mum.onlineshoping.service.MyTaxService;

@Service
@Transactional
public class MyTaxServiceImp implements MyTaxService{

	@Autowired
	MyTaxRepository myTaxRepository;
	
	@Override
	public void addMyTax(MyTax myTax) {
		// TODO Auto-generated method stub
		myTaxRepository.save(myTax);
	}

}
