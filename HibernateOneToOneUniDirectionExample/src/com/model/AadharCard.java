package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AadharCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	
	private long aNo;

	private String nameOfOfficer;
	
	
	public String getNameOfOfficer() {
		return nameOfOfficer;
	}

	public void setNameOfOfficer(String nameOfOfficer) {
		this.nameOfOfficer = nameOfOfficer;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public long getaNo() {
		return aNo;
	}

	public void setaNo(long aNo) {
		this.aNo = aNo;
	}

	@Override
	public String toString() {
		return "AadharCard [aid=" + aid + ", aNo=" + aNo + ", nameOfOfficer=" + nameOfOfficer + "]";
	}
	
	
}
