package org.adligo.xml_io.generators.models;

import java.io.Serializable;

import org.adligo.i.util.client.I_Immutable;

public class MockImmutableModel implements I_Immutable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;
	private String name;
	
	public MockImmutableModel() {}
	
	public MockImmutableModel(String p) {
		name = p;
	}

	public String getName() {
		return name;
	}

	@Override
	public String getImmutableFieldName() {
		return "name";
	}
}
