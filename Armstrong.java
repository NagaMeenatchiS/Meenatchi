import java.util.*;
class Armstrong
{
    public static void main(String arg[])
    {
        int no,rem=0,c=0,sum=0;
        Scanner s=new Scanner(System.in);
        no=s.nextInt();
        int temp=no;
        while(no>0)
        {
               rem=no%10;
            c++;
        sum=sum+(int)Math.pow(rem,3);
            no/=10;
        //System.out.print(sum);
        }
        if(temp==sum||no<9)
            System.out.print(temp+"armstrong no");
            else
            System.out.print("not a Armstrong no");
        
    }
}
