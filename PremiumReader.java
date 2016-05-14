import java.util.ArrayList;


public class PremiumReader implements Reader{

	static ArrayList<String> x =new ArrayList<>(); 


	 
	public void display(String name) {
		 
		for(int i=0;i<x.size();i=i+6)
		{
			if(name.equalsIgnoreCase(x.get(i)))
			{
				int j=i;
				for(int k=0;k<5;k++)
				System.out.println(x.get(++j)+"\n");
			}
		}
	}

	 
	public void add(String name, String[] s) {
		 
		x.add(name);
		for(int i=0;i<5;i++)
		{
			x.add(s[i]);
		}	
		
	}
	
}
