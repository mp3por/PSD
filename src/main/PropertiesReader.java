package main;
import java.io.File;
import java.io.IOException;

import exceptions.InvalidTagException;

/**
 * This is the class that will read the file and pass it to the Parser
 * */
public class PropertiesReader {
	private static final String DEFAULT_PROPERTIES_FILE_NAME = "properties.prop";

	public static void main(String[] args) {

		String filename = getFileName(args);

		try {
			Parser parser = new Parser(filename);
		} catch (InvalidTagException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static String getFileName(String[] args) {
		if (args.length != 1) {
			System.out.println("using default filepath:" + DEFAULT_PROPERTIES_FILE_NAME);

			return DEFAULT_PROPERTIES_FILE_NAME;
		} else {
			System.out.println("properties filepath:" + args[0]);

			return args[0];
		}
	}
}