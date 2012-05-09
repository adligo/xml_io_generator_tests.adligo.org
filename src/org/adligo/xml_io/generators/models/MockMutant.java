package org.adligo.xml_io.generators.models;

import java.io.Serializable;

public class MockMutant implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private transient float fid;
	private double did;
	private transient short sid;
	private long lid;
	private String name;
	private boolean b;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getFid() {
		return fid;
	}
	public void setFid(float fid) {
		this.fid = fid;
	}
	public double getDid() {
		return did;
	}
	public void setDid(double did) {
		this.did = did;
	}
	public short getSid() {
		return sid;
	}
	public void setSid(short sid) {
		this.sid = sid;
	}
	public long getLid() {
		return lid;
	}
	public void setLid(long lid) {
		this.lid = lid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isB() {
		return b;
	}
	public void setB(boolean b) {
		this.b = b;
	}
}
