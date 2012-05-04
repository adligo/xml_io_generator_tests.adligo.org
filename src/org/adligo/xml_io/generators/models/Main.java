package org.adligo.xml_io.generators.models;

import java.io.IOException;

import org.adligo.jse.util.JSECommonInit;
import org.adligo.models.core.client.AddressMutant;
import org.adligo.xml_io.generator.SourceCodeGenerator;
import org.adligo.xml_io.generator.models.SourceCodeGeneratorParams;

public class Main {

	public static void main(String [] args) {
		JSECommonInit.callLogDebug("Main");
		try {
			SourceCodeGeneratorParams params = new SourceCodeGeneratorParams();
			params.setOutputDirectory("/Users/scott/org_src/xml_io_generator_tests/gen_src");
			params.addClass(AddressMutant.class);
			
			SourceCodeGenerator.generate(params);
		} catch (IOException x) {
			x.printStackTrace();
		}
	}
}
