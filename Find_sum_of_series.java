import java.util.Scanner;
class pretty
{
    public static void main(String args[])
    {
        int t,i;
        float sum=0;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(i=1;i<=t;i++)
        {
            sum+=1.0/i;
            
        }
        System.out.format("%.2f",sum);
        sc.close();
    }
}