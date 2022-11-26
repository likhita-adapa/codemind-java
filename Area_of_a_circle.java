import java.util.Scanner;
class Add
{
    public static void main(String args[])
    {
        int a;
        double c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        c=3.14*a*a;
        System.out.format("%.2f",c);
        sc.close();
    }
}