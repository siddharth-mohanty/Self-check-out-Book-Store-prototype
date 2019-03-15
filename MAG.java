import java.io.*;
public class MAG extends REF
{
    public static int[] displayMAG()throws IOException
    {
        int c=0;
        String MAG[]={"Nat Geo Chunks (Global Monthly)-: NATIONAL GEOGRAPHIC CHANNEL", "POPSCI future of-:POPSCI(Monthly)", "Scholastic Yearbook 2013(Yearly)", "INFOPEDIA(Monthly)-ALL for Info & Tech", "MTG PCMB (monthly) for JEE", "CARS-: The ULTIMAT-um", "BSE-:Business BRUNCH", "Open  Current Affairs and Features Weekly","Tehelka  News  Weekly","Industry 2.0  Manufacturing Technology Updates and News  Monthly","CTO Forum  -  Monthly","Yo Vizag Lifestyle Monthly DSA Media","Puthiya Thalaimurai - A Weekly Tamil Magazine","Shair Urdu Magazine","Desh magazine","Rythubandhu","Sportstar","Outlook","India Today","Femina (India)","PCQuest","Dataquest - Fortnightly Information Technology","Sanctuary Asia","Himal","The Business Enterprise  Business  Monthly","The Week","Frontline","Electronics For You  Technology  Monthly","Elle Decor Magazine","India Today Travel Plus Magazine","Outlook Business And Careers 360 (Combo) Magazine","BBC Knowledge Magazine"};
        int MAGP[]={1399, 799, 699, 899, 1099, 499, 877, 799, 699, 899, 1099, 499, 799, 699, 899, 1099, 499, 799, 699, 899, 1099, 499, 799, 699, 899, 1099, 499, 799, 699, 899, 1099, 499};

      int MAGSI[]=new int[MAG.length];

       
        for(int i=0;i<MAG.length;i++)
        {
            int p=MAG[i].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10)
                System.out.println("(0"+c+")"+MAG[i]+h+"Rs."+MAGP[i]);

            else
                System.out.println("("+c+")"+MAG[i]+h+"Rs."+MAGP[i]);
        }

        int ar=0;
        while(true)
        {
            String s=TAKE.take();
            s=s.trim();
            
            if(s.equals(""))
            s=900+"";
            
            
            if(ANAGRAM.areAnagrams("done", s)==1)
            {

                for(int i=ar;i<MAGSI.length;i++)
                    MAGSI[ar]=-1;

                break;

            }

            for(int p=0;p<s.length();p++)
            {
                char ch=s.charAt(p);
                if(Character.isLetter(ch)==true || Character.isLetterOrDigit(ch)==false)
                {
                    ch='\0';
                }

            }

           
            {

                if(Integer.parseInt(s)>MAG.length || Integer.parseInt(s)<=0)
                {

                    System.out.println("Sorry! No Books Available");
                }
                
                IF1:
                if(Integer.parseInt(s)<=MAG.length && Integer.parseInt(s)!=0)
                {
                    int n=Integer.parseInt(s);
                    
                    LOOP3:
                    for(int i=0;i<MAGSI.length;i++)
                    {
                        if(MAGSI[i]==n)
                        {
                            System.out.println("You Have already purchased this book");
                            break IF1;
                        }
                    }
                    
                    
                    
                    MAGSI[ar]=n;
                    
                    
                    
                    String h=SPACEDOT.space(MAG[n-1].length());
                    System.out.println("("+s+")"+MAG[n-1]+h+"Rs."+MAGP[n-1]);

                    MAGSI[ar]=n;

                    ar++;

                }
            }

    

        }
        return MAGSI;

    }

}