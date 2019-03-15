import java.io.*;
public class POPSCI extends MAG
{
    public static int[] displayPOPSCI()throws IOException
    {
        int c=0;

        String POPSCI[]={"A Brief History of Time-:Stephen Hawking", "A Briefer history of time-: Stephen Hawking", "The Scientific Indian-:Dr. APJ Abdul Kalam", "The Chariots of the Gods-: Erich Von DaniKen", "Nature of Space and Time-: Hawking and Penrose", "Life and origin of Universe-: Bhaktivedanta Swami", "God Created The Integers-: Stephen Hawking", "A Short History of Nearly Everything (Paperback)", "A Short History of Nearly Everything (Paperback)  ","The Selfish Gene (Paperback)  by Richard Dawkins","The Immortal Life of Henrietta Lacks (Hardcover) ","The Elegant Universe: Superstrings, Hidden Dimensions, and the Quest for the Ultimate Theory (Paperback)","The Origin of Species (Hardcover) ","Cosmos (Paperback) by Carl Sagan ","The Demon-Haunted World: Science as a Candle in the Dark ","The Greatest Show on Earth: The Evidence for Evolution by Richard Dawkins ","The God Delusion (Hardcover) by Richard Dawkins","Guns, Germs, and Steel: The Fates of Human Societies (Paperback) by Jared Diamond ","Surely You're Joking, Mr. Feynman! (Paperback) ","The Grand Design (Hardcover) by Stephen Hawking","The Fabric of the Cosmos (Space, Time, and the Texture of Reality) ","The Disappearing Spoon: And Other True Tales of Madness, Love, and the History of the World from the Periodic Table of the Elements (Hardcover) ","Packing for Mars: The Curious Science of Life in the Void (Hardcover) ","The Ancestor's Tale: A Pilgrimage to the Dawn of Evolution ","Physics of the Impossible: A Scientific Exploration into the World of Phasers, Force Fields, Teleportation, and Time Travel (Hardcover) ","Chaos: The Making of a New Science (Paperback) ","Death by Black Hole: And Other Cosmic Quandaries (Hardcover) ","Gödel, Escher, Bach: An Eternal Golden Braid (Paperback) ","Pale Blue Dot: A Vision of the Human Future in Space ","The Hot Zone (Paperback) ","Spook: Science Tackles the Afterlife (Paperback) ","Genome: the Autobiography of a Species in 23 Chapters (Paperback) "}; 

        int POPSCIP[]={1099, 999, 657, 327, 564, 346, 674, 999, 657, 327, 564, 346, 999, 657, 327, 564, 346, 999, 657, 327, 564, 346, 999, 657, 327, 564, 346, 999, 657, 327, 564, 346};

       int POPSCISI[]=new int[POPSCI.length];

       
        for(int i=0;i<POPSCI.length;i++)
        {
            int p=POPSCI[i].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10)
                System.out.println("(0"+c+")"+POPSCI[i]+h+"Rs."+POPSCIP[i]);

            else
                System.out.println("("+c+")"+POPSCI[i]+h+"Rs."+POPSCIP[i]);
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

                for(int i=ar;i<POPSCISI.length;i++)
                    POPSCISI[ar]=-1;

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

                if(Integer.parseInt(s)>POPSCI.length || Integer.parseInt(s)<=0)
                {

                    System.out.println("Sorry! No Books Available");
                }
                
                IF1:
                if(Integer.parseInt(s)<=POPSCI.length && Integer.parseInt(s)!=0)
                {
                    int n=Integer.parseInt(s);
                    
                    LOOP3:
                    for(int i=0;i<POPSCISI.length;i++)
                    {
                        if(POPSCISI[i]==n)
                        {
                            System.out.println("You Have already purchased this book");
                            break IF1;
                        }
                    }
                    
                    
                    
                    POPSCISI[ar]=n;
                    
                    
                    
                    String h=SPACEDOT.space(POPSCI[n-1].length());
                    System.out.println("("+s+")"+POPSCI[n-1]+h+"Rs."+POPSCIP[n-1]);

                    POPSCISI[ar]=n;

                    ar++;

                }
            }

    

        }
        return POPSCISI;

    }
    
    
}