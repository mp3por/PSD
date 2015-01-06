package tags;

import main.CrackerProperties;
import exceptions.ProccessingTagException;

public interface TagInterface {
	public final static String messageTemplate = "Tag:{0}\n\tdescription: {1}\n\tsyntax: {2}\n\texample: {3}";


	public void processTagValue() throws ProccessingTagException;

	public String manual();
}
