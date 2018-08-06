import java.util.Scanner;
class Palindrome
{
    public static void main(String arg[])
    {
        int get_no,sum=0,no=0;
        Scanner s=new Scanner(System.in);
        get_no=s.nextInt();
        int y=get_no;
        while(get_no>0)
        {
            no=get_no%10;
            sum=sum*10+no;
            get_no=get_no/10;
        }
        System.out.println(sum);
        if(sum==y)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
