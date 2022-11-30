import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String words[]=s.split(" ");
        System.out.print(words.length);
        
    }
}