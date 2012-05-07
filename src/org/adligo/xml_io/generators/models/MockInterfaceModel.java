package org.adligo.xml_io.generators.models;

import org.adligo.i.util.client.I_Immutable;

public class MockInterfaceModel implements I_N, I_Immutable {
	private MockInterfaceMutant mutant;
	
	public MockInterfaceModel() {}
	
	public MockInterfaceModel(I_N p) {
		mutant = new MockInterfaceMutant(p);
	}

	public String getName() {
		return mutant.getName();
	}

	@Override
	public String getImmutableFieldName() {
		return "mutant";
	}
}
