package org.adligo.xml_io_generators_tests;

import java.io.Serializable;

public class MockInterfaceMutant implements I_N, Serializable {
	private static final long serialVersionUID = 3L;
	private String name;
	
	public MockInterfaceMutant() {}

	public MockInterfaceMutant(I_N p) {
		name = p.getName();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
