
public class bubblesort {
	
	
	public static void bubswi( String[]safehouse, int uzi, int vert) {
		
		String yuh  = safehouse[uzi];
		safehouse[uzi] = safehouse[vert];
		safehouse[vert] = yuh;
	}
	
	public static void bsort(String []safehouse) 
	{
		for(int uzi = 0; uzi<safehouse.length; uzi++)
		{	
		if(safehouse[uzi].compareToIgnoreCase(safehouse[uzi+1])<0)
		{
			String yuh  = safehouse[uzi];
			safehouse[uzi] = safehouse[uzi+1];
			safehouse[uzi+1] = yuh;
		}
		
		}
	}
	
}

