public class SEARCHER extends TAKE
{

    public static int Search(String d, String ar)
    {
        String temp=""; int flag=0; int i;
        d=d.trim();
        

      
        for(int j=0; j<ar.length();j++)
        {
             if(Character.isDigit(ar.charAt(j)))
               ar=ar.replace(ar.charAt(j), '\0');

                
           if(ar.charAt(j)!=' ')
                 temp=temp+ar.charAt(j);
        temp=temp.trim();

            if(temp.equalsIgnoreCase(d))
            {
                flag=1;

            }

            if(ar.charAt(j)==' ')
                temp="";
        }

        
        for(int j=0; j<d.length()-1;j++)
        {
            for(int k=j+1;k<d.length();k++)
            {
                temp=ar.substring((j+1), k);
                if(temp.equals(d))
                {
                    flag=1; 

                }
            }
        }
        
      
        
        

        return flag;
    }
}
