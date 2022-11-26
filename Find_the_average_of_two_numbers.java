import java.util.Scanner;
class Add
{
    public static void main(String args[])
    {
        int a,b,d;
        float c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        d=a+b;
        c=(float)(d)/2;
        System.out.format("%.4f",c);
        sc.close();
    }
}