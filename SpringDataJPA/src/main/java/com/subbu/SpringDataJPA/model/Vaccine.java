package com.subbu.SpringDataJPA.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vaccineinfo")
public class Vaccine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="vId")
	private int vId;
	@Column(name="vName")
	private String vName;
	@Column(name="companyName")
	private String companyName;
	@Column(name="cost")
	private String cost;
	
	public Vaccine() {
		super();
	}
	public Vaccine( String vName, String companyName, String cost) {
		
		this.vName = vName;
		this.companyName = companyName;
		this.cost = cost;
	}
	

	public int getvId() {
		return vId;
	}

	public void setvId(int vId) {
		this.vId = vId;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vaccine [vId=" + vId + ", vName=" + vName + ", companyName=" + companyName + ", cost=" + cost + "]";
	}


	
	
}
