package org.adligo.xml_io.generators.models;

import org.adligo.models.core.client.Address;
import org.adligo.tests.ATest;
import org.adligo.xml_io.generator.models.ClassFieldMethods;

public class ClassFieldModelTests extends ATest {

	public void testClassFieldMethodsMockModel() {
		ClassFieldMethods cfm = new ClassFieldMethods(MockModel.class);
		assertFalse(cfm.isMutant());
		assertFalse(cfm.isValid());
	}
	
	public void testClassFieldMethodsMockMutant() {
		ClassFieldMethods cfm = new ClassFieldMethods(MockMutant.class);
		assertTrue(cfm.isMutant());
	}	
	
	public void testClassFieldMethodsMockImmutableModel() {
		ClassFieldMethods cfm = new ClassFieldMethods(MockImmutableModel.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValid());
	}
	
	public void testClassFieldMethodsMockInterfaceMutant() {
		ClassFieldMethods cfm = new ClassFieldMethods(MockInterfaceMutant.class);
		assertTrue(cfm.isMutant());
	}
	
	public void testClassFieldMethodsMockInterfaceModel() {
		ClassFieldMethods cfm = new ClassFieldMethods(MockInterfaceModel.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValid());
		
	}
	
	public void testClassFieldMethodsAddress() {
		ClassFieldMethods cfm = new ClassFieldMethods(Address.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValid());
	}
}
