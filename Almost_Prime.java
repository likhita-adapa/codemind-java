import java.util.Scanner;
class Pattern
{
    static boolean prime(int n)
    {
        if(n<2)
        {
            return false;
            
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int y=0;
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            y=0;
            for(int j=1;j<=n;j++)
            {
                if(prime(j))
                {
                    for(int k=1;k<=n;k++)
                    {
                        if(prime(k))
                        {
                            if(j*k==n && j!=k)
                            {
                                y=1;
                                System.out.println("YES");
                                break;
                            }
                        }
                    }
                }
                if(y==1)
                break;
            }
            if(y==0)
            System.out.println("NO");
        }
    }
}