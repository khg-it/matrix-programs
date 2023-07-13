public class left {
    public static void main(String args[])
    {
        int num[]={1,2,3,4,5};
        int temp=num[0];
        int i;
        for(i=1;i<=4;i++)
        {
            num[i-1]=num[i];
        }
        num[4]=temp;
        for(i=0;i<5;i++)
        {
            System.out.print(num[i]+" ");
        }

    }
}
