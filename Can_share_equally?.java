import java.util.Scanner;
class Equal
{
    public static void main(String args[])
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        if (x==0 && y%2==0)
        {
            System.out.println("YES");
        }
        else if(x==0 &&y%2!=0)
        {
            System.out.println("NO");
        }
        else if((x+2*y)%2==0)
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