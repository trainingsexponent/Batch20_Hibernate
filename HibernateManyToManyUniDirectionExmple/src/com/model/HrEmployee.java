package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HrEmployee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hid;
	
	private String hname;
	
	private String hdesignation;

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getHdesignation() {
		return hdesignation;
	}

	public void setHdesignation(String hdesignation) {
		this.hdesignation = hdesignation;
	}

	@Override
	public String toString() {
		return "HrEmployee [hid=" + hid + ", hname=" + hname + ", hdesignation=" + hdesignation + "]";
	}
	
	
}
