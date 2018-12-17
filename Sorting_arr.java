import java.util.*;
class Sorting_arr
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n,temp=0;
        n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            }
        }
        for(int j=0;j<arr.length;j++)
        System.out.println(arr[j]);
    }
}
