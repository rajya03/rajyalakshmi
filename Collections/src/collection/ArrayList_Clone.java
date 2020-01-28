package collection;
import java.util.ArrayList;
public class ArrayList_Clone {
    public static void main(String[] args) 
    {
        ArrayList<String> arrayListObject = new ArrayList<>(); 
         
        arrayListObject.add("1234");
        arrayListObject.add("2341");
        arrayListObject.add("3412");
        arrayListObject.add("4123");
         
        System.out.println(arrayListObject);   
         
        ArrayList<String> arrayListClone =  (ArrayList<String>) arrayListObject.clone();
         
        System.out.println(arrayListClone);   
    }
}

