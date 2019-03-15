import java.io.*;
public class ANAGRAM
{
    public static int areAnagrams(String pt, String po)throws IOException
    {
        int flag=0;
        po=po.trim();
        po=po.toLowerCase();
        pt=pt.trim();
        pt=pt.toLowerCase();

        char arr[]=pt.toCharArray();
        char brr[]=po.toCharArray();

        char t;
        if(arr.length==brr.length)
        {
            int c=0;
            char crr[]=new char[arr.length];
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr.length;j++)
                {
                    if(arr[i]==brr[j] && brr[j]!='\0')
                    {
                        c=c+1;
                        brr[j]='\0';
                    }
                }
            }
            if(c==arr.length)
                flag=1;

       
       
       
        }
        return flag;
    }
}