package org.adligo.xml_io_generators_tests;

import java.io.Serializable;

import org.adligo.i.util.shared.I_Immutable;

public class MockInterfaceModel implements I_N, I_Immutable, Serializable {
	private static final long serialVersionUID = 4L;
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
