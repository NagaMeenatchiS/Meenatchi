import java.util.*;
class Prime_gu
{
    public static void main(String arg[])
    {
        int num1,num2,count=0;
        Scanner s=new Scanner(System.in);
        num1=s.nextInt();
        num2=s.nextInt();
        for(int i=num1;i<=num2;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                 count=0;
                 break;
                }
                else
                {
                    count=1;
                }
            }
            if(count==1)
            System.out.print(i);
        }
        
    }
}
