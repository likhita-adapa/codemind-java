import java.util.Scanner;
class Common
{
    public static void main(String args[])
    {
        int c=0,count=0;
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[] a=new int[m];
        for(int i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }
        int[] b=new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==b[j])
                {
                    c++;
                    b[j]=-1;
                }
            }
            if(c!=0)
            {
                count++;
            }
        }
        System.out.print(count);
    }
}