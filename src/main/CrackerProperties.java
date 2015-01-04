package main;
import java.io.File;


/**
 * An object which will hold all the customisations of the cracker app
 * */
public class CrackerProperties {
	private File[] files;

	public File[] getFiles() {
		return files;
	}

	public void setFiles(File[] files) {
		this.files = files;
	}
	
}
