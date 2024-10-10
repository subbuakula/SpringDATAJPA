package com.subbu.SpringDataJPA.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.subbu.SpringDataJPA.model.Vaccine;

@Repository
public interface VaccineDao extends CrudRepository<Vaccine, Integer> 
{
	

}
