import java.util.List; 
import java.util.ArrayList; 
import java.util.*; 

public class Arrays
{
	public static void main(String Args[])
	{
		String[] foodArray = {"Pizza", "Fries", "Burrito", "Bagel"}; 
		List<String> foodArrayList = new ArrayList<String>(); 
		
		foodArrayList.add("Pizza"); 
		foodArrayList.add("Fries"); 
		foodArrayList.add("Burrito"); 
		foodArrayList.add("Bagel"); 

		for(String food : foodArray)
		{
			System.out.println(food); 
		}
		for(String food : foodArrayList)	
		{
			System.out.println(food); 
		}
		
		Array.sort(foodArray); 
		Collections.sort(foodArrayList); 
		
		for(String food : foodArray)
		{
			System.out.println(food); 
		}
		for(String food : foodArrayList)
		{
			System.out.println(food); 
		}
	}
}
