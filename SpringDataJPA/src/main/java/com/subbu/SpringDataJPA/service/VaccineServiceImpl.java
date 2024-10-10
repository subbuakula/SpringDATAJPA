package com.subbu.SpringDataJPA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subbu.SpringDataJPA.dao.VaccineDao;
import com.subbu.SpringDataJPA.model.Vaccine;

@Service
public class VaccineServiceImpl implements VaccineService {
	
	@Autowired
	private VaccineDao vaccineDao;

	@Override
	public Iterable<Vaccine> getAllVaccines() {
		return vaccineDao.findAll();
	}

}
