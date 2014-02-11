package org.adligo.xml_io.generators.models;

import org.adligo.tests.ATest;
import org.adligo.xml_io_generator.models.FieldNameToUnderscore;

public class FieldNameToUnderscoreTests extends ATest {

	public void test() {
		String result = FieldNameToUnderscore.toUnderscore("testFoo");
		assertEquals("TEST_FOO", result);
		
		
		result = FieldNameToUnderscore.toUnderscore("test_Foo");
		assertEquals("TEST_FOO", result);
	}
}
