import java.io.*;
public class REF extends FOOD
{
    public static int[] displayREF()throws IOException
    {
        int c=0;

        String REF[]={"Oxford English Dictionary-ADVANCED", "Cambridge Syndicate Mathematical log book- Powell", "Oxford Dictionary of Physics", "Oxford Dictionary of Chemistry", "Table of Chemical valencies and periodicity of elements", "Units, Distances, Symbols- Standard Internaccional", "Standards for Mid-Range Trajectory and Projectile height locus", "India 2013 (Paperback) by Government of India (Ministry of Information Broadcasting)","Manorama Yearbook 2013 with Free Encylopaedia Britannica","Geography of India 4 Edition (Paperback) by Majid Husain","Key To High School English Grammar & Composition ","Advanced Learner's Dictionary 8 Edition (Paperback) by A S Hornby","Oxford School Atlas (With CD) (Paperback) by Oxford University Press","Oxford Student Atlas for India 2nd Edition (Paperback) by Oxford University Press","Oxford Advanced Learner's Dictionary 8th Edition (Hardcover) by Oxford University Press","Pocket Oxford English Dictionary 10th Edition (Hardcover) by Oxford Dictionary","The Book of Indian Birds 13th Edition (Hardcover) by Salim Ali","I, Steve: Steve Jobs in his own words (Paperback)","The Pearson Concise General Knowledge Manual 2013 (Paperback) by Edgar Thorpe","Oxford Hindi–English Dictionary (Hindi, English) 1st Edition (Paperback) by R. S. McGregor","Reactions, Rearrangements & Reagents, Sanyal (Paperback) by S. N. Sanyal","Yearbook 2013 (Paperback)","Current Affairs Annual Issue 2013 PB by Singh A P","Dictionary of Economics (Paperback)","Concise Medical Dictionary 8th Edition (Paperback) by Elizabeth A. Martin","Oxford Dictionary of Chemistry 6th Edition (Paperback) by John Daintith","The Oxford Dictionary of Philosophy 2nd Edition (Paperback) by Simon Blackburn","Oxford Dictionary Of Biomedicine (Paperback) by John Lackie","The Oxford Dictionary Of Literary Terms 3rd Edition (Paperback) by Chris Baldick","The Concise Oxford Dictionary of Mathematics 4th Edition (Paperback) byChristopher Clapham, James Nicholson","The Oxford Dictionary of Synonyms and Antonyms 2nd Edition (Paperback) byOxford Dictionary","Oxford Essential French Dictionary 1st Edition (Paperback) by Oxford Dictionary","Oxford Dictionary of Biology 6th Edition (Paperback)",};
        int REFP[]={345, 541, 234, 200, 400, 500, 345, 541, 234, 200, 400, 500, 345, 541, 234, 200, 400, 500, 345, 541, 234, 200, 400, 500, 345, 541, 234, 200, 400, 500, 345, 541, 234};

     
        int REFSI[]=new int[REF.length];

       
        for(int i=0;i<REF.length;i++)
        {
            int p=REF[i].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10)
                System.out.println("(0"+c+")"+REF[i]+h+"Rs."+REFP[i]);

            else
                System.out.println("("+c+")"+REF[i]+h+"Rs."+REFP[i]);
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

                for(int i=ar;i<REFSI.length;i++)
                    REFSI[ar]=-1;

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

                if(Integer.parseInt(s)>REF.length || Integer.parseInt(s)<=0)
                {

                    System.out.println("Sorry! No Books Available");
                }
                
                IF1:
                if(Integer.parseInt(s)<=REF.length && Integer.parseInt(s)!=0)
                {
                    int n=Integer.parseInt(s);
                    
                    LOOP3:
                    for(int i=0;i<REFSI.length;i++)
                    {
                        if(REFSI[i]==n)
                        {
                            System.out.println("You Have already purchased this book");
                            break IF1;
                        }
                    }
                    
                    
                    
                    REFSI[ar]=n;
                    
                    
                    
                    String h=SPACEDOT.space(REF[n-1].length());
                    System.out.println("("+s+")"+REF[n-1]+h+"Rs."+REFP[n-1]);

                    REFSI[ar]=n;

                    ar++;

                }
            }

    

        }
        return REFSI;

    }
    
    
}