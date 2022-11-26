import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {
        int n,t,s,b;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        n=t*s*b*512*2;
        System.out.println(n);
       
    }
}