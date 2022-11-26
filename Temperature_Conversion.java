import java.util.Scanner;
class Add
{
    public static void main(String args[])
    {
        int c;
        float f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        f=(float)(32+(c*1.8));
        System.out.format("%.2f",f);
        sc.close();
    }
}