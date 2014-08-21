import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class FileReader {
	Scanner input;
	private static ArrayList<String> textData = new ArrayList<String>();
	
	public void openFile(String filename)
	{
		File f = new File(filename);
		
      try {
   		input = new Scanner(f); 
      }
      catch(FileNotFoundException e) //Most specific exception first!
      {
         System.out.println("Filen blev ikke fundet");
      }
      catch(Exception e)
      {
         System.out.println("Der er sket en fejl. Det kunne være fordi filen blev ikke fundet.");
      }
      

	}
	
	public void closeFileAfterUse()
	{
		input.close();
      System.out.println("*****File Closed*****");
	}
	
	public boolean readLines()
	{
		boolean i = false;
		
		i = input.hasNextLine();
		
		
		return i;
		
	}
	
	public String readAndReturnOneLine()throws Exception
	{
		
      return input.nextLine();
		
	}
	
	public void loadHistory()
	{
		
		openFile("c:/Users/David/AppData/Local/PokerStars.DK/HandHistory/HH20140808 Caprera IV - $0.02-$0.05 - USD No Limit Hold'em.txt"); //the poker table handhistory
		
		try
	      {
	         
			int i = 0;
			while(readLines() == true)
			{
//			String question1 = reader.readAndReturnOneLine();
//		      System.out.println(question1);
			   i++;
			 textData.add(readAndReturnOneLine());  
			  
	      
			}
	         
	        System.out.println(i + " Lines Loaded!");
			
	        //System.out.println(readLines());
	         
	         
	      }
	      
	      catch(Exception e)
	      {
	         System.out.println("Line not found!");
	      }
		closeFileAfterUse();
	}
}
