import java.util.Scanner;
class Prime
{
    public static void main(String arg[])
    {
        int get_no;
        Scanner s=new Scanner(System.in);
        get_no=s.nextInt();
        int flag=0;
        for (int i=2;i<=get_no/2;++i)
        {
            if(get_no%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not a prime");
        }
    }
}
