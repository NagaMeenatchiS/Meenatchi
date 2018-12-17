import java.util.*;
class Median_arr
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n,temp=0,l;
        n=s.nextInt();
        int arr[]=new int[n];
        l=arr.length;
        for(int i=0;i<l;i++)
        {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        int em=l/2;
        int om=(l+1)/2;
        if(n%2==0)
        {
            System.out.print(arr[em-1]);
        }
        else
        {
            System.out.print(arr[om-1]);
        }
    }
}
