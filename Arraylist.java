
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String args[])
    {
        ArrayList <Integer> List=new ArrayList <Integer>();
        // add elements
        List.add(0);
        List.add(2);
        List.add(3);
        System.out.println(List);
        // get elements
        int ele=List.get(0);
        System.out.println(ele);
        //set element
        List.set(0,5);
        System.out.println(List);
        int si=List.size();
        System.out.println(si);
        for(int i=0;i<si;i++)
        {
            System.out.println(List.get(i));
        }
        Collections.sort(List);
        System.out.println(List);
    
    }
}
