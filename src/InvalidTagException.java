
public class InvalidTagException extends Exception {
	
	public InvalidTagException(String tag) {
		super("Invalid tag: " + tag );
	}
}
