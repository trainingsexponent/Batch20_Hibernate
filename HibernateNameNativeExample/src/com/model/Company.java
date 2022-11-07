package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

@Entity
@NamedNativeQueries({
	@NamedNativeQuery(name = "insert",query = "insert into company(cid,cname,caddress) values(?,?,?)"),
	@NamedNativeQuery(name = "AllData",query = "select *  from company",resultClass = Company.class),
	@NamedNativeQuery(name = "updateData",query = "update company set cname=?,caddress=? where cid=?"),
	@NamedNativeQuery(name = "AllDataDesc",query = "select * from company order by caddress desc,cname desc",resultClass = Company.class)
})
public class Company {
	
	@Id
	private int cid;
	
	private String cname;
	
	private String caddress;

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

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", caddress=" + caddress + "]";
	}
	
	

}
