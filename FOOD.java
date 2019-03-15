import java.io.*;
public class FOOD extends SELFHELP
{
    public static int[] displayFOOD()throws IOException
    {
        int c=0;

        String FOOD[]= { "Oh Calcutta: Cookbook (Paperback) by Anjan Chatterjee", "Highway On My Plate: The Indian Guide To Roadside Eating (Paperback) by Rocky Singh, Mayur Sharma", "Chicken Recipes (Paperback) by Sanjeev Kapoor", "Cooking With Love: Vegetarian Recipes From My Mother's Kitchen (Hardcover) by Sanjeev Kapoor", "The Mainland China Cookbook (Paperback) by Anjan Chatterjee", "Tea 1st Edition (Hardcover)","Modernist Cuisine: The Art and Science of Cooking (Boxed Set) by Nathan Myhrvold,Chris Young, Maxime Bilet","The Oxford Encyclopedia of Food and Drink in America: 3-Volume Set (Hardcover) by Bruce Kraig","Simple Home Baking (Paperback) by Sanjeev Kapoor","Cakes And Bakes (Paperback) by Sanjeev Kapoor","Nm Breakfast Recipes -Vegetarian (Paperback) by Nita Mehta","Rice,Biryani and Pulao (NON-VEG) (Paperback) by Sanjeev Kapoor","How the Banana Goes to Heaven (Paperback) by Ratna Rajaiah","Eggless Desserts (Paperback) by Nita Mehta","Essential Kerala Cookbook (Paperback)","101 KERALADELICACIES (Paperback)by G. Padma Vijay","Khanna Khazana Bhartiya Vyanjanon Ka Utsav (Hindi) (Hardcover) by Sanjeev Kapoor","How to Be a Domestic Goddess : Baking and the Art of Comfort Cooking (Paperback) by Nigella Lawson","100 Favourite Hand Picked Recipes (Paperback) by Sanjeev Kapoor","Vegetarian Rice, Biryani and Pulao (Paperback) by Sanjeev Kapoor","Rasachandrika: Saraswat Cookery Book (Paperback) by S. MahilaSamaj","Bengali Cuisine: India on My Plate (Paperback) by Aditi Das","Modern Cookery for Teaching and the Trade (Volume - 2) 6th Edition (Paperback) by Thangam E. Philip","My Great India Cookbook (Hardcover) by Vikas Khanna","Tikkas & Kebabs (Chefs Special) (Paperback) by MASTER CHEFS OF INDIA"};
        int FOODP[]={212, 242, 213, 233, 124, 211, 233, 243, 323, 129, 199, 176, 287, 234, 298, 342, 231, 213, 143, 123, 154, 123, 198, 156, 78, 323, 235, 212, 321, 324, 125, 345, 323, 333, 222, 122, 323};

        int FOODSI[]=new int[FOOD.length];

       
        for(int i=0;i<FOOD.length;i++)
        {
            int p=FOOD[i].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10)
                System.out.println("(0"+c+")"+FOOD[i]+h+"Rs."+FOODP[i]);

            else
                System.out.println("("+c+")"+FOOD[i]+h+"Rs."+FOODP[i]);
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

                for(int i=ar;i<FOODSI.length;i++)
                    FOODSI[ar]=-1;

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

                if(Integer.parseInt(s)>FOOD.length || Integer.parseInt(s)<=0 )
                {

                    System.out.println("Sorry! No Books Available");
                }
                
                IF1:
                if(Integer.parseInt(s)<=FOOD.length && Integer.parseInt(s)!=0)
                {
                    int n=Integer.parseInt(s);
                    
                    LOOP3:
                    for(int i=0;i<FOODSI.length;i++)
                    {
                        if(FOODSI[i]==n)
                        {
                            System.out.println("You Have already purchased this book");
                            break IF1;
                        }
                    }
                    
                    
                    
                    FOODSI[ar]=n;
                    
                    
                    
                    String h=SPACEDOT.space(FOOD[n-1].length());
                    System.out.println("("+s+")"+FOOD[n-1]+h+"Rs."+FOODP[n-1]);

                    FOODSI[ar]=n;

                    ar++;

                }
            }

    

        }
        return FOODSI;

    }





}