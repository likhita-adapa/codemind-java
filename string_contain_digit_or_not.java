import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                c++;
            }
        }
        if(c>0)
        {
            System.out.println("Contains"+" "+c+" "+"digit");
        }
        else
        {
            System.out.println("Doesn't contain digit");
        }
    }
}