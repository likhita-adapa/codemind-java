import java.util.Scanner;
import java.lang.Math;
class Prime
{
    static boolean palindrome(int x)
    {
        if (x<1 && x>25000)
        {
            return false;
        }
        int k=x;
        int sum=0;
        while(k!=0)
        {
            int r=k%10;
            sum=sum*10+r;
            k=k/10;
        }
        if(sum==x)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public static void main(String args[])
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(palindrome(n))
        {
            System.out.println("2");
        }
        else
        {
            System.out.println("1");
        }
        sc.close();
    }
}
