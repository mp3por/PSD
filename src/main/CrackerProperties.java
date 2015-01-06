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
	
	
	//TODO: Implement to return an immutable version of this object
	public void getImmutableObject(){
		
	}
	
}
