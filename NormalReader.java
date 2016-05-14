import java.util.ArrayList;


public class NormalReader implements Reader{
	static ArrayList<String> x =new ArrayList<>(); 
	 
	public void display(String name) {
		 
		for(int i=0;i<x.size();i=i+3)
		{
			if(name.equalsIgnoreCase(x.get(i)))
			{
				int j=i;
				System.out.println(x.get(++j)+"\n"+x.get(++j));
			}
		}
		
	}

	 
	public void add(String name, String[] s) {
		 
		x.add(name);
		for(int i=0;i<2;i++)
		{
			x.add(s[i]);
		}	
	}

}
