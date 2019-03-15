import java.io.*;
public class BIO extends BESTSELLERS 
{
    public static int[] displayBIO()throws IOException
    {
        int c=0;

        String BIO[]= {"Dongri To Dubai: Six Decades of The Mumbai Mafia (Paperback) by S Hussain Zaidi", "Steve Jobs: The Exclusive Biography (Hardcover) by Walter Isaacson", "Wings of Fire: An Autobiography 1st Edition (Paperback) by APJ Abdul Kalam, Arun Tiwari", "The Race of My Life : An Autobiography (Paperback)", "My Encounter with IIT JEE: The Story of Preparation (Paperback) by Arpit Agrawal", "The Freethinker's Prayer Book (Hardcover) by Khushwant Singh","Playing to Win (Paperback) by Saina Nehwal","Combo of Indira: The Life Of Indira Nehru Gandhi (Paperback)","My World in Cricket (Hardcover) by Stuart Broad","14 Hours: An Insider's Account of the 26/11 Taj Attack (Paperback) by Ankur Chawla","Impatient Optimist: Bill Gates in his Own Words (Paperback)","Conversations with Mani Ratnam (Hardcover) by Baradwaj Rangan","Total Recall: My Unbelievably True Life Story (Paperback) by Arnold Schwarzenegger","Neerh Ka Nirman Phir (Hindi) Rajpal & Sons Edition (Hardcover) by Harivansh Rai Bachchan","Mohammed Rafi (Paperback) by Yasmin Khalid Rafi","The Last Lecture (Paperback) by Randy Pausch","The Test of My Life from Cricket to Cancer and Back (Hardcover) by Yuvraj Singh,Sharda Ugra, Nishant Jeet Arora","Rahul Dravid: Timeless Steel (Hardcover) by ESPN Cricinfo","Mein Kampf (Paperback) by Adolf Hitler","A complete biography of Abraham Lincoln (Paperback)","Why I Failed: Lessons from Leaders (Paperback) by Shweta Punj","Autobiography Of A Yogi (Paperback) by Sri Sri Paramahansa Yogananda","Before Memory Fades: An Autobiography (Paperback) by Fali S. Nariman","M. K. Gandhi - An Autobiography Or The Story Of My Experiments With Truth (Paperback) by M K Gandhi","The Man Who Knew Infinity [Srinivasa Ramanujan] (Paperback) by KANIGEL ROBERT","Open : an Autobiography (Paperback)",};
        int BIOP[]={250, 2200, 2350, 400, 565, 2200, 2350, 400, 565, 2200, 2350, 400, 565, 2200, 2350, 400, 565, 2200, 2350, 400, 565, 2200, 2350, 400, 565, 340};//, 2100, 260, 200, 211, 245, 345, 234, 243, 213, 345, 213, 333, 321, 435, 654, 121, 324, 412, 222, 232, 212, 242, 213, 233, 124, 211, 233, 243, 323, 129, 199, 176, 287, 234, 298, 342, 231, 213, 143, 123, 154, 123, 198, 156, 78, 323, 235, 212, 321, 324, 125, 345, 323, 333, 222, 122, 323};

        int BIOSI[]=new int[BIO.length];

       
        for(int i=0;i<BIO.length;i++)
        {
            int p=BIO[i].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10)
                System.out.println("(0"+c+")"+BIO[i]+h+"Rs."+BIOP[i]);

            else
                System.out.println("("+c+")"+BIO[i]+h+"Rs."+BIOP[i]);
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

                for(int i=ar;i<BIOSI.length;i++)
                    BIOSI[ar]=-1;

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

                if(Integer.parseInt(s)>BIO.length || Integer.parseInt(s)<=0 )
                {

                    System.out.println("Sorry! No Books Available");
                }
                
                IF1:
                if(Integer.parseInt(s)<=BIO.length && Integer.parseInt(s)!=0)
                {
                    int n=Integer.parseInt(s);
                    
                    LOOP3:
                    for(int i=0;i<BIOSI.length;i++)
                    {
                        if(BIOSI[i]==n)
                        {
                            System.out.println("You Have already purchased this book");
                            break IF1;
                        }
                    }
                    
                    
                    
                    BIOSI[ar]=n;
                    
                    
                    
                    String h=SPACEDOT.space(BIO[n-1].length());
                    System.out.println("("+s+")"+BIO[n-1]+h+"Rs."+BIOP[n-1]);

                    BIOSI[ar]=n;

                    ar++;

                }
            }

    

        }
        return BIOSI;

    }



 

    
    
    
    
    
    
    

}
