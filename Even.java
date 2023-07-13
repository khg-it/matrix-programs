




import java.util.*;
public class Even {
    public static void main(String[]args)
    {
            System.out.println("enter element 1 by 1: ");
             Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
             int [] ar=new int[n];
             for(int i=0;i<n;i++)
             {
                ar[i]=sc.nextInt();
             }
             for(int i=0;i<5;i++)
             {
                if(i%2==0)
                {
                    System.out.println(ar[i]+ " ");
                }
             }

    }
    
}
