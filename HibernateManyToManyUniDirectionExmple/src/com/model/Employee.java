package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	
	private String ename;
	
	private String designation;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<HrEmployee> hrEmployee;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<HrEmployee> getHrEmployee() {
		return hrEmployee;
	}

	public void setHrEmployee(List<HrEmployee> hrEmployee) {
		this.hrEmployee = hrEmployee;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", designation=" + designation + ", hrEmployee="
				+ hrEmployee + "]";
	}

	
}
