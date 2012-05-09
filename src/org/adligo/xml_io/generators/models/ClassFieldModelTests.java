package org.adligo.xml_io.generators.models;

import org.adligo.models.core.client.Address;
import org.adligo.models.core.client.AddressMutant;
import org.adligo.tests.ATest;
import org.adligo.xml_io.generator.models.ClassFieldMethods;

public class ClassFieldModelTests extends ATest {

	public void testClassFieldMethodsMockModel() {
		ClassFieldMethods cfm = new ClassFieldMethods(MockModel.class);
		assertFalse(cfm.isMutant());
		assertFalse(cfm.isValid());
		assertEquals("2.0053884", cfm.calculateFieldVersion().toPlainString());
	}
	
	public void testClassFieldMethodsMockMutant() {
		ClassFieldMethods cfm = new ClassFieldMethods(MockMutant.class);
		assertTrue(cfm.isMutant());
		assertEquals("1.0050861", cfm.calculateFieldVersion().toPlainString());
	}	
	
	public void testClassFieldMethodsMockImmutableModel() {
		ClassFieldMethods cfm = new ClassFieldMethods(MockImmutableModel.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValid());
		assertEquals("5.0055726", cfm.calculateFieldVersion().toPlainString());
	}
	
	public void testClassFieldMethodsMockInterfaceMutant() {
		ClassFieldMethods cfm = new ClassFieldMethods(MockInterfaceMutant.class);
		assertTrue(cfm.isMutant());
		assertEquals("3.0056936", cfm.calculateFieldVersion().toPlainString());
	}
	
	public void testClassFieldMethodsMockInterfaceModel() {
		ClassFieldMethods cfm = new ClassFieldMethods(MockInterfaceModel.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValid());
		assertEquals("4.0059761", cfm.calculateFieldVersion().toPlainString());
	}
	
	public void testClassFieldMethodsAddress() {
		ClassFieldMethods cfm = new ClassFieldMethods(Address.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValid());
		assertEquals("1.0040988", cfm.calculateFieldVersion().toPlainString());
	}
	
	public void testClassFieldMethodsAddressMutant() {
		ClassFieldMethods cfm = new ClassFieldMethods(AddressMutant.class);
		assertTrue(cfm.isMutant());
		assertEquals("1.006099", cfm.calculateFieldVersion().toPlainString());
	}
}
