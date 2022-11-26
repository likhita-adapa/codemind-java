import java.util.Scanner;
class Add
{
    public static void main(String args[])
    {
        int a,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        c=(a*(a-1)/2);
        
        System.out.println(c);
        sc.close();
    }
}