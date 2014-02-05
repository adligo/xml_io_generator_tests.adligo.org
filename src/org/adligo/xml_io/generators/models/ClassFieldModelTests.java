package org.adligo.xml_io.generators.models;

import java.lang.reflect.Method;
import java.util.List;

import org.adligo.models.core.client.Address;
import org.adligo.models.core.client.AddressMutant;
import org.adligo.models.core.client.DomainName;
import org.adligo.models.core.client.ModifyEMailListMutant;
import org.adligo.models.core.client.PersonMutant;
import org.adligo.models.core.client.ids.LongIdentifier;
import org.adligo.models.core.client.ids.StringIdentifier;
import org.adligo.models.core.relations.client.EMail;
import org.adligo.models.core.relations.client.EMailMutant;
import org.adligo.models.core.relations.client.UserGroup;
import org.adligo.models.core.relations.client.UserGroupMutant;
import org.adligo.tests.ATest;
import org.adligo.xml_io.generator.models.ClassFieldMethods;
import org.adligo.xml_io.generator.models.FieldMethods;

public class ClassFieldModelTests extends ATest {

	public void testClassFieldMethodsMockModel() {
		ClassFieldMethods cfm = new ClassFieldMethods(MockModel.class);
		assertFalse(cfm.isMutant());
		assertFalse(cfm.isValid());
		assertEquals("2.0053884", cfm.calculateFieldVersion().toPlainString());
		assertFalse(cfm.isAttribute());
	}
	
	public void testClassFieldMethodsMockMutant() {
		ClassFieldMethods cfm = new ClassFieldMethods(MockMutant.class);
		assertTrue(cfm.isMutant());
		assertEquals("1.0050861", cfm.calculateFieldVersion().toPlainString());
		assertFalse(cfm.isAttribute());
	}	
	
	public void testClassFieldMethodsMockImmutableModel() {
		ClassFieldMethods cfm = new ClassFieldMethods(MockImmutableModel.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValid());
		assertEquals("5.0055726", cfm.calculateFieldVersion().toPlainString());
		assertTrue(cfm.isAttribute());
		assertEquals(String.class, cfm.getAttributeClass());
	}
	
	public void testClassFieldMethodsMockInterfaceMutant() {
		ClassFieldMethods cfm = new ClassFieldMethods(MockInterfaceMutant.class);
		assertTrue(cfm.isMutant());
		assertEquals("3.0056936", cfm.calculateFieldVersion().toPlainString());
		assertTrue(cfm.isAttribute());
		assertEquals(String.class, cfm.getAttributeClass());
	}
	
	public void testClassFieldMethodsMockInterfaceModel() {
		ClassFieldMethods cfm = new ClassFieldMethods(MockInterfaceModel.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValid());
		assertEquals("4.0059761", cfm.calculateFieldVersion().toPlainString());
		assertTrue(cfm.isAttribute());
		assertEquals(String.class, cfm.getAttributeClass());
	}
	
	public void testClassFieldMethodsAddress() {
		ClassFieldMethods cfm = new ClassFieldMethods(Address.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValid());
		assertEquals("0.0040988", cfm.calculateFieldVersion().toPlainString());
		assertFalse(cfm.isAttribute());
	}
	
	public void testClassFieldMethodsAddressMutant() {
		ClassFieldMethods cfm = new ClassFieldMethods(AddressMutant.class);
		assertTrue(cfm.isMutant());
		assertEquals("0.006099", cfm.calculateFieldVersion().toPlainString());
		assertFalse(cfm.isAttribute());
	}
	
	public void testClassFieldMethodsStringIdentifier() {
		ClassFieldMethods cfm = new ClassFieldMethods(StringIdentifier.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValid());
		assertEquals("key", cfm.getImmutableFieldName());
		assertEquals(String.class, cfm.getImmutableFieldType());
		assertEquals("0.0051028", cfm.calculateFieldVersion().toPlainString());
		assertTrue(cfm.isAttribute());
		assertEquals(String.class, cfm.getAttributeClass());
	}
	
	public void testClassFieldMethodsLongIdentifier() {
		ClassFieldMethods cfm = new ClassFieldMethods(LongIdentifier.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValid());
		assertEquals("id", cfm.getImmutableFieldName());
		assertEquals(Long.class, cfm.getImmutableFieldType());
		assertEquals("0.0048363", cfm.calculateFieldVersion().toPlainString());
		assertTrue(cfm.isAttribute());
		assertEquals(Long.class, cfm.getAttributeClass());
	}

	public void testClassFieldMethodsLongMutantIdentifier() {
		ClassFieldMethods cfm = new ClassFieldMethods(LongIdentifier.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isAttribute());
		assertEquals(Long.class, cfm.getAttributeClass());
	}
	
	public void testClassFieldMethodsModifyEMailListMutant() {
		ClassFieldMethods cfm = new ClassFieldMethods(ModifyEMailListMutant.class);
		assertTrue(cfm.isMutant());
		assertFalse(cfm.isValid());
		assertFalse(cfm.isAttribute());
	}
	
	public void testClassFieldMethodsDomainName() {
		ClassFieldMethods cfm = new ClassFieldMethods(DomainName.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValid());
		List<FieldMethods> fms = cfm.getFieldMethods();
		assertTrue(fms.size() == 1);
		FieldMethods fm = fms.get(0);
		String name = fm.getName();
		assertEquals("name", name);
		Method getter = fm.getGetter();
		assertNotNull(getter);
	}
	
	public void testClassFieldMethodsEMail() {
		ClassFieldMethods cfm = new ClassFieldMethods(EMail.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValid());
		
		List<FieldMethods> fms = cfm.getFieldMethods();
		assertTrue(fms.size() == 1);
	}
	
	public void testClassFieldMethodsPerson() {
		ClassFieldMethods cfm = new ClassFieldMethods(PersonMutant.class);
		assertTrue(cfm.isMutant());
		assertFalse(cfm.isValid());
		
		List<FieldMethods> fms = cfm.getFieldMethods();
		assertEquals(14, fms.size());
	}
	
	public void testClassFieldMethodsEMailMutant() {
		ClassFieldMethods cfm = new ClassFieldMethods(EMailMutant.class);
		assertTrue(cfm.isMutant());
		
		List<FieldMethods> fms = cfm.getFieldMethods();
		assertEquals(9, fms.size());
	}
	
	public void testClassFieldMethodsUserGroup() {
		ClassFieldMethods cfm = new ClassFieldMethods(UserGroup.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValid());
		
		List<FieldMethods> fms = cfm.getFieldMethods();
		assertEquals(1, fms.size());
	}
	
	public void testClassFieldMethodsUserGroupMutant() {
		ClassFieldMethods cfm = new ClassFieldMethods(UserGroupMutant.class);
		assertTrue(cfm.isMutant());
		
		List<FieldMethods> fms = cfm.getFieldMethods();
		assertEquals(2, fms.size());
	}
}
