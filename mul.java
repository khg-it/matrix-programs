public class mul {
    public static void main(String args[])
    {
        int[][]arr=new int[][]{{1,1},{2,2}};
        int[][]brr=new int[][]{{1,1},{1,1}};
        int[][]crr=new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                crr[i][j]=0;
                for(int k=0;k<2;k++)
                {
                      crr[i][j]+=arr[i][k]*brr[k][j];
                }
                System.out.print(crr[i][j]+" ");
            }System.out.println();
        }

    }
}
