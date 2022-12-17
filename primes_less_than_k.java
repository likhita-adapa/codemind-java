import java.util.Scanner;
import java.lang.Math;
class palindrome
{
    static boolean prime(int x)
    {
        if(x<2)
        {
            return false;
        }
        for(int i=2;i<x;i++)
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
        int n,count=0,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=k)
            {
                if(prime(arr[i]))
                {
                    count++;
                }
            }
            
        }
        System.out.println(count);
        sc.close();
    }
}