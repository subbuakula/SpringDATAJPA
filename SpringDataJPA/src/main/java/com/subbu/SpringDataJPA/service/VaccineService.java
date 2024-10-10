package com.subbu.SpringDataJPA.service;

import java.util.List;

import com.subbu.SpringDataJPA.model.Vaccine;

public interface VaccineService 
{
	Iterable<Vaccine> getAllVaccines();
	Vaccine getVaccineById(int id);
	Vaccine addVaccine(Vaccine v);
	Iterable<Vaccine> addAllVaccines(Iterable<Vaccine> vaccines);
    Iterable<Vaccine> getAllVaccinesById(Iterable<Integer> ids);
    String deleteVaccineById(int id);
    String deleteVaccinesByIds(Iterable<Integer> ids);
    

}
