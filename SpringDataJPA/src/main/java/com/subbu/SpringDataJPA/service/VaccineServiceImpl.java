package com.subbu.SpringDataJPA.service;

import java.util.ArrayList;
import java.util.List;

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

	@Override
	public Vaccine getVaccineById(int id) {
		return vaccineDao.findById(id).get();
	}

	@Override
	public Vaccine addVaccine(Vaccine v) {
		return vaccineDao.save(v);
	}

	@Override
	public Iterable<Vaccine> addAllVaccines(Iterable<Vaccine> vaccines) {
		return vaccineDao.saveAll(vaccines);
	}

	@Override
	public Iterable<Vaccine> getAllVaccinesById(Iterable<Integer> ids) {
		 List<Vaccine> vaccines = (List<Vaccine>) vaccineDao.findAllById(ids);
//		 int size1 = ((List<Integer>) ids).size();
		 if(vaccines.size() == ((List<Integer>)ids).size())
		 {
			 return vaccines;
		 }
		 return new ArrayList<Vaccine>();
	}

	@Override
	public String deleteVaccineById(int id) 
	{
		Vaccine v = vaccineDao.findById(id).get();
		if(v!=null)
		{
			vaccineDao.deleteById(id);
			return "Vaccine with given Id is deleted.";
		}
				
		 return "Vaccine with given Id is not available";
		 
	}

	@Override
	public String deleteVaccinesByIds(Iterable<Integer> ids) {
		if(((List<Vaccine>)vaccineDao.findAllById(ids)).size() == ((List<Integer>)ids).size())
		{
			vaccineDao.deleteAllById(ids);
			return "vaccines with all given ids are deleted.";
		}
		return "Vaccines with all given Ids are not available";
	}

}
