package tags;

import main.CrackerProperties;

public class TagFactory {
	
	private static CrackerProperties crackerProps;
	private static TagFactory factory;
	
	private TagFactory(CrackerProperties crackerProps) {
		this.crackerProps = crackerProps;
	}
	
	public static TagFactory getInstance(CrackerProperties props){
		if(factory == null){
			factory = new TagFactory(props);
		}
		return factory;
	}
	
	public void setCrackerProperies(CrackerProperties props){
		this.crackerProps = props;
	}
	
	public static TagInterface getTagObject(String tag, String value){
		
		if(tag.equals("files")){
			return new FileAdder(crackerProps,value);
		}
		
		return null;
	}
}
