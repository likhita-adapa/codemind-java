import java.util.Scanner;
import java.lang.Math;
class palindrome
{
    public static void main(String args[])
    {
        int n,count=0,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%k==0)
            {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}