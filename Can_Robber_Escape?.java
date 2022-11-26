import java.util.Scanner;
class Average
{
    public static void main(String args[])
    {
        int n,i,odd=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                odd+=1;
            }
        }
        if(odd<=2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        sc.close();
    }
}