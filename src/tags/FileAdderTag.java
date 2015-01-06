package tags;

import java.io.File;
import java.text.MessageFormat;
import java.util.LinkedList;
import java.util.List;

import main.CrackerProperties;
import exceptions.ProccessingTagException;

/**
 * This will add the files to the Properties
 * */
public class FileAdderTag implements TagInterface{
	private CrackerProperties crackerProps;
	private String value;

	public FileAdderTag(CrackerProperties crackerProps, String value) {
		this.crackerProps = crackerProps;
		this.value = value;
	}
	
	@Override
	public String manual(){
		String tag = "files";
		String description = "This tag is used to specify which files has to be cracked";
		String syntax = "files=pathToFile1;pathToFile2";
		String example = "files=props.props;unbreakable.txt";
		return MessageFormat.format(messageTemplate, tag,description,syntax,example);
	}

	@Override
	public void processTagValue() throws ProccessingTagException {
		System.out.println("FileAdder tag");
		try {
			List<File> files = new LinkedList<File>();
			String[] fileNames = parse(value);
			for(String fileName: fileNames){
				File currFile = new File(fileName);
				if(currFile.exists()){
					files.add(currFile);
				}else{
					System.out.println("SPECIFIED FILE DOES NOT EXIST. HAS NOT BEEN ADDED: " + fileName);
				}
			}
			crackerProps.setFiles(files.stream().toArray(File[]::new)); // JAVA 8 magic :D
		} catch (Exception e) {
			e.printStackTrace();
			throw new ProccessingTagException("files", value);
		}
	}

	private String[] parse(String value) {
		return value.split(";");
	}

}
