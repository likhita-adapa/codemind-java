import java.util.Scanner;
class Odd
{
    public static void main(String args[])
    {
        int y=0,c=0,d=0;
        int a[]=new int[20];
        int b[]=new int[20];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        int A=sc.nextInt();
        int B=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=A &&arr[i]<=B)
            {
                y=1;
                a[c]=arr[i];
                c++;
            }
        }
        if(y==0)
        {
            System.out.print("-1");
            
        }
        else
        {
            int max=a[0];
            for(int i=0;i<c;i++)
            {
                if(a[i]<=max)
                {
                    max=a[i];
                }
            }
            System.out.print(max);
        }
    }
}