import java.util.*;
class Min_int_arr
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n,min=9;
        n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.print(min);
    }
}

