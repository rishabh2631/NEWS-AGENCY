
public class ReporterFactory {

	public Reporter getCategory(String string) {
		if(string == null){
			return null;
		}		
		if(string.equalsIgnoreCase("sports")){
			return new Sports();
        
		} 
		else if(string.equalsIgnoreCase("politics")){
			return new Politics();
        
		} 
		else if(string.equalsIgnoreCase("fashion")){
			return new Fashion();
			
		}
		else if(string.equalsIgnoreCase("education")){
			return new Education();
			
		}
		else if(string.equalsIgnoreCase("poverty")){
			return new Poverty();
			
		}
		else if(string.equalsIgnoreCase("health")){
			return new Health();
			
		}
     
     return null;
		
		
	}
	
}
