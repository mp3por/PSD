package tags;

import exceptions.ProccessingTagException;

public interface TagInterface {
	public boolean processTagValue() throws ProccessingTagException;
}
