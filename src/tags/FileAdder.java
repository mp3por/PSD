package tags;

import main.CrackerProperties;

/**
 * This will add the files to the Properties
 * */
public class FileAdder implements TagInterface {

	private CrackerProperties crackerProps;
	private String value;

	public FileAdder(CrackerProperties crackerProps, String value) {
		this.crackerProps = crackerProps;
		this.value = value;
	}

	@Override
	public boolean processTagValue() {
		System.out.println("FileAdder tag");
		return false;
	}

}
