import java.util.Scanner;
class Divisors
{
    static boolean isprime(int n)
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
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int countt=0;
         for(int i=2;i*i<=n;i++)
         {
             if(isprime(i) && (i*i)<=n)
             {
                 countt++;
             }
         }
         System.out.print(countt);
     }
}