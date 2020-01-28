package collection;
import java.util.ArrayList;
import java.util.Arrays;

public class Remove {
	public static void main(String [] args)
	{
		ArrayList<String> Names = new ArrayList<>(Arrays.asList("Surya", "Ramya", "Rajii", "Saii"));
	      System.out.println(Names);
	         
	        Names.remove("Rajii");          //Element is present
	         
	        System.out.println(Names);
	         
	        Names.remove("Surya");          //Element is NOT present
	         
	        System.out.println(Names);
	    }
}
	

		
	
	
	


