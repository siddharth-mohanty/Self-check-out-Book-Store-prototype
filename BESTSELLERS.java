import java.io.*;
public class BESTSELLERS extends SEARCHES
{
    public static int[] displayBESTSELLERS()throws IOException
    {
        int c=0;

        String BESTSELLERS[]= { "A tale of 2 cities by Charles Dickens","The Lord of Rings by J.R.R Tolkein","Le Petit Prince (The Little Prince) by Antoine de Saint-Exupéry","The Hobbit by J. R. R. Tolkien","And Then There Were None by Agatha Cristie","The Lion, the Witch and the Wardrobe by C. S. Lewis","She: A History of Adventure by H. Rider Haggard","The Da Vinci Code by Dan Brown","Think and Grow Rich by Napoleon Hill","The Catcher in the Rye by J. D. Salinger"};
        int BESTSELLERSP[]={250, 2200, 2350, 400, 565, 250, 2200, 2350, 400, 565};
        
        int BESTSELLERSSI[]=new int[BESTSELLERS.length];

       
        for(int i=0;i<BESTSELLERS.length;i++)
        {
            int p=BESTSELLERS[i].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10)
                System.out.println("(0"+c+")"+BESTSELLERS[i]+h+"Rs."+BESTSELLERSP[i]);

            else
                System.out.println("("+c+")"+BESTSELLERS[i]+h+"Rs."+BESTSELLERSP[i]);
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

                for(int i=ar;i<BESTSELLERSSI.length;i++)
                    BESTSELLERSSI[ar]=-1;

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

                if(Integer.parseInt(s)>BESTSELLERS.length || Integer.parseInt(s)<=0 )
                {

                    System.out.println("Sorry! No Books Available");
                }
                
                IF1:
                if(Integer.parseInt(s)<=BESTSELLERS.length && Integer.parseInt(s)!=0)
                {
                    int n=Integer.parseInt(s);
                    
                    LOOP3:
                    for(int i=0;i<BESTSELLERSSI.length;i++)
                    {
                        if(BESTSELLERSSI[i]==n)
                        {
                            System.out.println("You Have already purchased this book");
                            break IF1;
                        }
                    }
                    
                    
                    
                    BESTSELLERSSI[ar]=n;
                    
                    
                    
                    String h=SPACEDOT.space(BESTSELLERS[n-1].length());
                    System.out.println("("+s+")"+BESTSELLERS[n-1]+h+"Rs."+BESTSELLERSP[n-1]);

                    BESTSELLERSSI[ar]=n;

                    ar++;

                }
            }

    

        }
        return BESTSELLERSSI;

    }



 

    
  
    
    

}
