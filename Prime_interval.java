import java.util.Scanner;
class Prime_interval
{
    public static void main(String arg[])
    {
        int a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        for (int i=a;i<=b;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
            
        }
      
    }
}


