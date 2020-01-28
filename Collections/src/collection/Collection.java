package collection;
import java.util.ArrayList;

public class Collection {
public static void main(String [] args)
{
	ArrayList<String> list1 = new ArrayList<>();        //list 1
	
	list1.add("Surya");
	list1.add("Rajya Lakshmi");
	list1.add("Idiott");
	list1.add("Bhargavi");
	list1.add("Damini");
	list1.add("Agnes");
	
	ArrayList<String> list2 = new ArrayList<>();         //list 2
	
	list2.add("Ramya");
	list1.addAll(list2);
	
	System.out.println(list1);                         //combined list
	
}
}
