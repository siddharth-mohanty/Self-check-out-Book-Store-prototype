import java.io.*;
public class SELFHELP extends BIO
{
    public static int[] displaySELFHELP()throws IOException
    {
        int c=0;

        String SELFHELP[]= {"Practising Spiritual Intelligence : For Innovation, Leadership and Happiness (Paperback)", "Don't Slap Your Wife But don't Get Slapped Either (Paperback) by Sunil Vaid", "The Now Effect : How a Mindful Moment can Change The Rest of Your Life (Paperback) by Elisha Goldstien", "The Secret (Hardcover)", "The 7 Habits Of Highly Effective People (Paperback) by Stephen R. Covey", "Combo of The Power of Your Subconscious Mind (Paperback)","Beating the Blues: A Complete Guide to Overcoming Depression (Paperback)","Management Mantras: Keys to Effective Management and Leadership (Paperback)","The 7 Minute Solution: Time Strategies to Prioritize, Organize and Simplify Your Life at Work and at Home (Paperback)","The Golden Collection Box Set (Paperback)","Speak Up, Speak Out : My Favourite Elocution Pieces and How to Deliver Them (Paperback)","Exclusive Stephen R. Covey (Set of 3 Books) (Paperback)","The Monk Who Sold His Ferrari (Paperback)","And the Lion Smiled At the Rabbit : Manage Emotions to Win (Paperback)","Why So Stupid (Paperback)","Who Will Cry When You Die? (Paperback)","The Power of Your Subconscious Mind (Paperback)","Don't Feel Stupid At 60 (Paperback)","Golden Cloud, Silver Lining: Lessons from the Masters on Happiness & Longevity (Paperback)","The Great Thoughts on Self-Improvement, Relaxation, Friendship, Happiness, Success, Marriage and Life (Paperback)","The Robin Sharma Pack (Set Of 10 Volumes) (Paperback)","Meditation (Paperback)","Wishes Fulfilled: Mastering The Art Of Manifesting (Paperback)","Seven Spiritual Laws of Success: A Pocket Guide to Fulfilling Your Dreams (Hardcover)","Seed of Genius: Nurture Your Natural Multiple Intelligences (Paperback) by Ankur Gupta","An Idiot, Placements And IntervYou (Paperback) by Toffee","Rajini's Punchtantra: Business and Life Management the Rajinikanth Way (Paperback) by P.C. Balasubramanian, Raja Krishnamoorthy","How to Be Brilliant: Change your ways in 90 days! 3rd Edition (Paperback) byMichael Heppell","Life is Fundamentally Management (Paperback) by A. Senthivel, Govind Babu","Body Language In The Work Place (Paperback) by Allan, Barbara Pease","How To Win Friends And Influence People (Paperback) by Dale Carnegie","The Definitive Book of Body Language (Paperback) by Allan, Barbara Pease","How Will You Measure Your Life? (Paperback)"};
        int SELFHELPP[]={250, 2200, 2350, 400, 565, 250, 2200, 2350, 400, 565,250, 2200, 2350, 400, 565,250, 2200, 2350, 400, 565,250, 2200, 2350,234,  400, 565,250, 2200, 2350, 400, 565, 232, 232};
        int SELFHELPSI[]=new int[SELFHELP.length];

       
        for(int i=0;i<SELFHELP.length;i++)
        {
            int p=SELFHELP[i].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10)
                System.out.println("(0"+c+")"+SELFHELP[i]+h+"Rs."+SELFHELPP[i]);

            else
                System.out.println("("+c+")"+SELFHELP[i]+h+"Rs."+SELFHELPP[i]);
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

                for(int i=ar;i<SELFHELPSI.length;i++)
                    SELFHELPSI[ar]=-1;

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

                if(Integer.parseInt(s)>SELFHELP.length || Integer.parseInt(s)<=0 )
                {

                    System.out.println("Sorry! No Books Available");
                }
                
                IF1:
                if(Integer.parseInt(s)<=SELFHELP.length && Integer.parseInt(s)!=0)
                {
                    int n=Integer.parseInt(s);
                    
                    LOOP3:
                    for(int i=0;i<SELFHELPSI.length;i++)
                    {
                        if(SELFHELPSI[i]==n)
                        {
                            System.out.println("You Have already purchased this book");
                            break IF1;
                        }
                    }
                    
                    
                    
                    SELFHELPSI[ar]=n;
                    
                    
                    
                    String h=SPACEDOT.space(SELFHELP[n-1].length());
                    System.out.println("("+s+")"+SELFHELP[n-1]+h+"Rs."+SELFHELPP[n-1]);

                    SELFHELPSI[ar]=n;

                    ar++;

                }
            }

    

        }
        return SELFHELPSI;

    }


    
}

