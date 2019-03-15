import java.io.*;
import java.util.*;
public class NFICT extends POPSCI
{
    public static int[] displayNFICT()throws IOException
    {
        int c=0;

        String NFICT[]={"Discovery of India-: Pt. Jawaharlal Nehru", "Unbroken:WWII -:Laura Hillenbrand", "We Are Poor But So Many: The Story of Self-Employed Women in India-: Ela R. Bhatt ", "The Idea Of India-: Sunil Khilnani ", "ELEVEN RING-: Phil Jackson", "RUMSFELD'S RULES-: Donald Rumsfeld", "The Art of Choosing-:Sheena Iyengar", "The Diary of a Young Girl (Paperback) ", "Freakonomics: A Rogue Economist Explores the Hidden Side of Everything (Hardcover) by Steven D. Levitt (shelved 5107 times as non-fiction) ", "THE VARIETIES OF RELIGIOUS EXPERIENCE by William James", "THE AMERICAN LANGUAGE  by H. L. Mencken", "THE GENERAL THEORY OF EMPLOYMENT, INTEREST, AND MONEY  by John Maynard Keynes", "THE LIVES OF A CELL  by Lewis Thomas", "THE FRONTIER IN AMERICAN HISTORY  by Frederick Jackson Turner", "BLACK BOY  by Richard Wright", "ASPECTS OF THE NOVEL  by E. M. Forster", "THE PROPER STUDY OF MANKIND  by Isaiah Berlin", "THE NATURE AND DESTINY OF MAN  by Reinhold Niebuhr", "NOTES OF A NATIVE SON  by James Baldwin", "THE ELEMENTS OF STYLE  by William Strunk and E. B. White", "AN AMERICAN DILEMMA  by Gunnar Myrdal", "PRINCIPIA MATHEMATICA  by Alfred North Whitehead and Bertrand Russell", "THE MISMEASURE OF MAN  by Stephen Jay Gould", "THE MIRROR AND THE LAMP  by Meyer Howard Abrams", "THE ART OF THE SOLUBLE  by Peter B. Medawar", "THE ANTS  by Bert Hoelldobler and Edward O. Wilson", "A THEORY OF JUSTICE  by John Rawls", "ART AND ILLUSION  by Ernest H. Gombrich", "THE MAKING OF THE ENGLISH WORKING CLASS  by E. P. Thompson", "PHILOSOPHY AND CIVILIZATION  by John Dewey", ">THE AGE OF JACKSON , Arthur Schlesinger by Jr.", "THE MAKING OF THE ATOMIC BOMB  by Richard Rhodes", "BLACK LAMB AND GREY FALCON  by Rebecca West", "GOODBYE TO ALL THAT  by Robert Graves"};           
        int NFICTP[]={456, 345, 145, 543, 125, 998, 376, 232, 213, 250, 2200, 2350, 400, 565, 2100, 260, 200, 211, 245, 345, 234, 243, 213, 345, 213, 333, 321, 435, 654, 121, 324, 412, 222, 232, 212};
        int NFICTSI[]=new int[NFICT.length];

       
        for(int i=0;i<NFICT.length;i++)
        {
            int p=NFICT[i].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10)
                System.out.println("(0"+c+")"+NFICT[i]+h+"Rs."+NFICTP[i]);

            else
                System.out.println("("+c+")"+NFICT[i]+h+"Rs."+NFICTP[i]);
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

                for(int i=ar;i<NFICTSI.length;i++)
                    NFICTSI[ar]=-1;

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

                if(Integer.parseInt(s)>NFICT.length || Integer.parseInt(s)<=0)
                {

                    System.out.println("Sorry! No Books Available");
                }
                
                IF1:
                if(Integer.parseInt(s)<=NFICT.length &&  Integer.parseInt(s)!=0)
                {
                    int n=Integer.parseInt(s);
                    
                    LOOP3:
                    for(int i=0;i<NFICTSI.length;i++)
                    {
                        if(NFICTSI[i]==n)
                        {
                            System.out.println("You Have already purchased this book");
                            break IF1;
                        }
                    }
                    
                    
                    
                    NFICTSI[ar]=n;
                    
                    
                    
                    String h=SPACEDOT.space(NFICT[n-1].length());
                    System.out.println("("+s+")"+NFICT[n-1]+h+"Rs."+NFICTP[n-1]);

                    NFICTSI[ar]=n;

                    ar++;

                }
            }

    

        }
        return NFICTSI;

    }

}