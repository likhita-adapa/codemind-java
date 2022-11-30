import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                sum=sum+(ch-'0');
            }
        }
        System.out.println(sum);
    }
}