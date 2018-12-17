import java.util.*;
class String_number
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner (System.in);
        String get_str;
        int co=0;
        get_str=s.nextLine();
        for(int i=0;i<get_str.length()-1;i++)
        {
            char c =get_str.charAt(i);
            if(c>='0'&&c<='9')
            {
                      
                co++;
            }
        }
        int l=get_str.length()-1;
        if(co==l)
        System.out.print("yes");
        else
        System.out.print("no");
        
    }
}
