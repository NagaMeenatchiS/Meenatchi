import java.util.*;
class Armstrong_interval
{
    public static void main(String arg[])
    {
        int no,no1,rem=0,c=0,sum;
        Scanner s=new Scanner(System.in);
        no=s.nextInt();
        no1=s.nextInt();
        int temp;
        for(int i=no;i<=no1;i++)
        {
            temp=i;
            int m=i;sum=0;
            for(int y=0;m!=0;y++)
            {
               rem=m%10;
        sum=sum+(int)Math.pow(rem,3);
            m/=10;
                
            }
        if(temp==sum||i<=9)
            System.out.println(temp+"armstrong no");
            else
            System.out.println(temp+"not a Armstrong no");
        }
        
    }
}
