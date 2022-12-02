import java.util.Scanner;
class Wave
{
    public static void main(String args[])
    {
        int y=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                y=1;
                break;
            }
        }
        if(y==0)
        {
            
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}