import java.io.*;
import java.util.Scanner;

public class SEARCHES extends BILL_SHOW
{

    public static String[] returnSEARCH(String name)throws IOException
    {

        String src[]=new String[400];

        int s; int c=0;

        Scanner in=new Scanner(System.in);
        in.useDelimiter("\\*--0--\\*");
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(read);

        String ACAD[]= {"Concise maths-: SP Tripathi", "MTG JEE main 30 days course", "MTG JEE advanced 30 days course", "ICSE Preparation Book", "JD Lee concise inorganic chemistry", "IB Diploma Physics-: Sam Jijnamb", "Total HCG I & II ICSE", "Total English I ICSE", "Total English II ICSE", "Total Maths ICSE", "A textbook of ICSE Biology for class 10-: Anita Prasad", "A Textbook of ICSE Chemistry for class 10-: Anita Prasad", "A Textbook of ICSE Mathematics for class 10-: OP Sinhal ", "A textbook of ICSE Biology for class 9-: Anita Prasad", "A Textbook of ICSE Chemistry for class 9-: Anita Prasad ", "A Textbook of ICSE Mathematics for class 9-: OP Sinhal ", "Gadya Sankalan WorkBook for class 9-10 ICSE", "Ekanki Suman WorkBook for class 10 ICSE", "Treasure Trove Of Short Stories Workbook for class 10 ICSE", "Golden lyre Workbook for class 10 ICSE", "As You Like It Workbook for class 10 ICSE", "Together with ICSE Mathematics for class 9", "Together with ICSE Physics for class 9", "Together with ICSE Biology for class 9", "Together with ICSE History and Civics for class 9", "Together with ICSE Chemistry for class 9", "Together with ICSE Geography for class 9", "Together with ICSE Computer applications for class 9","Together with ICSE English 1 for class 9-10","Together with ICSE Hindi for class 9-10","Together with ICSE English 2 for class 9", "Together with ICSE Mathematics for class 10","Together with ICSE Physics for class 10","Together with ICSE Chemistry for class 10", "Together with ICSE Biology for class 10", "Together with ICSE History and civics for class 10", "Together with ICSE Geography for class 10", "Together with ICSE Computer Applications for class 10", "CBSE Mathematics class 10", "CBSE Science class 10", "CBSE Social Sciences", "ICSE Bengali complete course class 9-10", "Objective chemistry workbook for class 10 ICSE", "ISC Physics", "ISC Chemistry", "ISC Mathematics", "ISC Biology", "Hues- An Anthology of short stories", "MTG IITians Resource", "ICSE Syllabus 2013-14"};
        int ACADP[]={250, 2200, 2350, 400, 565, 2100, 260, 200, 211, 245, 345, 234, 243, 213, 345, 213, 333, 321, 435, 654, 121, 324, 412, 222, 232, 212, 242, 213, 233, 124, 211, 233, 243, 323, 129, 199, 176, 287, 234, 298, 342, 231, 213, 143, 123, 154, 123, 198, 156, 78};
        
        
        String FICT[]={"The three mistakes of my life-: Chetan Bhagat", "Five Points Someone-: What not to do at IIT-:Chetan Bhagat", "Oath of Vayuputras-: Amish Tripathi", "Nagas of Meluha-:Amish Tripathi", "Rich Dad, Poor Dad :-Robert T Kiyoski", "Chicken Soup :-Jack Canfield(Full volumnar edition)", "The Alchemist-: Paul Coelho", "Inferno (Hardcover) :- Dan Brown", "Come on Inner Peace! : I Don't Have All Day! (Paperback) :- Sachin Garg", "The Great Gats:- Film tie-in Edition (Paperback) :- F. Scott Fitzgerald", "The Oath of the Vayuputras: Shiva Trilogy 3 (Paperback) :- Amish Tripathi", "Best Kept Secret (Paperback) :- Jeffrey Archer", "The Hit (Paperback)", "A Memory of Light (Paperback) :- Robert Jordan, Brandon Sanderson", "Combo of River of Smoke 1st Edition (Paperback)", "Narcopolis (Hardcover) :- Jeet Thayil", "The Jeffrey Archer Collection (Set of 3 Books) (Paperback) :- Jeffrey Archer", "Fifty Shades Trilogy (Set of 3 Books) 1st Edition (Paperback)", "The Hobbit (Set of 2 Books) (Paperback) :- J. R. R. Tolkien", "And the Mountains Echoed (Paperback) :- Khaled Hosseini", "The Lord of the Rings (Set of 3 Books) Film tie-in International ed Edition (Paperback) :- J. R. R. Tolkien", "The Casual Vacancy 1st Edition (Hardcover) :- J. K. Rowling", "The Dark Tower: The Wind Through The Keyhole (Paperback) :- Stephen King", "Combo of The Immortals of Meluha (Paperback)", "The Blind Man's Garden (Hardcover) :- Nadeem Aslam", "The Racketeer (Paperback) :- John Grisham", "Life of Pi Signed illustrated ed Edition (Hardcover) :- Yann Martel", "21 New Beginnings: True Stories of Oddity, Hope & Change (Hardcover) :- Viveik Pandit", "The Skinning Tree (Hardcover) :- Srikumar Sen", "The War Ministry (Paperback) :- Krishan Partap Singh", "Midnight's Children (Paperback) :- Salman Rushdie", "The Last Man Export ed Edition (Paperback) :- Vince Flynn", "The Dalai Lama's Cat: A Novel 1st Edition (Paperback) :- David Michie", "Bring Up the Bodies (Paperback)", "The Complete Sherlock Holmes: All 4 Novels and 56 Short Stories (Set of 2 Volumes) Deluxe Edition (Paperback) :- Arthur Conan Doyle", "Revenge Wears Prada: The Devil Returns (Paperback) :- Lauren Weisberger", "Ifs, Buts Going Nuts (Paperback) :- Sonitha J Kapoor", "To Kill a Mockingbird 50th Anniversary Edition (Paperback)", "Train to Pakistan 01 Edition (Paperback)", "Animal Farm: A Fairy Story 1st Edition (Paperback) :- George Orwell",  "Malgudi Schooldays (Paperback) :- R. K. Narayan", "If Tomorrow Comes (Reissue) Edition (Paperback) :- Sidney Sheldon", "100 Selected Stories New ed Edition (Paperback) :- O. Henry", "100 Selected Stories New ed Edition (Paperback) :- O. Henry", "Things Fall Apart 1 Edition (Paperback)-:Chinua Achebe", "Death on the Nile 01 Edition (Paperback)", "The Bell Jar (Paperback) :- Sylvia Plath", "The Guide 01 Edition (Paperback) :- R. K. Narayan", "Three Men in a Boat (Paperback)", "A Tale Of Two Cities 1st Edition (Paperback) :- Charles Dickens" };
        int FICTP[]={234, 231, 341, 324, 431, 2654, 342, 543, 654, 234, 6345, 423, 312, 344, 399, 499, 399, 299, 699, 799, 299, 499, 599, 1299, 699, 99, 592, 399, 499, 599, 699, 499, 399, 499, 329, 239, 549, 559, 549, 543, 239, 329, 219, 249, 549, 239, 459, 239, 659, 399 };
        
       
        String POPSCI[]={"A Brief History of Time-:Stephen Hawking", "A Briefer history of time-: Stephen Hawking", "The Scientific Indian-:Dr. APJ Abdul Kalam", "The Chariots of the Gods-: Erich Von DaniKen", "Nature of Space and Time-: Hawking and Penrose", "Life and origin of Universe-: Bhaktivedanta Swami", "God Created The Integers-: Stephen Hawking", "A Short History of Nearly Everything (Paperback)", "A Short History of Nearly Everything (Paperback)  ","The Selfish Gene (Paperback)  by Richard Dawkins","The Immortal Life of Henrietta Lacks (Hardcover) ","The Elegant Universe: Superstrings, Hidden Dimensions, and the Quest for the Ultimate Theory (Paperback)","The Origin of Species (Hardcover) ","Cosmos (Paperback) by Carl Sagan ","The Demon-Haunted World: Science as a Candle in the Dark ","The Greatest Show on Earth: The Evidence for Evolution by Richard Dawkins ","The God Delusion (Hardcover) by Richard Dawkins","Guns, Germs, and Steel: The Fates of Human Societies (Paperback) by Jared Diamond ","Surely You're Joking, Mr. Feynman! (Paperback) ","The Grand Design (Hardcover) by Stephen Hawking","The Fabric of the Cosmos (Space, Time, and the Texture of Reality) ","The Disappearing Spoon: And Other True Tales of Madness, Love, and the History of the World from the Periodic Table of the Elements (Hardcover) ","Packing for Mars: The Curious Science of Life in the Void (Hardcover) ","The Ancestor's Tale: A Pilgrimage to the Dawn of Evolution ","Physics of the Impossible: A Scientific Exploration into the World of Phasers, Force Fields, Teleportation, and Time Travel (Hardcover) ","Chaos: The Making of a New Science (Paperback) ","Death by Black Hole: And Other Cosmic Quandaries (Hardcover) ","Gödel, Escher, Bach: An Eternal Golden Braid (Paperback) ","Pale Blue Dot: A Vision of the Human Future in Space ","The Hot Zone (Paperback) ","Spook: Science Tackles the Afterlife (Paperback) ","Genome: the Autobiography of a Species in 23 Chapters (Paperback) "};
        int POPSCIP[]={1099, 999, 657, 327, 564, 346, 674, 999, 657, 327, 564, 346, 999, 657, 327, 564, 346, 999, 657, 327, 564, 346, 999, 657, 327, 564, 346, 999, 657, 327, 564, 346};
  
        String MAG[]={"Nat Geo Chunks (Global Monthly)-: NATIONAL GEOGRAPHIC CHANNEL", "POPSCI future of-:POPSCI(Monthly)", "Scholastic Yearbook 2013(Yearly)", "INFOPEDIA(Monthly)-ALL for Info & Tech", "MTG PCMB (monthly) for JEE", "CARS-: The ULTIMAT-um", "BSE-:Business BRUNCH", "Open  Current Affairs and Features Weekly","Tehelka  News  Weekly","Industry 2.0  Manufacturing Technology Updates and News  Monthly","CTO Forum  -  Monthly","Yo Vizag Lifestyle Monthly DSA Media","Puthiya Thalaimurai - A Weekly Tamil Magazine","Shair Urdu Magazine","Desh magazine","Rythubandhu","Sportstar","Outlook","India Today","Femina (India)","PCQuest","Dataquest - Fortnightly Information Technology","Sanctuary Asia","Himal","The Business Enterprise  Business  Monthly","The Week","Frontline","Electronics For You  Technology  Monthly","Elle Decor Magazine","India Today Travel Plus Magazine","Outlook Business And Careers 360 (Combo) Magazine","BBC Knowledge Magazine"};
        int MAGP[]={1399, 799, 699, 899, 1099, 499, 877, 799, 699, 899, 1099, 499, 799, 699, 899, 1099, 499, 799, 699, 899, 1099, 499, 799, 699, 899, 1099, 499, 799, 699, 899, 1099, 499};

        String REF[]={"Oxford English Dictionary-ADVANCED", "Cambridge Syndicate Mathematical log book- Powell", "Oxford Dictionary of Physics", "Oxford Dictionary of Chemistry", "Table of Chemical valencies and periodicity of elements", "Units, Distances, Symbols- Standard Internaccional", "Standards for Mid-Range Trajectory and Projectile height locus", "India 2013 (Paperback) by Government of India (Ministry of Information Broadcasting)","Manorama Yearbook 2013 with Free Encylopaedia Britannica","Geography of India 4 Edition (Paperback) by Majid Husain","Key To High School English Grammar & Composition ","Advanced Learner's Dictionary 8 Edition (Paperback) by A S Hornby","Oxford School Atlas (With CD) (Paperback) by Oxford University Press","Oxford Student Atlas for India 2nd Edition (Paperback) by Oxford University Press","Oxford Advanced Learner's Dictionary 8th Edition (Hardcover) by Oxford University Press","Pocket Oxford English Dictionary 10th Edition (Hardcover) by Oxford Dictionary","The Book of Indian Birds 13th Edition (Hardcover) by Salim Ali","I, Steve: Steve Jobs in his own words (Paperback)","The Pearson Concise General Knowledge Manual 2013 (Paperback) by Edgar Thorpe","Oxford Hindi–English Dictionary (Hindi, English) 1st Edition (Paperback) by R. S. McGregor","Reactions, Rearrangements & Reagents, Sanyal (Paperback) by S. N. Sanyal","Yearbook 2013 (Paperback)","Current Affairs Annual Issue 2013 PB by Singh A P","Dictionary of Economics (Paperback)","Concise Medical Dictionary 8th Edition (Paperback) by Elizabeth A. Martin","Oxford Dictionary of Chemistry 6th Edition (Paperback) by John Daintith","The Oxford Dictionary of Philosophy 2nd Edition (Paperback) by Simon Blackburn","Oxford Dictionary Of Biomedicine (Paperback) by John Lackie","The Oxford Dictionary Of Literary Terms 3rd Edition (Paperback) by Chris Baldick","The Concise Oxford Dictionary of Mathematics 4th Edition (Paperback) byChristopher Clapham, James Nicholson","The Oxford Dictionary of Synonyms and Antonyms 2nd Edition (Paperback) byOxford Dictionary","Oxford Essential French Dictionary 1st Edition (Paperback) by Oxford Dictionary","Oxford Dictionary of Biology 6th Edition (Paperback)"};
        int REFP[]={345, 541, 234, 200, 400, 500, 345, 541, 234, 200, 400, 500, 345, 541, 234, 200, 400, 500, 345, 541, 234, 200, 400, 500, 345, 541, 234, 200, 400, 500, 345, 541, 234};
  
        String NFICT[]={"Discovery of India-: Pt. Jawaharlal Nehru", "Unbroken:WWII -:Laura Hillenbrand", "We Are Poor But So Many: The Story of Self-Employed Women in India-: Ela R. Bhatt ", "The Idea Of India-: Sunil Khilnani ", "ELEVEN RING-: Phil Jackson", "RUMSFELD'S RULES-: Donald Rumsfeld", "The Art of Choosing-:Sheena Iyengar", "The Diary of a Young Girl (Paperback) ", "Freakonomics: A Rogue Economist Explores the Hidden Side of Everything (Hardcover) by Steven D. Levitt (shelved 5107 times as non-fiction) ", "THE VARIETIES OF RELIGIOUS EXPERIENCE by William James", "THE AMERICAN LANGUAGE  by H. L. Mencken", "THE GENERAL THEORY OF EMPLOYMENT, INTEREST, AND MONEY  by John Maynard Keynes", "THE LIVES OF A CELL  by Lewis Thomas", "THE FRONTIER IN AMERICAN HISTORY  by Frederick Jackson Turner", "BLACK BOY  by Richard Wright", "ASPECTS OF THE NOVEL  by E. M. Forster", "THE PROPER STUDY OF MANKIND  by Isaiah Berlin", "THE NATURE AND DESTINY OF MAN  by Reinhold Niebuhr", "NOTES OF A NATIVE SON  by James Baldwin", "THE ELEMENTS OF STYLE  by William Strunk and E. B. White", "AN AMERICAN DILEMMA  by Gunnar Myrdal", "PRINCIPIA MATHEMATICA  by Alfred North Whitehead and Bertrand Russell", "THE MISMEASURE OF MAN  by Stephen Jay Gould", "THE MIRROR AND THE LAMP  by Meyer Howard Abrams", "THE ART OF THE SOLUBLE  by Peter B. Medawar", "THE ANTS  by Bert Hoelldobler and Edward O. Wilson", "A THEORY OF JUSTICE  by John Rawls", "ART AND ILLUSION  by Ernest H. Gombrich", "THE MAKING OF THE ENGLISH WORKING CLASS  by E. P. Thompson", "PHILOSOPHY AND CIVILIZATION  by John Dewey", ">THE AGE OF JACKSON , Arthur Schlesinger by Jr.", "THE MAKING OF THE ATOMIC BOMB  by Richard Rhodes", "BLACK LAMB AND GREY FALCON  by Rebecca West", "GOODBYE TO ALL THAT  by Robert Graves"};           
        int NFICTP[]={456, 345, 145, 543, 125, 998, 376, 232, 213, 250, 2200, 2350, 400, 565, 2100, 260, 200, 211, 245, 345, 234, 243, 213, 345, 213, 333, 321, 435, 654, 121, 324, 412, 222, 232, 212};
        
         String FOOD[]= { "Oh Calcutta: Cookbook (Paperback) by Anjan Chatterjee", "Highway On My Plate: The Indian Guide To Roadside Eating (Paperback) by Rocky Singh, Mayur Sharma", "Chicken Recipes (Paperback) by Sanjeev Kapoor", "Cooking With Love: Vegetarian Recipes From My Mother's Kitchen (Hardcover) by Sanjeev Kapoor", "The Mainland China Cookbook (Paperback) by Anjan Chatterjee", "Tea 1st Edition (Hardcover)","Modernist Cuisine: The Art and Science of Cooking (Boxed Set) by Nathan Myhrvold,Chris Young, Maxime Bilet","The Oxford Encyclopedia of Food and Drink in America: 3-Volume Set (Hardcover) by Bruce Kraig","Simple Home Baking (Paperback) by Sanjeev Kapoor","Cakes And Bakes (Paperback) by Sanjeev Kapoor","Nm Breakfast Recipes -Vegetarian (Paperback) by Nita Mehta","Rice,Biryani and Pulao (NON-VEG) (Paperback) by Sanjeev Kapoor","How the Banana Goes to Heaven (Paperback) by Ratna Rajaiah","Eggless Desserts (Paperback) by Nita Mehta","Essential Kerala Cookbook (Paperback)","101 KERALADELICACIES (Paperback)by G. Padma Vijay","Khanna Khazana Bhartiya Vyanjanon Ka Utsav (Hindi) (Hardcover) by Sanjeev Kapoor","How to Be a Domestic Goddess : Baking and the Art of Comfort Cooking (Paperback) by Nigella Lawson","100 Favourite Hand Picked Recipes (Paperback) by Sanjeev Kapoor","Vegetarian Rice, Biryani and Pulao (Paperback) by Sanjeev Kapoor","Rasachandrika: Saraswat Cookery Book (Paperback) by S. MahilaSamaj","Bengali Cuisine: India on My Plate (Paperback) by Aditi Das","Modern Cookery for Teaching and the Trade (Volume - 2) 6th Edition (Paperback) by Thangam E. Philip","My Great India Cookbook (Hardcover) by Vikas Khanna","Tikkas & Kebabs (Chefs Special) (Paperback) by MASTER CHEFS OF INDIA"};
        int FOODP[]={212, 242, 213, 233, 124, 211, 233, 243, 323, 129, 199, 176, 287, 234, 298, 342, 231, 213, 143, 123, 154, 123, 198, 156, 78, 323, 235, 212, 321, 324, 125, 345, 323, 333, 222, 122, 323};

        String SELFHELP[]= {"Practising Spiritual Intelligence : For Innovation, Leadership and Happiness (Paperback)", "Don't Slap Your Wife But don't Get Slapped Either (Paperback) by Sunil Vaid", "The Now Effect : How a Mindful Moment can Change The Rest of Your Life (Paperback) by Elisha Goldstien", "The Secret (Hardcover)", "The 7 Habits Of Highly Effective People (Paperback) by Stephen R. Covey", "Combo of The Power of Your Subconscious Mind (Paperback)","Beating the Blues: A Complete Guide to Overcoming Depression (Paperback)","Management Mantras: Keys to Effective Management and Leadership (Paperback)","The 7 Minute Solution: Time Strategies to Prioritize, Organize and Simplify Your Life at Work and at Home (Paperback)","The Golden Collection Box Set (Paperback)","Speak Up, Speak Out : My Favourite Elocution Pieces and How to Deliver Them (Paperback)","Exclusive Stephen R. Covey (Set of 3 Books) (Paperback)","The Monk Who Sold His Ferrari (Paperback)","And the Lion Smiled At the Rabbit : Manage Emotions to Win (Paperback)","Why So Stupid (Paperback)","Who Will Cry When You Die? (Paperback)","The Power of Your Subconscious Mind (Paperback)","Don't Feel Stupid At 60 (Paperback)","Golden Cloud, Silver Lining: Lessons from the Masters on Happiness & Longevity (Paperback)","The Great Thoughts on Self-Improvement, Relaxation, Friendship, Happiness, Success, Marriage and Life (Paperback)","The Robin Sharma Pack (Set Of 10 Volumes) (Paperback)","Meditation (Paperback)","Wishes Fulfilled: Mastering The Art Of Manifesting (Paperback)","Seven Spiritual Laws of Success: A Pocket Guide to Fulfilling Your Dreams (Hardcover)","Seed of Genius: Nurture Your Natural Multiple Intelligences (Paperback) by Ankur Gupta","An Idiot, Placements And IntervYou (Paperback) by Toffee","Rajini's Punchtantra: Business and Life Management the Rajinikanth Way (Paperback) by P.C. Balasubramanian, Raja Krishnamoorthy","How to Be Brilliant: Change your ways in 90 days! 3rd Edition (Paperback) byMichael Heppell","Life is Fundamentally Management (Paperback) by A. Senthivel, Govind Babu","Body Language In The Work Place (Paperback) by Allan, Barbara Pease","How To Win Friends And Influence People (Paperback) by Dale Carnegie","The Definitive Book of Body Language (Paperback) by Allan, Barbara Pease","How Will You Measure Your Life? (Paperback)"};
        int SELFHELPP[]={250, 2200, 2350, 400, 565,250, 2200, 2350, 400, 565,250, 2200, 2350, 400, 565,250, 2200, 2350, 400, 565,250, 2200, 2350, 400, 565,250, 2200, 2350, 400, 323, 232, 232};
        
        String BIO[]= {"Dongri To Dubai: Six Decades of The Mumbai Mafia (Paperback) by S Hussain Zaidi", "Steve Jobs: The Exclusive Biography (Hardcover) by Walter Isaacson", "Wings of Fire: An Autobiography 1st Edition (Paperback) by APJ Abdul Kalam, Arun Tiwari", "The Race of My Life : An Autobiography (Paperback)", "My Encounter with IIT JEE: The Story of Preparation (Paperback) by Arpit Agrawal", "The Freethinker's Prayer Book (Hardcover) by Khushwant Singh","Playing to Win (Paperback) by Saina Nehwal","Combo of Indira: The Life Of Indira Nehru Gandhi (Paperback)","My World in Cricket (Hardcover) by Stuart Broad","14 Hours: An Insider's Account of the 26/11 Taj Attack (Paperback) by Ankur Chawla","Impatient Optimist: Bill Gates in his Own Words (Paperback)","Conversations with Mani Ratnam (Hardcover) by Baradwaj Rangan","Total Recall: My Unbelievably True Life Story (Paperback) by Arnold Schwarzenegger","Neerh Ka Nirman Phir (Hindi) Rajpal & Sons Edition (Hardcover) by Harivansh Rai Bachchan","Mohammed Rafi (Paperback) by Yasmin Khalid Rafi","The Last Lecture (Paperback) by Randy Pausch","The Test of My Life from Cricket to Cancer and Back (Hardcover) by Yuvraj Singh,Sharda Ugra, Nishant Jeet Arora","Rahul Dravid: Timeless Steel (Hardcover) by ESPN Cricinfo","Mein Kampf (Paperback) by Adolf Hitler","A complete biography of Abraham Lincoln (Paperback)","Why I Failed: Lessons from Leaders (Paperback) by Shweta Punj","Autobiography Of A Yogi (Paperback) by Sri Sri Paramahansa Yogananda","Before Memory Fades: An Autobiography (Paperback) by Fali S. Nariman","M. K. Gandhi - An Autobiography Or The Story Of My Experiments With Truth (Paperback) by M K Gandhi","The Man Who Knew Infinity [Srinivasa Ramanujan] (Paperback) by KANIGEL ROBERT","Open : an Autobiography (Paperback)",};
        int BIOP[]={250, 2200, 2350, 400, 565, 2200, 2350, 400, 565, 2200, 2350, 400, 565, 2200, 2350, 400, 565, 2200, 2350, 400, 565, 2200, 2350, 400, 565, 340};//, 2100, 260, 200, 211, 245, 345, 234, 243, 213, 345, 213, 333, 321, 435, 654, 121, 324, 412, 222, 232, 212, 242, 213, 233, 124, 211, 233, 243, 323, 129, 199, 176, 287, 234, 298, 342, 231, 213, 143, 123, 154, 123, 198, 156, 78, 323, 235, 212, 321, 324, 125, 345, 323, 333, 222, 122, 323};
        
        String BESTSELLERS[]= { "A tale of 2 cities by Charles Dickens","The Lord of Rings by J.R.R Tolkein","Le Petit Prince (The Little Prince) by Antoine de Saint-Exupéry","The Hobbit by J. R. R. Tolkien","And Then There Were None by Agatha Cristie","The Lion, the Witch and the Wardrobe by C. S. Lewis","She: A History of Adventure by H. Rider Haggard","The Da Vinci Code by Dan Brown","Think and Grow Rich by Napoleon Hill","The Catcher in the Rye by J. D. Salinger",};
        int BESTSELLERSP[]={250, 2200, 2350, 400, 565, 250, 2200, 2350, 400, 565};
        
        
        int ar=0;
        
        String arr[]=new String[400];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]="";

        }

        if(name.length()>=2)
        {
            if( Character.isDigit(name.charAt(0)) || Character.isLetterOrDigit(name.charAt(0))==false)
                name=name.replace(name.charAt(0), '\0');

            if(Character.isDigit(name.charAt(1)) && Character.isDigit(name.charAt(0)) || Character.isLetterOrDigit(name.charAt(0))==false || Character.isLetterOrDigit(name.charAt(1))==false  )
                name=name.replace(name.substring(0,2), "\0\0\0");
        }
        /*for academic books*/ 
        System.out.println("\nIN ACADEMIC BOOKS");
        for(int i=0;i<ACAD.length;i++)
        {
            s=SEARCHER.Search(name,ACAD[i]);

            if(s==1)
            {

                int p=ACAD[i].length();
                String h=SPACEDOT.space(p);

                src[ar]="("+(c+1)+")"+ACAD[i]+h+ACADP[i];
                ar++;
                c++;
                System.out.println("("+c+")"+ACAD[i]+h+"Rs."+ACADP[i]);

            }

        }
        s=0;
        /*for Fictional books*/ 
        System.out.println("\nIN FICTIONS");
        for(int i=0;i<FICT.length;i++)
        {
            s=SEARCHER.Search(name,FICT[i]);

            if(s==1)
            {

                int p=FICT[i].length();
                String h=SPACEDOT.space(p);

                src[ar]="("+(c+1)+")"+FICT[i]+h+FICTP[i];

                ar++;

                c++;
                System.out.println("("+c+")"+FICT[i]+h+"Rs."+FICTP[i]);

            }
        }
        s=0;
        /*for Non Fictional books*/ 
        System.out.println("\nIN NON-FICTIONS");
        for(int i=0;i<NFICT.length;i++)
        {
            s=SEARCHER.Search(name,NFICT[i]);

            if(s==1)
            {

                int p=NFICT[i].length();
                String h=SPACEDOT.space(p);

                src[ar]="("+(c+1)+")"+NFICT[i]+h+NFICTP[i];

                ar++;

                c++;
                System.out.println("("+c+")"+NFICT[i]+h+"Rs."+NFICTP[i]);

            }
        }
        s=0;
        /*for Popular Science books*/ 
        System.out.println("\nIN POPULAR SCIENCES");
        for(int i=0;i<POPSCI.length;i++)
        {
            s=SEARCHER.Search(name,POPSCI[i]);

            if(s==1)
            {

                int p=POPSCI[i].length();
                String h=SPACEDOT.space(p);

                src[ar]="("+(c+1)+")"+POPSCI[i]+h+POPSCIP[i];

                ar++;

                c++;
                System.out.println("("+c+")"+POPSCI[i]+h+"Rs."+POPSCIP[i]);

            }
        }
        s=0;
        /*for Magazine books*/ 
        System.out.println("\nIN MAGAZINES");
        for(int i=0;i<MAG.length;i++)
        {
            s=SEARCHER.Search(name,MAG[i]);

            if(s==1)
            {

                int p=MAG[i].length();
                String h=SPACEDOT.space(p);

                src[ar]="("+(c+1)+")"+MAG[i]+h+MAGP[i];

                ar++;

                c++;
                System.out.println("("+c+")"+MAG[i]+h+"Rs."+MAGP[i]);

            }
        }
        s=0;
        /*for Referece books*/ 
        System.out.println("\nIN REFERENCE BOOKS");
        for(int i=0;i<REF.length;i++)
        {
            s=SEARCHER.Search(name,REF[i]);

            if(s==1)
            {

                int p=REF[i].length();
                String h=SPACEDOT.space(p);

                src[ar]="("+(c+1)+")"+REF[i]+h+REFP[i];

                ar++;

                c++;
                System.out.println("("+c+")"+REF[i]+h+"Rs."+REFP[i]);

            }
        }
            
        s=0;
        /*for FOOD books*/ 
        System.out.println("\nIN FOOD AND BEVERAGES RELATED BOOKS");
        for(int i=0;i<FOOD.length;i++)
        {
            s=SEARCHER.Search(name,REF[i]);

            if(s==1)
            {

                int p=FOOD[i].length();
                String h=SPACEDOT.space(p);

                src[ar]="("+(c+1)+")"+FOOD[i]+h+FOODP[i];

                ar++;

                c++;
                System.out.println("("+c+")"+FOOD[i]+h+"Rs."+FOODP[i]);

            }
        }
        
        s=0;
        /*for SELF_HELP books*/ 
        System.out.println("\nIN SELF HELP");
        for(int i=0;i<SELFHELP.length;i++)
        {
            s=SEARCHER.Search(name,SELFHELP[i]);

            if(s==1)
            {

                int p=SELFHELP[i].length();
                String h=SPACEDOT.space(p);

                src[ar]="("+(c+1)+")"+SELFHELP[i]+h+SELFHELPP[i];

                ar++;

                c++;
                System.out.println("("+c+")"+SELFHELP[i]+h+"Rs."+SELFHELPP[i]);

            }
        }
        
         s=0;
        /*for Magazine books*/ 
        System.out.println("\nIN BIOGRAPHIES AND AUTOBIOGRAPHIES");
        for(int i=0;i<BIO.length;i++)
        {
            s=SEARCHER.Search(name,BIO[i]);

            if(s==1)
            {

                int p=BIO[i].length();
                String h=SPACEDOT.space(p);

                src[ar]="("+(c+1)+")"+BIO[i]+h+BIOP[i];

                ar++;

                c++;
                System.out.println("("+c+")"+BIO[i]+h+"Rs."+BIOP[i]);

            }
        }
        
        s=0;
        /*for BESTSELLER books*/ 
        System.out.println("\nIN BESTSELLERS");
        for(int i=0;i<BESTSELLERS.length;i++)
        {
            s=SEARCHER.Search(name,BESTSELLERS[i]);

            if(s==1)
            {

                int p=BESTSELLERS[i].length();
                String h=SPACEDOT.space(p);

                src[ar]="("+(c+1)+")"+BESTSELLERS[i]+h+BESTSELLERSP[i];

                ar++;

                c++;
                System.out.println("("+c+")"+BESTSELLERS[i]+h+"Rs."+BESTSELLERSP[i]);

            }
        }
        
        

        return src;
    }

    public static String[] displaySEARCH(String str[])throws IOException
    {

        String subs="";
        Scanner in=new Scanner(System.in);
        long srcno[]=new long[str.length];

        for(int i=0;i<srcno.length;i++)
        srcno[i]=-977454379223l;
            
        
        
        
        
        int lgs=str.length;
        String selection[]=new String[lgs];
        int i, j, k, z;
        i=0;

        for(j=0;j<selection.length;j++)
            selection[j]="";

        LOOPS:
        while(true)
        {
            LOOPSPASS:
            while(true)
            {
                System.out.println("Enter the corresponding no. of book you want to buy OR ENTER DONE to proceed");
                String m=in.next();
                
                if(m.equals(""))
                m=900+"";
                
                
                if(ANAGRAM.areAnagrams("done", m)!=1)
                {
                for(int po=0;po<srcno.length;po++)
                {
                    if(srcno[po]==Integer.parseInt(m))
                    {
                        System.out.println("You Have already purchased this book!!");
                        break LOOPSPASS;
                    }

                }
            }
                
                
                
                
            
                
                if(ANAGRAM.areAnagrams("done", m)==1)
                break LOOPS;
                
                
                
                

                

                else if(ANAGRAM.areAnagrams("done", m)==0)
                {   
                    
                    
                    int n=Integer.parseInt(m);
                
                
                
                    if(n<1 || n>400 || n==0 || str[n-1]==null)
                        System.out.println("No Such Book Available!!");

                    else if(str[n-1]!=null || str[n]!=null )
                    {
                        selection[i]=str[n-1];

                        srcno[i]=Integer.parseInt(m);
                        System.out.println(str[n-1]);
                        i++;
                    }
                }
            }
            
            
            
        }
        return selection;
    }

}