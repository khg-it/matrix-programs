public class add{
    public static void main(String[]args)
    {
        int[][]arr=new int[][]{{1,1},{2,2}};
        int[][]brr=new int[][]{{1,1},{1,1}};
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(arr[i][j]+brr[i][j]);
            }
        }
    }
}