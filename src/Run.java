import java.util.ArrayList;


public class Run
{
	private static ArrayList<String> textData = new ArrayList<String>();
	
	public static void main(String[] args)
	{
		
		
		FileReader reader = new FileReader();
		//reader.openFile("c:/Users/David/AppData/Local/PokerStars.DK/HandHistory/HH20140808 Caprera IV - $0.02-$0.05 - USD No Limit Hold'em.txt"); //the poker table handhistory
		reader.loadHistory(); //Loads poker HandHistory.
		    
             
		//reader.closeFileAfterUse();
	}
}