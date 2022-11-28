import java.util.*;
class prog
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k,t;
        t=sc.nextInt();
        for(k=0;k<t;k++)
        {
            int a,i,j;
            a=sc.nextInt();
            int[] arr=new int[a];
            for(i=0;i<a;i++)
            {
                arr[i]=sc.nextInt();
                
            }
            int x=0,s=0,c=0;
            for(i=0;i<a;i++)
            {
                for(j=i+1;j<a;j++)
                {
                    if(arr[i]>arr[j])
                    {
                        x=arr[i];
                        arr[i]=arr[j];
                        arr[j]=x;
                        c++;
                        
                    }
                }
            }
            if(c==0)
            {
                System.out.println("0");
                
            }
            else
            {
                s=arr[a-1]-arr[0];
                System.out.println(s);
            }
        }
    }
}