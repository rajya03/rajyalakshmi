package collection;
import java.util.ArrayList;

public class ArrayList_clear {
	public static void main(String[] args) 
    {
        ArrayList<String> arrayList = new ArrayList<>(); 
         
        arrayList.add("abcd");
        arrayList.add("bcab");
        arrayList.add("cdab");
        arrayList.add("dabc");
         
        System.out.println(arrayList);   
         
        arrayList.clear();
         
        System.out.println(arrayList);   
    }
}

