package org.adligo.xml_io.generators.models;

import org.adligo.tests.ATest;
import org.adligo.xml_io_generator.models.Namespace;

public class NamespaceTests extends ATest {

	public void testNamespace() {
		String result = Namespace.toNamespace("org.adligo.foo");
		assertEquals("http://www.adligo.org/foo", result);
		
		result = Namespace.toNamespace("org.adligo.foo.client");
		assertEquals("http://www.adligo.org/foo/client", result);
	}
}
