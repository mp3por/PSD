package exceptions;

public class ProccessingTagException extends Exception {
	public ProccessingTagException(String tag, String value) {
		super("Problem processing tag:" + tag + "\t with value: " + value );
	}

}
