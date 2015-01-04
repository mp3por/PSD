package exceptions;

/**
 * An exception to show that an invalid tag was entered in the properties file 
 * */
public class InvalidTagException extends Exception {
	
	public InvalidTagException(String tag) {
		super("Invalid tag: " + tag );
	}
}
