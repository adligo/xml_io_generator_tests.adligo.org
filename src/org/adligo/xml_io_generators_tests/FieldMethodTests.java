package org.adligo.xml_io_generators_tests;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.adligo.tests.ATest;
import org.adligo.xml_io_generator.models.FieldMethods;

public class FieldMethodTests extends ATest {

	public void testGettersAndSetters() throws Exception {
		Class<?> clazz = MockModel.class;
		Field [] fields = clazz.getDeclaredFields();
		Map<String, Field> namedFields = new HashMap<String, Field>();
		
		for (int i = 0; i < fields.length; i++) {
			Field f = fields[i];
			String name = f.getName();
			namedFields.put(name, f);
		}
		
		Field field = namedFields.get("id");
		assertNotNull(field);
		FieldMethods fm = new FieldMethods(clazz, field);
		assertEquals(field, fm.getField());
		assertNotNull(fm.getGetter());
		assertNotNull(fm.getSetter());
		
		
		field = namedFields.get("fid");
		assertNotNull(field);
		fm = new FieldMethods(clazz, field);
		assertEquals(field, fm.getField());
		assertNull(fm.getGetter());
		assertNotNull(fm.getSetter());
		
		field = namedFields.get("fid");
		assertNotNull(field);
		fm = new FieldMethods(clazz, field);
		assertEquals(field, fm.getField());
		assertNull(fm.getGetter());
		assertNotNull(fm.getSetter());
		
		field = namedFields.get("did");
		assertNotNull(field);
		fm = new FieldMethods(clazz, field);
		assertEquals(field, fm.getField());
		assertNotNull(fm.getGetter());
		assertNull(fm.getSetter());
		
		field = namedFields.get("sid");
		assertNotNull(field);
		fm = new FieldMethods(clazz, field);
		assertEquals(field, fm.getField());
		assertNotNull(fm.getGetter());
		assertNotNull(fm.getSetter());
		
		field = namedFields.get("b");
		assertNotNull(field);
		fm = new FieldMethods(clazz, field);
		assertEquals(field, fm.getField());
		assertNotNull(fm.getGetter());
		assertNotNull(fm.getSetter());
		
		field = namedFields.get("b2");
		assertNotNull(field);
		fm = new FieldMethods(clazz, field);
		assertEquals(field, fm.getField());
		assertNotNull(fm.getGetter());
		assertNotNull(fm.getSetter());
		
		field = namedFields.get("b3");
		assertNotNull(field);
		fm = new FieldMethods(clazz, field);
		assertEquals(field, fm.getField());
		assertNull(fm.getGetter());
		assertNotNull(fm.getSetter());
		
		field = namedFields.get("b4");
		assertNotNull(field);
		fm = new FieldMethods(clazz, field);
		assertEquals(field, fm.getField());
		assertNotNull(fm.getGetter());
		assertNull(fm.getSetter());
		
		field = namedFields.get("b5");
		assertNotNull(field);
		fm = new FieldMethods(clazz, field);
		assertEquals(field, fm.getField());
		assertNotNull(fm.getGetter());
		assertNotNull(fm.getSetter());
	}
}
