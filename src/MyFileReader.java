import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;



public class MyFileReader {
	private static ArrayList<String> textData = new ArrayList<String>();
	private int line;
	private String handNumber;
	
	public void getHandHistory()
	{
		try
		{
			
			line = getLineNumbers();
			
			BufferedReader reader = new BufferedReader(new FileReader("c:/Users/David/AppData/Local/PokerStars.DK/HandHistory/HH20140808 Caprera IV - $0.02-$0.05 - USD No Limit Hold'em.txt"));
			
			while (line != 0) { // reads lines and adds them to textDate ArrayList.
			   textData.add(reader.readLine());
			    
			   line--;
			      
			}
			reader.close(); // closing file
		}
		
		catch(IOException i)
		{
			i.printStackTrace();
		}
		
		System.out.println(getHandNumber("11#"));
		
		
		for(String part : textData)
		{ 
			//System.out.println(part);
			
			
//			//PokerHandNumbers
//			   if (part.contains("#11") == true)
//		    {
//				   String[] parts = part.split(" ");
//				   
//				   
//				   String partingHand = parts[2];
////				   for (String parting : parts)
////				   {
////				   System.out.println(parting);
////				   }
//				   
//				   System.out.println(partingHand);
//			}
			   
			   // Blinds
			   
			   if (part.contains("($") && part.contains("USD)") == true)
			    {
					   String[] parts = part.split(" ");
					   
					   
					   String partingHand = parts[7] + parts[8];
//					   for (String parting : parts)
//					   {
//					   System.out.println(parting);
//					   }
					   
					   System.out.println(partingHand);
				}
			   
			   // Table Name
			   
			   if (part.contains("Table") == true)
			    {
					   String[] parts = part.split(" ");
					   
					   
					   String partingHand = parts[1] + parts[2] + parts[3];
//					   for (String parting : parts)
//					   {
//					   System.out.println(parting);
//					   }
					   
					   System.out.println(partingHand);
				}
			   
			   //Time
			   
			   if (part.contains("#11") == true)
			    {
					   String[] parts = part.split(" ");
					   
					   
					   String partingHand = parts[10] + parts[11];
//					   for (String parting : parts)
//					   {
//					   System.out.println(parting);
//					   }
					   
					   System.out.println(partingHand);
				}
			   
			   //seat1
			   
			   if (part.contains("Seat 1:") == true)
			    {
					   String[] parts = part.split(" ");
					   
					   
					   String partingHand = parts[2];
//					   for (String parting : parts)
//					   {
//					   System.out.println(parting);
//					   }
					   
					   System.out.println(partingHand);
				}
			   

		}//End for-løkke
		
		
	}
	
	/* ********************************** get data methods ********************************** */
	   
	   
	   
//	   //seat2
//	   
//	   if (part.contains("Seat 2:") == true)
//	    {
//			   String[] parts = part.split(" ");
//			   
//			   
//			   String partingHand = parts[2];
////			   for (String parting : parts)
////			   {
////			   System.out.println(parting);
////			   }
//			   
//			   System.out.println(partingHand);
//		}
//	   
//	   //seat3
//	   
//	   if (part.contains("Seat 3:") == true)
//	    {
//			   String[] parts = part.split(" ");
//			   
//			   
//			   String partingHand = parts[2];
////			   for (String parting : parts)
////			   {
////			   System.out.println(parting);
////			   }
//			   
//			   System.out.println(partingHand);
//		}
//	   
//	   //seat4
//	   
//	   if (part.contains("Seat 4:") == true)
//	    {
//			   String[] parts = part.split(" ");
//			   
//			   
//			   String partingHand = parts[2];
////			   for (String parting : parts)
////			   {
////			   System.out.println(parting);
////			   }
//			   
//			   System.out.println(partingHand);
//		}
//	   
//	   //seat5
//	   
//	   if (part.contains("Seat 5:") == true)
//	    {
//			   String[] parts = part.split(" ");
//			   
//			   
//			   String partingHand = parts[2];
////			   for (String parting : parts)
////			   {
////			   System.out.println(parting);
////			   }
//			   
//			   System.out.println(partingHand);
//		}
//	   
//	   //seat6
//	   
//	   if (part.contains("Seat 6:") == true)
//	    {
//			   String[] parts = part.split(" ");
//			   
//			   
//			   String partingHand = parts[2];
////			   for (String parting : parts)
////			   {
////			   System.out.println(parting);
////			   }
//			   
//			   System.out.println(partingHand);
//		}
	
	public String getHandNumber(String marker)
	   {
		   
		   
		   for(String part : textData)
			{ 
				//System.out.println(part);
				
					//PokerHandNumbers
				   if (part.contains(marker) == true)
			    {
					   String[] parts = part.split(" ");
					   
					   
					   String partingHand = parts[2];
//					   for (String parting : parts)
//					   {
//					   System.out.println(parting);
//					   }
					   setHandNumber(partingHand);
					   System.out.println(partingHand);
					   
				}
				   
			}
		   return getHandNumber();
		   
		   
	   }
	
	public String getHandNumber() {
		return handNumber;
	}

	public void setHandNumber(String handNumber) {
		this.handNumber = handNumber;
	}

	public int getLineNumbers()
	{
		try
		{
		
			LineNumberReader  lnr = new LineNumberReader(new FileReader(new File("c:/Users/David/AppData/Local/PokerStars.DK/HandHistory/HH20140808 Caprera IV - $0.02-$0.05 - USD No Limit Hold'em.txt")));
			lnr.skip(Long.MAX_VALUE); // finding Linenumber
			lnr.close();// closing file
			return lnr.getLineNumber();
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
		
		return 0;
		
	}
}

