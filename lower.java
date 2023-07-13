public class lower {
    public static void main(String args[])
    {
        int[][]lo=new int[][]{{1,1,1},{3,4,5},{8,9,1}};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                 if(i<j)
                 {
                    lo[i][j]=0;
                 }
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(lo[i][j]);
            }
        }
    }}

    

