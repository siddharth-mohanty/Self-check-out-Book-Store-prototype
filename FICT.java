import java.io.*;
public class FICT extends NFICT
{

    public static int[] displayFICT()throws IOException
    {
        int c=0;

        String FICT[]={"The three mistakes of my life-: Chetan Bhagat", "Five Points Someone-: What not to do at IIT-:Chetan Bhagat", "Oath of Vayuputras-: Amish Tripathi", "Nagas of Meluha-:Amish Tripathi", "Rich Dad, Poor Dad :-Robert T Kiyoski", "Chicken Soup :-Jack Canfield(Full volumnar edition)", "The Alchemist-: Paul Coelho", "Inferno (Hardcover) :- Dan Brown", "Come on Inner Peace! : I Don't Have All Day! (Paperback) :- Sachin Garg", "The Great Gats:- Film tie-in Edition (Paperback) :- F. Scott Fitzgerald", "The Oath of the Vayuputras: Shiva Trilogy 3 (Paperback) :- Amish Tripathi", "Best Kept Secret (Paperback) :- Jeffrey Archer", "The Hit (Paperback)", "A Memory of Light (Paperback) :- Robert Jordan, Brandon Sanderson", "Combo of River of Smoke 1st Edition (Paperback)", "Narcopolis (Hardcover) :- Jeet Thayil", "The Jeffrey Archer Collection (Set of 3 Books) (Paperback) :- Jeffrey Archer", "Fifty Shades Trilogy (Set of 3 Books) 1st Edition (Paperback)", "The Hobbit (Set of 2 Books) (Paperback) :- J. R. R. Tolkien", "And the Mountains Echoed (Paperback) :- Khaled Hosseini", "The Lord of the Rings (Set of 3 Books) Film tie-in International ed Edition (Paperback) :- J. R. R. Tolkien", "The Casual Vacancy 1st Edition (Hardcover) :- J. K. Rowling", "The Dark Tower: The Wind Through The Keyhole (Paperback) :- Stephen King", "Combo of The Immortals of Meluha (Paperback)", "The Blind Man's Garden (Hardcover) :- Nadeem Aslam", "The Racketeer (Paperback) :- John Grisham", "Life of Pi Signed illustrated ed Edition (Hardcover) :- Yann Martel", "21 New Beginnings: True Stories of Oddity, Hope & Change (Hardcover) :- Viveik Pandit", "The Skinning Tree (Hardcover) :- Srikumar Sen", "The War Ministry (Paperback) :- Krishan Partap Singh", "Midnight's Children (Paperback) :- Salman Rushdie", "The Last Man Export ed Edition (Paperback) :- Vince Flynn", "The Dalai Lama's Cat: A Novel 1st Edition (Paperback) :- David Michie", "Bring Up the Bodies (Paperback)", "The Complete Sherlock Holmes: All 4 Novels and 56 Short Stories (Set of 2 Volumes) Deluxe Edition (Paperback) :- Arthur Conan Doyle", "Revenge Wears Prada: The Devil Returns (Paperback) :- Lauren Weisberger", "Ifs, Buts Going Nuts (Paperback) :- Sonitha J Kapoor", "To Kill a Mockingbird 50th Anniversary Edition (Paperback)", "Train to Pakistan 01 Edition (Paperback)", "Animal Farm: A Fairy Story 1st Edition (Paperback) :- George Orwell",  "Malgudi Schooldays (Paperback) :- R. K. Narayan", "If Tomorrow Comes (Reissue) Edition (Paperback) :- Sidney Sheldon", "100 Selected Stories New ed Edition (Paperback) :- O. Henry", "100 Selected Stories New ed Edition (Paperback) :- O. Henry", "Things Fall Apart 1 Edition (Paperback)-:Chinua Achebe", "Death on the Nile 01 Edition (Paperback)", "The Bell Jar (Paperback) :- Sylvia Plath", "The Guide 01 Edition (Paperback) :- R. K. Narayan", "Three Men in a Boat (Paperback)", "A Tale Of Two Cities 1st Edition (Paperback) :- Charles Dickens" };
        int FICTP[]={234, 231, 341, 324, 431, 2654, 342, 543, 654, 234, 6345, 423, 312, 344, 399, 499, 399, 299, 699, 799, 299, 499, 599, 1299, 699, 99, 592, 399, 499, 599, 699, 499, 399, 499, 329, 239, 549, 559, 549, 543, 239, 329, 219, 249, 549, 239, 459, 239, 659, 399 };

        int FICTSI[]=new int[FICT.length];

       
        for(int i=0;i<FICT.length;i++)
        {
            int p=FICT[i].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10)
                System.out.println("(0"+c+")"+FICT[i]+h+"Rs."+FICTP[i]);

            else
                System.out.println("("+c+")"+FICT[i]+h+"Rs."+FICTP[i]);
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

                for(int i=ar;i<FICTSI.length;i++)
                    FICTSI[ar]=-1;

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

                if(Integer.parseInt(s)>FICT.length || Integer.parseInt(s)<=0)
                {

                    System.out.println("Sorry! No Books Available");
                }
                
                IF1:
                if(Integer.parseInt(s)<=FICT.length && Integer.parseInt(s)!=0)
                {
                    int n=Integer.parseInt(s);
                    
                    LOOP3:
                    for(int i=0;i<FICTSI.length;i++)
                    {
                        if(FICTSI[i]==n)
                        {
                            System.out.println("You Have already purchased this book");
                            break IF1;
                        }
                    }
                    
                    
                    
                    FICTSI[ar]=n;
                    
                    
                    
                    String h=SPACEDOT.space(FICT[n-1].length());
                    System.out.println("("+s+")"+FICT[n-1]+h+"Rs."+FICTP[n-1]);

                    FICTSI[ar]=n;

                    ar++;

                }
            }

    

        }
        return FICTSI;
    }
    
}