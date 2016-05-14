import java.util.Scanner;


public class NewsAgency {

		public static void main(String [] args)
		{

			Scanner in=new Scanner(System.in);
			String[] cats={"Sports","Politics","Fashion","Education","Poverty","Health"};
			int wish=0;
			ReporterFactory reporterFactory;

		    Reporter reporter;
			int option;
			String type,name;
			while(wish < 4)
			{
				String[] s=new String[5];
				ReaderFactory readerFactory;
				Reader r1;
				System.out.println("1.Reporter\n2.Reader\n3.Subscriber\n4. exit");
				option=in.nextInt();
				switch(option)
				{
				case 1:	System.out.println("what is your name?");
						name=in.next();
						System.out.println("What type of article you wish to write?");
						for(String a: cats)
						{
							System.out.println(a);
						}	
						type=in.next();
						reporterFactory = new ReporterFactory();
						reporter = reporterFactory.getCategory(type);
					    reporter.writeArticle();
					    reporter.notifyEveryone();
						break;
				case 2:	System.out.println("what is your your name?");
						name=in.next();
						System.out.println("type of reader?");
						type=in.next();
						System.out.println("Categories selected: \n");
						readerFactory=new ReaderFactory();
						r1= readerFactory.getReader(type);
						r1.display(name);
						break;
				case 3: System.out.println("Enter your name: ");
						name=in.next();
						System.out.println("Premium\nNormal");
						type=in.next();
						for(String a: cats)
						{
							System.out.println(a);
						}	
						if(type.equalsIgnoreCase("Premium"))
						{
							for(int i=0;i<5;i++)
							{	
								s[i]=in.next();
								reporterFactory = new ReporterFactory();
								reporter = reporterFactory.getCategory(s[i]);
								reporter.add(name);
							}	
						}
						else if(type.equalsIgnoreCase("Normal"))
						{
							for(int i=0;i<2;i++)
							{	
								s[i]=in.next();
								reporterFactory = new ReporterFactory();
								reporter = reporterFactory.getCategory(s[i]);
								reporter.add(name);
							}	
						}	
						readerFactory=new ReaderFactory();
						r1= readerFactory.getReader(type);
						r1.add(name,s);
						
						break;
				case 4: 
					break;
				default: 
					break;
				}
			}	
		}
}
