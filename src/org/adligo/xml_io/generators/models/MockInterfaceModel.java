package org.adligo.xml_io.generators.models;

public class MockInterfaceModel implements I_N {
	private MockInterfaceMutant mutant;
	
	public MockInterfaceModel() {}
	
	public MockInterfaceModel(I_N p) {
		mutant = new MockInterfaceMutant(p);
	}

	public String getName() {
		return mutant.getName();
	}
}
