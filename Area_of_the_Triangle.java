import java.util.Scanner;
class Add
{
    public static void main(String args[])
    {
        int a,b,c;
        double s,p,area;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        p=a+b+c;
        s=p/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",area);
        sc.close();
    }
}