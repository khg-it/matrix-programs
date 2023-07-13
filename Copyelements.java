

import java.util.*;
public class Copyelements{
    public static void main(String args[])
    {
        int i;
        int[] arr1=new int[4];
        int[] arr2=new int[4];
        System.out.println("enter elements one by one: ");
        Scanner scan=new Scanner(System.in);
        for(i=0;i<4;i++)
        {
            arr1[i]=scan.nextInt();
            arr2[i]=arr1[i];
        }
        System.out.println("copied array is: ");
        for(i=0;i<4;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        
    }
}