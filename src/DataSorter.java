public class DataSorter {
	
	private int handNumber;

	FileReader reader = new FileReader();
	
	public void setPokerHand()
	{
		
		
		
	}
	
	public void getHandNumbers()
	{
		reader.loadHistory();
		
		int i = 0; 
		
		if (i < reader.getTextData().size())
		{
			String data = reader.getLineFromTextData(i);
			
			System.out.println(data.indexOf("#"));
			
		}
		
		
	}
	
	
	
	
	
}
