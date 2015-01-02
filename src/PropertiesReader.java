import java.io.File;

/**
 * This is the class that will read the file and pass it to the Parser
 * */
public class PropertiesReader {
	private static String filename = "properties.prop";

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("using default filepath:" + filename);
		} else {
			filename = args[0];
			System.out.println("properties filepath:" + filename);
		}
		
		File propertyFile = new File(filename);
		System.out.println(propertyFile.exists());
	}
}
