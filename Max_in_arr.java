import java.util.*;
class Max_in_arr
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n,max=0;
        n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.print(max);
    }
}
