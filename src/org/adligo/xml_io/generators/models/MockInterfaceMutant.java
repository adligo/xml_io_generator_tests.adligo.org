package org.adligo.xml_io.generators.models;

public class MockInterfaceMutant implements I_N {
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
