import java.util.Scanner;
import java.lang.Math;
class primes
{
    static boolean prime(int x)
    {
        if (x<2)
        {
            return false;
            
        }
        for(int i=2;i<=Math.sqrt(x);i++)
        {
            if(x%i==0)
            {
                return false;
                
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int count=0;
        for(int i=n;i<=m;i++)
        {
            if(prime(i))
            {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}