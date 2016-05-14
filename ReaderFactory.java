
public class ReaderFactory {
	public Reader getReader(String string) {

	if(string == null){
		return null;
	}		
	if(string.equalsIgnoreCase("normal")){
		return new NormalReader();
    
	} 
	else if(string.equalsIgnoreCase("premium")){
		return new PremiumReader();
    
	} 
	return null;
}
}
