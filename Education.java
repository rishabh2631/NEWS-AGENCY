import java.util.ArrayList;


public class Education implements Reporter{
	static ArrayList<String> x =new ArrayList<>(); 
	 
	public void add(String name) {
		 
		x.add(name);
	}

	 
	public void writeArticle() {
		System.out.println("Article has been written on Education");
		
	}
	
	 
	public void notifyEveryone() {
		 
		int length=x.size();
		for(int i=0;i<length;i++)
			System.out.println("Notified "+x.get(i));
		
	}

}
