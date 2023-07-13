


import java.util.*;
public class largestelement {
    public static void main(String args[]){
             System.out.println("enter element 1 by 1: ");
             Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
             int [] ar=new int[n];
             for(int i=0;i<n;i++)
             {
                ar[i]=sc.nextInt();
             }
             int lar=ar[0];
             int small=ar[0];
            for(int i=0;i<n;i++)
            {
                if(ar[i]>lar)
                {
                    lar=ar[i];
                    break;
                }
            }
            for(int i=0;i<n;i++)
            {
                if(ar[i]<small)
                {
                    small=ar[i];
                    break;
                }
            }
             System.out.println("largest element in an array: "+lar);
             System.out.println("Smallest element in an array: "+small);

            }
}
