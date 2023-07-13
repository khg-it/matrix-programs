public class equalmatrics {
    public static void main(String args[])
    {
        int[][]arr=new int[][]{{1,1},{1,1}};
        int[][]brr=new int[][]{{1,1},{1,1}};
        boolean flag=true;
        int row1=arr.length;
        int col1=arr[0].length;
        int row2=arr.length;
        int col2=arr[0].length;
        if((row1!=row2)||(col1!=col2))
        {
            System.out.println("EXIT!!!!!");
        }
        else
        {
             for(int i=0;i<arr.length;i++)
             {
                for(int j=0;j<arr.length;j++)
                {
                    if(arr[i][j]!=brr[i][j])
                    {
                        flag=false;
                        break;
                    }
                }
             }
             if(flag)
             System.out.println("matrics are  equal");
             else
             System.out.println("matrics are not equal");
        }
        
    }
}
