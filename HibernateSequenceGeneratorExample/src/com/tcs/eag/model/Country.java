package com.tcs.eag.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "myseq")
	@SequenceGenerator(name = "myseq",initialValue = 100,allocationSize = 1)
	private int cid;
	
	private String cname;
	
	private int code;

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

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Country [cid=" + cid + ", cname=" + cname + ", code=" + code + "]";
	}
	
	
}
