import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Parser {

	private final String[] tagArray = {"files"};
	
	Set<String> tags = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(tagArray)));

	public Parser(String propertyFileName) {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(propertyFileName));
			parse(props);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("FILE DOES NOT EXIST! EXIT!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void parse(Properties props) {
		boolean valid = checkValidy(props);
	}

	private boolean checkValidy(Properties props) {
		for (Map.Entry<?, ?> e : props.entrySet()) {
			String key = (String) e.getKey();
			if(!tags.contains(key)){
				System.err.println("Unknown tag: " + key);
			}
		}
		return false;
	}

}
