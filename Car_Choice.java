import java.util.Scanner;
class codechef
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            double e =(double)y1/x1;
            double f =(double)y2/x2;
            if(e<f)
            {
                System.out.println(-1);
            }
            else if(e==f)
            {
                System.out.println(0);
            }
            else
            {
                System.out.println(1);
            }
            t--;
        }
    }
}