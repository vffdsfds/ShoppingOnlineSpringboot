package edu.mum.onlineshoping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.onlineshoping.model.MyCompany;
import edu.mum.onlineshoping.repository.MyCompanyRepository;
import edu.mum.onlineshoping.service.MyCompanyService;

@Service
@Transactional
public class MyCompanyServiceImp implements MyCompanyService{

	@Autowired
	MyCompanyRepository myCompanyRepository;
	
	@Override
	public void addMyCompany(MyCompany myCompany) {
		// TODO Auto-generated method stub
       myCompanyRepository.save(myCompany);
	}

}
