public class SPACEDOT extends SEARCHER
{
    public static String space(int d)
    {
        String s="";
        for(int i=0;i<=140-d;i++)

            s=s+".";

        return(s);
    }
    
    public static String space(int k,int d)
    {
        String s="";
        for(int i=0;i<=k-d;i++)

            s=s+".";

        return(s);
    }
    
    
    
    public static String largespace(int d)
    {
        String s="";
        for(int i=0;i<=170-d;i++)

            s=s+".";

        return(s);
    }
    
    public static String midspace(int d)
    {
        String s="";
        for(int i=0;i<=155-d;i++)

            s=s+".";

        return(s);
    }
    
    public static String smallspace(int d)
    {
        String s="";
        for(int i=0;i<=12-d;i++)

            s=s+".";

        return(s);
    }
    
}

