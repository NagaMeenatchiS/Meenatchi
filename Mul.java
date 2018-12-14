import java.util.*;
class Mul
{
    public static void main(String arg[])
    {
        int no,mul=1;
        Scanner s=new Scanner(System.in);
        no=s.nextInt();
        for(int i=1;i<=no;i++)
        {
            mul=no*i;
            System.out.println(mul);
        }
    }
}
