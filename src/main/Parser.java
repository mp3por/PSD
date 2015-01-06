package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import tags.TagFactory;
import exceptions.InvalidTagException;
import exceptions.ProccessingTagException;

/**
 * This object will be responsible to parse the properties file and follow the
 * commands in it to set up a CrackerProperties object.
 * */
public class Parser {

	private final String[] tagArray = { "files" };
	private final CrackerProperties crackerProperties;
	private final Properties props;
	private final TagFactory tagFactory;

	Set<String> tags = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(tagArray)));

	public Parser(String propertyFileName) {
		crackerProperties = new CrackerProperties();
		tagFactory = TagFactory.getInstance(crackerProperties);
		props = new Properties();

		try {
			props.load(new FileInputStream(propertyFileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("FILE DOES NOT EXIST! EXIT!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public CrackerProperties parse() throws InvalidTagException, ProccessingTagException {
		this.parse(props);
		return crackerProperties;
	}

	//TODO: mahni system.out 
	private void parse(Properties props) throws InvalidTagException, ProccessingTagException {
		//main loop over the tags
		for (Map.Entry<?, ?> e : props.entrySet()) {
			String tag = (String) e.getKey();
			String value = (String) e.getValue();
			if (!tags.contains(tag)) {
				//throw new InvalidTagException(tag);
				System.out.println(tag);
			} else {
				tagFactory.getTagObject(tag, value).processTagValue();
			}
		}
	}

	public void getProperties() {
	}
}
