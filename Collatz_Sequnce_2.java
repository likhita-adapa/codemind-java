import java.util.Scanner;
public class main
{
    public static int fun(int n)
    {
        int c=0;
        while(n!=1) 
        {
            if(n%2==0)
            {
                n/=2;
            } 
            else
            {
                n=(3*n)+1;
            }
            c++;
        }
        return c;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = -1;
        int n = -1;
        for (int i=a;i<=b;i++)
        {
            int c=fun(i);
            if (c>m)
            {
                m=c;
                n=i;
            }
        }
        System.out.println(n);
    }
}