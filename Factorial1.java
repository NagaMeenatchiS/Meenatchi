import java.util.*;
class Factorial1
{
    public static void main(String arg[])
    {
        int no,fact=1;
        Scanner s=new Scanner(System.in);
        no=s.nextInt();
        if(no==1)
        System.out.print(" 1 is the factorial");
        else
        {
        for(int i=1;i<=no;i++)
        {
            fact=fact*i;
        }
        System.out.print(  fact +"is the factorial");
        }
    }
}
