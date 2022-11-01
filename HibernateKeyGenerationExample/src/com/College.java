package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	
	private String cname;
	
	private String ccode;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCcode() {
		return ccode;
	}

	public void setCcode(String ccode) {
		this.ccode = ccode;
	}

	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + ", ccode=" + ccode + "]";
	}
	
	
}
