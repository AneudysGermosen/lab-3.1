

// Aneudys Germosen
public class Sortingalgorithms 
{
	
	
	
	public static void bsort(String []safehouse) 
	{
		
		int swaps = 1;
		
		while(swaps>0) 
		{
			swaps = 0;
		
			for(int uzi = 1; uzi<safehouse.length; uzi++)
			{			
				if(safehouse[uzi-1].compareToIgnoreCase(safehouse[uzi])>0)
				{
					String yuh  = safehouse[uzi-1];
					safehouse[uzi-1] = safehouse[uzi];
					safehouse[uzi] = yuh;
					swaps++;
						
				}		
			
			}//For loop condition is checked
			
		}//While loop condition is checked
		
	}
	


	public static void Ssort(double[] magnolia)
	{
		for (int carti = 0; carti< magnolia.length-1; carti++) // this for loop 
		{
			int dx = carti;
			for(int wat = carti +1; wat< magnolia.length; wat++)
			{
				if( magnolia[wat] < magnolia[dx])
				{
					dx = wat;
				}
			}
			double lilnumber = magnolia[dx];
			magnolia[dx] = magnolia[carti];
			magnolia[carti] = lilnumber;
		}
	}



	public static void ISort(int[] list1)
	{
		for (int i = 1; i < list1.length; i++)
		{
			int j = i;
			while (j > 0)
			{
				if (list1[j] < list1[j - 1])
				{
					int num = list1[i];
					list1[i] = list1[j];
					list1[j] = num;
					j--;
				}
				else
				{
					break;
				}
			}
		}
	}
}
