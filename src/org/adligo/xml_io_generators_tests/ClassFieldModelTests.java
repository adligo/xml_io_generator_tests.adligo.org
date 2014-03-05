package org.adligo.xml_io_generators_tests;

import java.lang.reflect.Method;
import java.util.List;

import org.adligo.i.util.shared.I_Immutable;
import org.adligo.models.core.shared.Address;
import org.adligo.models.core.shared.AddressMutant;
import org.adligo.models.core.shared.DomainName;
import org.adligo.models.core.shared.ModifyEMailListMutant;
import org.adligo.models.core.shared.PersonMutant;
import org.adligo.models.core_relations.shared.EMail;
import org.adligo.models.core_relations.shared.EMailMutant;
import org.adligo.models.core_relations.shared.UserGroup;
import org.adligo.models.core_relations.shared.UserGroupMutant;
import org.adligo.models.core_relations.shared.ids.LongIdentifier;
import org.adligo.models.core_relations.shared.ids.LongIdentifierMutant;
import org.adligo.models.core_relations.shared.ids.StringIdentifier;
import org.adligo.models.core_relations.shared.ids.StringIdentifierMutant;
import org.adligo.tests.ATest;
import org.adligo.xml_io_generator.models.ClassFieldMethods;
import org.adligo.xml_io_generator.models.FieldMethods;

public class ClassFieldModelTests extends ATest {
	
	@Override
	public void setUp() {
		ClassFieldMethods.setI_IMMUTABLE(I_Immutable.class);
	}

	public void testClassFieldMethodsMockModel() throws Exception {
		ClassFieldMethods cfm = new ClassFieldMethods(MockModel.class);
		assertFalse(cfm.isMutant());
		assertFalse(cfm.isValidImmutable());
		assertEquals("2.0054054", cfm.calculateFieldVersion().toPlainString());
		assertFalse(cfm.isAttribute());
	}
	
	public void testClassFieldMethodsMockMutant() throws Exception {
		ClassFieldMethods cfm = new ClassFieldMethods(MockMutant.class);
		assertTrue(cfm.isMutant());
		assertEquals("1.0051031", cfm.calculateFieldVersion().toPlainString());
		assertFalse(cfm.isAttribute());
	}	
	
	public void testClassFieldMethodsMockImmutableModel() throws Exception {
		ClassFieldMethods cfm = new ClassFieldMethods(MockImmutableModel.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValidImmutable());
		assertEquals("5.0055896", cfm.calculateFieldVersion().toPlainString());
		assertTrue(cfm.isAttribute());
		assertEquals(String.class, cfm.getAttributeClass());
	}
	
	public void testClassFieldMethodsMockInterfaceMutant() throws Exception {
		ClassFieldMethods cfm = new ClassFieldMethods(MockInterfaceMutant.class);
		assertTrue(cfm.isMutant());
		assertEquals("3.0057106", cfm.calculateFieldVersion().toPlainString());
		assertTrue(cfm.isAttribute());
		assertEquals(String.class, cfm.getAttributeClass());
	}
	
	public void testClassFieldMethodsMockInterfaceModel() throws Exception {
		ClassFieldMethods cfm = new ClassFieldMethods(MockInterfaceModel.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValidImmutable());
		assertEquals("4.0059948", cfm.calculateFieldVersion().toPlainString());
		assertTrue(cfm.isAttribute());
		assertEquals(String.class, cfm.getAttributeClass());
	}
	
	public void testClassFieldMethodsAddress() throws Exception {
		ClassFieldMethods cfm = new ClassFieldMethods(Address.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValidImmutable());
		assertEquals("0.00409", cfm.calculateFieldVersion().toPlainString());
		assertFalse(cfm.isAttribute());
	}
	
	public void testClassFieldMethodsAddressMutant() throws Exception {
		ClassFieldMethods cfm = new ClassFieldMethods(AddressMutant.class);
		assertTrue(cfm.isMutant());
		assertEquals("0.0060536", cfm.calculateFieldVersion().toPlainString());
		assertFalse(cfm.isAttribute());
	}
	
	public void testClassFieldMethodsStringIdentifier() throws Exception {
		ClassFieldMethods cfm = new ClassFieldMethods(StringIdentifier.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValidImmutable());
		assertEquals("mut", cfm.getImmutableFieldName());
		assertEquals(StringIdentifierMutant.class, cfm.getImmutableFieldType());
		assertEquals("1.0066733", cfm.calculateFieldVersion().toPlainString());
		assertTrue(cfm.isAttribute());
		assertEquals(String.class, cfm.getAttributeClass());
	}
	
	public void testClassFieldMethodsStringMutantIdentifier() throws Exception {
		ClassFieldMethods cfm = new ClassFieldMethods(StringIdentifierMutant.class);
		assertTrue(cfm.isMutant());
		assertEquals("1.0067998", cfm.calculateFieldVersion().toPlainString());
		assertTrue(cfm.isAttribute());
		assertEquals(String.class, cfm.getAttributeClass());
	}
	
	public void testClassFieldMethodsLongIdentifierMutant() throws Exception {
		ClassFieldMethods cfm = new ClassFieldMethods(LongIdentifierMutant.class);
		assertTrue(cfm.isMutant());
		assertEquals("1.0065333", cfm.calculateFieldVersion().toPlainString());
		assertTrue(cfm.isAttribute());
		assertEquals(Long.class, cfm.getAttributeClass());
	}
	
	public void testClassFieldMethodsLongIdentifier() throws Exception {
		ClassFieldMethods cfm = new ClassFieldMethods(LongIdentifier.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValidImmutable());
		assertEquals("mut", cfm.getImmutableFieldName());
		assertEquals(LongIdentifierMutant.class, cfm.getImmutableFieldType());
		assertEquals("1.0064192", cfm.calculateFieldVersion().toPlainString());
		assertTrue(cfm.isAttribute());
		assertEquals(Long.class, cfm.getAttributeClass());
	}

	public void testClassFieldMethodsLongMutantIdentifier() throws Exception {
		ClassFieldMethods cfm = new ClassFieldMethods(LongIdentifier.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isAttribute());
		assertEquals(Long.class, cfm.getAttributeClass());
	}
	
	public void testClassFieldMethodsModifyEMailListMutant() throws Exception {
		ClassFieldMethods cfm = new ClassFieldMethods(ModifyEMailListMutant.class);
		assertTrue(cfm.isMutant());
		assertFalse(cfm.isValidImmutable());
		assertFalse(cfm.isAttribute());
	}
	
	public void testClassFieldMethodsDomainName() throws Exception {
		ClassFieldMethods cfm = new ClassFieldMethods(DomainName.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValidImmutable());
		List<FieldMethods> fms = cfm.getFieldMethods();
		assertTrue(fms.size() == 1);
		FieldMethods fm = fms.get(0);
		String name = fm.getName();
		assertEquals("name", name);
		Method getter = fm.getGetter();
		assertNotNull(getter);
	}
	
	public void testClassFieldMethodsEMail() throws Exception {
		ClassFieldMethods cfm = new ClassFieldMethods(EMail.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValidImmutable());
		
		List<FieldMethods> fms = cfm.getFieldMethods();
		assertTrue(fms.size() == 1);
	}
	
	public void testClassFieldMethodsPerson() throws Exception {
		ClassFieldMethods cfm = new ClassFieldMethods(PersonMutant.class);
		assertTrue(cfm.isMutant());
		assertFalse(cfm.isValidImmutable());
		
		List<FieldMethods> fms = cfm.getFieldMethods();
		assertEquals(14, fms.size());
	}
	
	public void testClassFieldMethodsEMailMutant() throws Exception {
		ClassFieldMethods cfm = new ClassFieldMethods(EMailMutant.class);
		assertTrue(cfm.isMutant());
		
		List<FieldMethods> fms = cfm.getFieldMethods();
		assertEquals(9, fms.size());
	}
	
	public void testClassFieldMethodsUserGroup() throws Exception {
		ClassFieldMethods cfm = new ClassFieldMethods(UserGroup.class);
		assertFalse(cfm.isMutant());
		assertTrue(cfm.isValidImmutable());
		
		List<FieldMethods> fms = cfm.getFieldMethods();
		assertEquals(1, fms.size());
	}
	
	public void testClassFieldMethodsUserGroupMutant() throws Exception {
		ClassFieldMethods cfm = new ClassFieldMethods(UserGroupMutant.class);
		assertTrue(cfm.isMutant());
		
		List<FieldMethods> fms = cfm.getFieldMethods();
		assertEquals(2, fms.size());
	}
}
