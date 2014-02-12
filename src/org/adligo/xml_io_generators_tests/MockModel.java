package org.adligo.xml_io_generators_tests;

import java.io.Serializable;

public class MockModel implements Serializable {
	private static final long serialVersionUID = 2L;
	private int id;
	@SuppressWarnings("unused")
	private float fid;
	private double did;
	private transient short sid;
	private long lid;
	private String name;
	private boolean b;
	private boolean b2;
	private boolean b3;
	private boolean b4;
	private boolean b5;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFid(float fid) {
		this.fid = fid;
	}
	public double getDid() {
		return did;
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
	public boolean hasB2() {
		return b2;
	}
	public void setB2(boolean b) {
		this.b2 = b;
	}
	public void setB3(boolean b3) {
		this.b3 = b3;
	}
	public boolean isB4() {
		return b4;
	}
	public boolean getB5() {
		return b5;
	}
	public void setB5(boolean b5) {
		this.b5 = b5;
	}
}
