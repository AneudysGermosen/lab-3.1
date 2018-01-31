
public class bubblesort 
{
	
	
	
	public static void bsort(String []safehouse) 
	{
		
		int swaps = 1;
		
		while(swaps>0) 
		{
			swaps = 0;
		
			for(int uzi = 1; uzi<safehouse.length; uzi++)
			{			
				if(safehouse[uzi-1].compareToIgnoreCase(safehouse[uzi])<0)
				{
					String yuh  = safehouse[uzi-1];
					safehouse[uzi-1] = safehouse[uzi];
					safehouse[uzi] = yuh;
					swaps++;
						
				}		
			
			}//For loop condition is checked
			
		}//While loop condition is checked
		
	}
	
}

