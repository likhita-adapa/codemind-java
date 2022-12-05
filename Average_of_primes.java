import java.util.Scanner;
class primes
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
        int n,count=0,sum=0;
        float avrg=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(prime(arr[i]))
            {
                sum=sum+arr[i];
                count++;
            }
        }
        avrg=(float)sum/count;
        System.out.format("%.2f",avrg);
        sc.close();
    }
}