package com.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class FileData {

	@Id
	private int fid;
	
	private String fname;
	
	private String fpath;
	
	@Lob
	private byte[] fData;
	
	private long fsize;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFpath() {
		return fpath;
	}

	public void setFpath(String fpath) {
		this.fpath = fpath;
	}

	public byte[] getfData() {
		return fData;
	}

	public void setfData(byte[] fData) {
		this.fData = fData;
	}

	public long getFsize() {
		return fsize;
	}

	public void setFsize(long fsize) {
		this.fsize = fsize;
	}

	@Override
	public String toString() {
		return "FileData [fid=" + fid + ", fname=" + fname + ", fpath=" + fpath + ", fData=" + Arrays.toString(fData)
				+ ", fsize=" + fsize + "]";
	}
	
	
	
}
