public class evenorodd {
    public static void main(String args[])
    {
        int even=0,odd=0;
         int arr[][]=new int[][]{{2,3,4},{5,7,8}};
         for(int i=0;i<2;i++)
         {
            for(int j=0;j<3;j++)
            {
                if((arr[i][j]%2==0))
                   even++;
                else
                    odd++;

            }
         }
         System.out.println("even frequency is: "+even);
         System.out.println("odd frequency is: "+odd);
    }
}
