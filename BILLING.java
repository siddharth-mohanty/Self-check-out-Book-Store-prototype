import java.io.*;
public class BILLING extends ACAD
{
    
    public static int billACAD()throws IOException
    {

        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(read);

        int c=0;
        String ACAD[]= {"", "Concise maths-: SP Tripathi", "MTG JEE main 30 days course", "MTG JEE advanced 30 days course", "ICSE Preparation Book", "JD Lee concise inorganic chemistry", "IB Diploma Physics-: Sam Jijnamb", "Total HCG I & II ICSE", "Total English I ICSE", "Total English II ICSE", "Total Maths ICSE", "A textbook of ICSE Biology for class 10-: Anita Prasad", "A Textbook of ICSE Chemistry for class 10-: Anita Prasad", "A Textbook of ICSE Mathematics for class 10-: OP Sinhal ", "A textbook of ICSE Biology for class 9-: Anita Prasad", "A Textbook of ICSE Chemistry for class 9-: Anita Prasad ", "A Textbook of ICSE Mathematics for class 9-: OP Sinhal ", "Gadya Sankalan WorkBook for class 9-10 ICSE", "Ekanki Suman WorkBook for class 10 ICSE", "Treasure Trove Of Short Stories Workbook for class 10 ICSE", "Golden lyre Workbook for class 10 ICSE", "As You Like It Workbook for class 10 ICSE", "Together with ICSE Mathematics for class 9", "Together with ICSE Physics for class 9", "Together with ICSE Biology for class 9", "Together with ICSE History and Civics for class 9", "Together with ICSE Chemistry for class 9", "Together with ICSE Geography for class 9", "Together with ICSE Computer applications for class 9","Together with ICSE English 1 for class 9-10","Together with ICSE Hindi for class 9-10","Together with ICSE English 2 for class 9", "Together with ICSE Mathematics for class 10","Together with ICSE Physics for class 10","Together with ICSE Chemistry for class 10", "Together with ICSE Biology for class 10", "Together with ICSE History and civics for class 10", "Together with ICSE Geography for class 10", "Together with ICSE Computer Applications for class 10", "CBSE Mathematics class 10", "CBSE Science class 10", "CBSE Social Sciences", "ICSE Bengali complete course class 9-10", "Objective chemistry workbook for class 10 ICSE", "ISC Physics", "ISC Chemistry", "ISC Mathematics", "ISC Biology", "Hues- An Anthology of short stories", "MTG IITians Resource", "ICSE Syllabus 2013-14", "English for class 8", "English for class 7", "English for class 6", "Maths for class 8", "Maths for class 7", "Maths for class 6", "Hindi for class 8", "Hindi for class 7", "Hindi for class 6", "Social Studies for class 8", "Social Studies for class 7", "Social Studies for class 6"};
        int ACADP[]={0, 250, 2200, 2350, 400, 565, 2100, 260, 200, 211, 245, 345, 234, 243, 213, 345, 213, 333, 321, 435, 654, 121, 324, 412, 222, 232, 212, 242, 213, 233, 124, 211, 233, 243, 323, 129, 199, 176, 287, 234, 298, 342, 231, 213, 143, 123, 154, 123, 198, 156, 78, 323, 235, 212, 321, 324, 125, 345, 323, 333, 222, 122, 323};

        String ACADSELECT[]=new String[62];
        int ACADSELECTP[]=new int[62];
        String TACADSELECT[]=new String[62];

        int ar1[]=displayACAD();
        
        
        if(ar1[0]==-1)
        System.out.println("You Havent Purchased Anything");
            
            
        
        
        
        
        else
        {
        System.out.println(" IN ACADEMIC SECTION You Have Selected");
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=ACAD[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10)
                System.out.println("(0"+c+")"+ACAD[d]+h+"Rs."+ACADP[d]);

            else
                System.out.println("("+c+")"+ACAD[d]+h+"Rs."+ACADP[d]);

        }
        System.out.println("Do you want to remove any book, if yes then enter the no. of the book else ENTER 'NO' to Bill");
        LOOP1:
        while(true)
        {

            
            String a=buf.readLine();

            LOOP2:
            for(int i=0;i<ar1.length;i++)
            {
                if(a.equalsIgnoreCase("NO") || ANAGRAM.areAnagrams("no", a)==1)
                    break LOOP1;

                int m=Integer.parseInt(a);
                if((i+1)==m)
                
                    
                    ar1[i]=0;
                    
            }

        }
        c=0;
        System.out.println(" NOW IN ACADEMIC SECTION You Have Selected");
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=ACAD[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10 && ACADP[d]>0)

                System.out.println("(0"+c+")"+ACAD[d]+h+"Rs."+ACADP[d]);

            else if(ACADP[d]>0)
                System.out.println("("+c+")"+ACAD[d]+h+"Rs."+ACADP[d]);

        }
        int qty[]=new int[62];
        System.out.println("\n\n*******************************ENTER QUANTITY FOR EACH BOOK*****************************************");
        c=0;
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=ACAD[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10 && ACADP[d]>0)
            {
                System.out.println("\n(0"+c+")"+ACAD[d]+h+"Rs."+ACADP[d]);
                qty[i]=TAKE.takeQty();
                ACADSELECT[i]=ACAD[d];
                ACADSELECTP[i]=ACADP[d];
                TACADSELECT[i]=ACAD[d]+""+SPACEDOT.space(ACAD[d].length())+qty[i]+"............."+""+Integer.toString(ACADP[d]);
            }

            else if(ACADP[d]>0)
            {
                System.out.println("("+c+")"+ACAD[d]+h+"Rs."+ACADP[d]);
                qty[i]=TAKE.takeQty();
                ACADSELECT[i]=ACAD[d];
                ACADSELECTP[i]=ACADP[d];
                TACADSELECT[i]=(ACAD[d]+""+SPACEDOT.space(ACAD[d].length())+qty[i]+"............."+""+Integer.toString(ACADP[d]));
            }

        }
        
        c=0;
        int cou=0;
        int s=0;
        BILL_SHOW.showHeader();
        for(int i=0;i<ar1.length;i++)
        {

            if(ACADSELECT[i]!=null)
            {
                int p=ACADSELECT[i].length();
                String h=SPACEDOT.space(p);
                c++;
                cou=cou+1;
                int sq=qty[i]*ACADSELECTP[i];
                s=s+sq;
                String conv=Integer.toString(ACADSELECTP[i]);
                System.out.println(TACADSELECT[i]+SPACEDOT.smallspace(conv.length())+sq);

            }

            if(ACADSELECT[i]==null && cou>0)
                break;

        }

        System.out.println("\n");
        for(int y=0;y<"Product-------------------------------------------------------------------------------------------------------------------------------------Qty-----------R".length();y++)
        {
            System.out.print(" ");
        }

        System.out.println("TOTAL BILL=>"+s); return s;

        
        
    }
        
    return (0);
    }
    
    public static int billFICT()throws IOException
    {

        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(read);

        int c=0;
        String FICT[]={"","The three mistakes of my life-: Chetan Bhagat", "Five Points Someone-: What not to do at IIT-:Chetan Bhagat", "Oath of Vayuputras-: Amish Tripathi", "Nagas of Meluha-:Amish Tripathi", "Rich Dad, Poor Dad :-Robert T Kiyoski", "Chicken Soup :-Jack Canfield(Full volumnar edition)", "The Alchemist-: Paul Coelho", "Inferno (Hardcover) :- Dan Brown", "Come on Inner Peace! : I Don't Have All Day! (Paperback) :- Sachin Garg", "The Great Gats:- Film tie-in Edition (Paperback) :- F. Scott Fitzgerald", "The Oath of the Vayuputras: Shiva Trilogy 3 (Paperback) :- Amish Tripathi", "Best Kept Secret (Paperback) :- Jeffrey Archer", "The Hit (Paperback)", "A Memory of Light (Paperback) :- Robert Jordan, Brandon Sanderson", "Combo of River of Smoke 1st Edition (Paperback)", "Narcopolis (Hardcover) :- Jeet Thayil", "The Jeffrey Archer Collection (Set of 3 Books) (Paperback) :- Jeffrey Archer", "Fifty Shades Trilogy (Set of 3 Books) 1st Edition (Paperback)", "The Hobbit (Set of 2 Books) (Paperback) :- J. R. R. Tolkien", "And the Mountains Echoed (Paperback) :- Khaled Hosseini", "The Lord of the Rings (Set of 3 Books) Film tie-in International ed Edition (Paperback) :- J. R. R. Tolkien", "The Casual Vacancy 1st Edition (Hardcover) :- J. K. Rowling", "The Dark Tower: The Wind Through The Keyhole (Paperback) :- Stephen King", "Combo of The Immortals of Meluha (Paperback)", "The Blind Man's Garden (Hardcover) :- Nadeem Aslam", "The Racketeer (Paperback) :- John Grisham", "Life of Pi Signed illustrated ed Edition (Hardcover) :- Yann Martel", "21 New Beginnings: True Stories of Oddity, Hope & Change (Hardcover) :- Viveik Pandit", "The Skinning Tree (Hardcover) :- Srikumar Sen", "The War Ministry (Paperback) :- Krishan Partap Singh", "Midnight's Children (Paperback) :- Salman Rushdie", "The Last Man Export ed Edition (Paperback) :- Vince Flynn", "The Dalai Lama's Cat: A Novel 1st Edition (Paperback) :- David Michie", "Bring Up the Bodies (Paperback)", "The Complete Sherlock Holmes: All 4 Novels and 56 Short Stories (Set of 2 Volumes) Deluxe Edition (Paperback) :- Arthur Conan Doyle", "Revenge Wears Prada: The Devil Returns (Paperback) :- Lauren Weisberger", "Ifs, Buts Going Nuts (Paperback) :- Sonitha J Kapoor", "To Kill a Mockingbird 50th Anniversary Edition (Paperback)", "Train to Pakistan 01 Edition (Paperback)", "Animal Farm: A Fairy Story 1st Edition (Paperback) :- George Orwell",  "Malgudi Schooldays (Paperback) :- R. K. Narayan", "If Tomorrow Comes (Reissue) Edition (Paperback) :- Sidney Sheldon", "100 Selected Stories New ed Edition (Paperback) :- O. Henry", "100 Selected Stories New ed Edition (Paperback) :- O. Henry", "Things Fall Apart 1 Edition (Paperback)-:Chinua Achebe", "Death on the Nile 01 Edition (Paperback)", "The Bell Jar (Paperback) :- Sylvia Plath", "The Guide 01 Edition (Paperback) :- R. K. Narayan", "Three Men in a Boat (Paperback)", "A Tale Of Two Cities 1st Edition (Paperback) :- Charles Dickens" };
        int FICTP[]={0,234, 231, 341, 324, 431, 2654, 342, 543, 654, 234, 6345, 423, 312, 344, 399, 499, 399, 299, 699, 799, 299, 499, 599, 1299, 699, 99, 592, 399, 499, 599, 699, 499, 399, 499, 329, 239, 549, 559, 549, 543, 239, 329, 219, 249, 549, 239, 459, 239, 659, 399 };

        String FICTSELECT[]=new String[70];
        int FICTSELECTP[]=new int[70];
        String TFICTSELECT[]=new String[70];

        int ar1[]=displayFICT();
        
        if(ar1[0]==-1)
        
        System.out.println("You Havent Purchased Anything");
        
        
        
       else
       {
        System.out.println(" IN FICTIONS SECTION You Have Selected");
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=FICT[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10)
                System.out.println("(0"+c+")"+FICT[d]+h+"Rs."+FICTP[d]);

            else
                System.out.println("("+c+")"+FICT[d]+h+"Rs."+FICTP[d]);

        }
        System.out.println("Do you want to remove any book, if yes then enter the no. of the book else ENTER 'NO' to Bill");
        LOOP1:
        while(true)
        {

            
            String a=buf.readLine();

            LOOP2:
            for(int i=0;i<ar1.length;i++)
            {
                if(a.equalsIgnoreCase("NO") || ANAGRAM.areAnagrams("no", a)==1)
                    break LOOP1;

                int m=Integer.parseInt(a);
                if((i+1)==m)

                    ar1[i]=0;
            }

        }
        c=0;
        System.out.println(" NOW IN FICTIONS SECTION You Have Selected");
        for(int i=1;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=FICT[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10 && FICTP[d]>0)

                System.out.println("(0"+c+")"+FICT[d]+h+"Rs."+FICTP[d]);

            else if(FICTP[d]>0)
                System.out.println("("+c+")"+FICT[d]+h+"Rs."+FICTP[d]);

        }
        int qty[]=new int[62];
        System.out.println("\n\n*******************************ENTER QUANTITY FOR EACH BOOK*****************************************");
        c=0;
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=FICT[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10 && FICTP[d]>0)
            {
                System.out.println("\n(0"+c+")"+FICT[d]+h+"Rs."+FICTP[d]);
                qty[i]=TAKE.takeQty();
                FICTSELECT[i]=FICT[d];
                FICTSELECTP[i]=FICTP[d];
                TFICTSELECT[i]=FICT[d]+""+SPACEDOT.space(FICT[d].length())+qty[i]+"............."+""+Integer.toString(FICTP[d]);
            }

            else if(FICTP[d]>0)
            {
                System.out.println("("+c+")"+FICT[d]+h+"Rs."+FICTP[d]);
                qty[i]=TAKE.takeQty();
                FICTSELECT[i]=FICT[d];
                FICTSELECTP[i]=FICTP[d];
                TFICTSELECT[i]=(FICT[d]+""+SPACEDOT.space(FICT[d].length())+qty[i]+"............."+""+Integer.toString(FICTP[d]));
            }

        }
        
        c=0;
        int cou=0;
        int s=0;
        BILL_SHOW.showHeader();
        for(int i=0;i<ar1.length;i++)
        {

            if(FICTSELECT[i]!=null)
            {
                int p=FICTSELECT[i].length();
                String h=SPACEDOT.space(p);
                c++;
                cou=cou+1;
                int sq=qty[i]*FICTSELECTP[i];
                s=s+sq;
                String conv=Integer.toString(FICTSELECTP[i]);
                System.out.println(TFICTSELECT[i]+SPACEDOT.smallspace(conv.length())+sq);

            }

            if(FICTSELECT[i]==null && cou>0)
                break;

        }

        System.out.println("\n");
        for(int y=0;y<"Product-------------------------------------------------------------------------------------------------------------------------------------Qty-----------R".length();y++)
        {
            System.out.print(" ");
        }
        System.out.println("TOTAL BILL=>"+s); return s;
    }
       
    return (0);
    }

    
    
    public static int billNFICT()throws IOException
    {

        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(read);

        int c=0;
        String NFICT[]={"", "Discovery of India-: Pt. Jawaharlal Nehru", "Unbroken:WWII -:Laura Hillenbrand", "We Are Poor But So Many: The Story of Self-Employed Women in India-: Ela R. Bhatt ", "The Idea Of India-: Sunil Khilnani ", "ELEVEN RING-: Phil Jackson", "RUMSFELD'S RULES-: Donald Rumsfeld", "The Art of Choosing-:Sheena Iyengar", "The Diary of a Young Girl (Paperback) ", "Freakonomics: A Rogue Economist Explores the Hidden Side of Everything (Hardcover) by Steven D. Levitt (shelved 5107 times as non-fiction) ", "THE VARIETIES OF RELIGIOUS EXPERIENCE by William James", "THE AMERICAN LANGUAGE  by H. L. Mencken", "THE GENERAL THEORY OF EMPLOYMENT, INTEREST, AND MONEY  by John Maynard Keynes", "THE LIVES OF A CELL  by Lewis Thomas", "THE FRONTIER IN AMERICAN HISTORY  by Frederick Jackson Turner", "BLACK BOY  by Richard Wright", "ASPECTS OF THE NOVEL  by E. M. Forster", "THE PROPER STUDY OF MANKIND  by Isaiah Berlin", "THE NATURE AND DESTINY OF MAN  by Reinhold Niebuhr", "NOTES OF A NATIVE SON  by James Baldwin", "THE ELEMENTS OF STYLE  by William Strunk and E. B. White", "AN AMERICAN DILEMMA  by Gunnar Myrdal", "PRINCIPIA MATHEMATICA  by Alfred North Whitehead and Bertrand Russell", "THE MISMEASURE OF MAN  by Stephen Jay Gould", "THE MIRROR AND THE LAMP  by Meyer Howard Abrams", "THE ART OF THE SOLUBLE  by Peter B. Medawar", "THE ANTS  by Bert Hoelldobler and Edward O. Wilson", "A THEORY OF JUSTICE  by John Rawls", "ART AND ILLUSION  by Ernest H. Gombrich", "THE MAKING OF THE ENGLISH WORKING CLASS  by E. P. Thompson", "PHILOSOPHY AND CIVILIZATION  by John Dewey", ">THE AGE OF JACKSON , Arthur Schlesinger by Jr.", "THE MAKING OF THE ATOMIC BOMB  by Richard Rhodes", "BLACK LAMB AND GREY FALCON  by Rebecca West", "GOODBYE TO ALL THAT  by Robert Graves"};           
        int NFICTP[]={0, 456, 345, 145, 543, 125, 998, 376, 232, 213, 250, 2200, 2350, 400, 565, 2100, 260, 200, 211, 245, 345, 234, 243, 213, 345, 213, 333, 321, 435, 654, 121, 324, 412, 222, 232, 212};
       
        String NFICTSELECT[]=new String[70];
        int NFICTSELECTP[]=new int[70];
        String TNFICTSELECT[]=new String[70];

        int ar1[]=displayNFICT();
        
        if(ar1[0]==-1)
        
        System.out.println("You Havent Purchased Anything");
        
        else
        {
        System.out.println(" IN NON-FICTIONSSECTION You Have Selected");
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=NFICT[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10)
                System.out.println("(0"+c+")"+NFICT[d]+h+"Rs."+NFICTP[d]);

            else
                System.out.println("("+c+")"+NFICT[d]+h+"Rs."+NFICTP[d]);

        }
        System.out.println("Do you want to remove any book, if yes then enter the no. of the book else ENTER 'NO' to Bill");
        LOOP1:
        while(true)
        {

            
            String a=buf.readLine();

            LOOP2:
            for(int i=0;i<ar1.length;i++)
            {
                if(a.equalsIgnoreCase("NO") || ANAGRAM.areAnagrams("no", a)==1)
                    break LOOP1;

                int m=Integer.parseInt(a);
                if((i+1)==m)

                    ar1[i]=0;
            }

        }
        c=0;
        System.out.println(" NOW IN NON-FICTIONSSECTION You Have Selected");
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=NFICT[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10 && NFICTP[d]>0)

                System.out.println("(0"+c+")"+NFICT[d]+h+"Rs."+NFICTP[d]);

            else if(NFICTP[d]>0)
                System.out.println("("+c+")"+NFICT[d]+h+"Rs."+NFICTP[d]);

        }
        int qty[]=new int[62];
        System.out.println("\n\n*******************************ENTER QUANTITY FOR EACH BOOK*****************************************");
        c=0;
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=NFICT[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10 && NFICTP[d]>0)
            {
                System.out.println("\n(0"+c+")"+NFICT[d]+h+"Rs."+NFICTP[d]);
                qty[i]=TAKE.takeQty();
                NFICTSELECT[i]=NFICT[d];
                NFICTSELECTP[i]=NFICTP[d];
                TNFICTSELECT[i]=NFICT[d]+""+SPACEDOT.space(NFICT[d].length())+qty[i]+"............."+""+Integer.toString(NFICTP[d]);
            }

            else if(NFICTP[d]>0)
            {
                System.out.println("("+c+")"+NFICT[d]+h+"Rs."+NFICTP[d]);
                qty[i]=TAKE.takeQty();
                NFICTSELECT[i]=NFICT[d];
                NFICTSELECTP[i]=NFICTP[d];
                TNFICTSELECT[i]=(NFICT[d]+""+SPACEDOT.space(NFICT[d].length())+qty[i]+"............."+""+Integer.toString(NFICTP[d]));
            }

        }
        
        c=0;
        int cou=0;
        int s=0;
        BILL_SHOW.showHeader();
        for(int i=0;i<ar1.length;i++)
        {

            if(NFICTSELECT[i]!=null)
            {
                int p=NFICTSELECT[i].length();
                String h=SPACEDOT.space(p);
                c++;
                cou=cou+1;
                int sq=qty[i]*NFICTSELECTP[i];
                s=s+sq;
                String conv=Integer.toString(NFICTSELECTP[i]);
                System.out.println(TNFICTSELECT[i]+SPACEDOT.smallspace(conv.length())+sq);

            }

            if(NFICTSELECT[i]==null && cou>0)
                break;

        }

        System.out.println("\n");
        for(int y=0;y<"Product-------------------------------------------------------------------------------------------------------------------------------------Qty-----------R".length();y++)
        {
            System.out.print(" ");
        }
        System.out.println("TOTAL BILL=>"+s); return s;

    }
    
    return (0);
    }

    
    
    
    
    
    public static int billPOPSCI()throws IOException
    {

        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(read);

       
        String POPSCI[]={"","A Brief History of Time-:Stephen Hawking", "A Briefer history of time-: Stephen Hawking", "The Scientific Indian-:Dr. APJ Abdul Kalam", "The Chariots of the Gods-: Erich Von DaniKen", "Nature of Space and Time-: Hawking and Penrose", "Life and origin of Universe-: Bhaktivedanta Swami", "God Created The Integers-: Stephen Hawking", "A Short History of Nearly Everything (Paperback)", "A Short History of Nearly Everything (Paperback)  ","The Selfish Gene (Paperback)  by Richard Dawkins","The Immortal Life of Henrietta Lacks (Hardcover) ","The Elegant Universe: Superstrings, Hidden Dimensions, and the Quest for the Ultimate Theory (Paperback)","The Origin of Species (Hardcover) ","Cosmos (Paperback) by Carl Sagan ","The Demon-Haunted World: Science as a Candle in the Dark ","The Greatest Show on Earth: The Evidence for Evolution by Richard Dawkins ","The God Delusion (Hardcover) by Richard Dawkins","Guns, Germs, and Steel: The Fates of Human Societies (Paperback) by Jared Diamond ","Surely You're Joking, Mr. Feynman! (Paperback) ","The Grand Design (Hardcover) by Stephen Hawking","The Fabric of the Cosmos (Space, Time, and the Texture of Reality) ","The Disappearing Spoon: And Other True Tales of Madness, Love, and the History of the World from the Periodic Table of the Elements (Hardcover) ","Packing for Mars: The Curious Science of Life in the Void (Hardcover) ","The Ancestor's Tale: A Pilgrimage to the Dawn of Evolution ","Physics of the Impossible: A Scientific Exploration into the World of Phasers, Force Fields, Teleportation, and Time Travel (Hardcover) ","Chaos: The Making of a New Science (Paperback) ","Death by Black Hole: And Other Cosmic Quandaries (Hardcover) ","Gödel, Escher, Bach: An Eternal Golden Braid (Paperback) ","Pale Blue Dot: A Vision of the Human Future in Space ","The Hot Zone (Paperback) ","Spook: Science Tackles the Afterlife (Paperback) ","Genome: the Autobiography of a Species in 23 Chapters (Paperback) "}; 

        int POPSCIP[]={0,1099, 999, 657, 327, 564, 346, 674, 999, 657, 327, 564, 346, 999, 657, 327, 564, 346, 999, 657, 327, 564, 346, 999, 657, 327, 564, 346, 999, 657, 327, 564, 346};

        int c=0;
        String POPSCISELECT[]=new String[70];
        int POPSCISELECTP[]=new int[70];
        String TPOPSCISELECT[]=new String[70];

        int ar1[]=displayPOPSCI();
        
        if(ar1[0]==-1)
        
        System.out.println("You Havent Purchased Anything");
        
        else
        {
        System.out.println(" IN POPULAR SCIENCE SECTION You Have Selected");
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=POPSCI[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10)
                System.out.println("(0"+c+")"+POPSCI[d]+h+"Rs."+POPSCIP[d]);

            else
                System.out.println("("+c+")"+POPSCI[d]+h+"Rs."+POPSCIP[d]);

        }
        System.out.println("Do you want to remove any book, if yes then enter the no. of the book else ENTER 'NO' to Bill");
        LOOP1:
        while(true)
        {

            
            String a=buf.readLine();

            LOOP2:
            for(int i=0;i<ar1.length;i++)
            {
                if(a.equalsIgnoreCase("NO") || ANAGRAM.areAnagrams("no", a)==1)
                    break LOOP1;

                int m=Integer.parseInt(a);
                if((i+1)==m)

                    ar1[i]=0;
            }

        }
        c=0;
        System.out.println(" NOW IN POPULAR SCIENCE SECTION You Have Selected");
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=POPSCI[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10 && POPSCIP[d]>0)

                System.out.println("(0"+c+")"+POPSCI[d]+h+"Rs."+POPSCIP[d]);

            else if(POPSCIP[d]>0)
                System.out.println("("+c+")"+POPSCI[d]+h+"Rs."+POPSCIP[d]);

        }
        int qty[]=new int[62];
        System.out.println("\n\n*******************************ENTER QUANTITY FOR EACH BOOK*****************************************");
        c=0;
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=POPSCI[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10 && POPSCIP[d]>0)
            {
                System.out.println("\n(0"+c+")"+POPSCI[d]+h+"Rs."+POPSCIP[d]);
                qty[i]=TAKE.takeQty();
                POPSCISELECT[i]=POPSCI[d];
                POPSCISELECTP[i]=POPSCIP[d];
                TPOPSCISELECT[i]=POPSCI[d]+""+SPACEDOT.space(POPSCI[d].length())+qty[i]+"............."+""+Integer.toString(POPSCIP[d]);
            }

            else if(POPSCIP[d]>0)
            {
                System.out.println("("+c+")"+POPSCI[d]+h+"Rs."+POPSCIP[d]);
                qty[i]=TAKE.takeQty();
                POPSCISELECT[i]=POPSCI[d];
                POPSCISELECTP[i]=POPSCIP[d];
                TPOPSCISELECT[i]=(POPSCI[d]+""+SPACEDOT.space(POPSCI[d].length())+qty[i]+"............."+""+Integer.toString(POPSCIP[d]));
            }
        
        
        }
        
        c=0;
        int cou=0;
        int s=0;
        BILL_SHOW.showHeader();
        for(int i=0;i<ar1.length;i++)
        {

            if(POPSCISELECT[i]!=null)
            {
                int p=POPSCISELECT[i].length();
                String h=SPACEDOT.space(p);
                c++;
                cou=cou+1;
                int sq=qty[i]*POPSCISELECTP[i];
                s=s+sq;
                String conv=Integer.toString(POPSCISELECTP[i]);
                System.out.println(TPOPSCISELECT[i]+SPACEDOT.smallspace(conv.length())+sq);

            }

            if(POPSCISELECT[i]==null && cou>0)
                break;

        }

        System.out.println("\n");
        for(int y=0;y<"Product-------------------------------------------------------------------------------------------------------------------------------------Qty-----------R".length();y++)
        {
            System.out.print(" ");
        }
        System.out.println("TOTAL BILL=>"+s); return s;
    }
    
    return (0);
    

       
    }


    public static int billMAG()throws IOException
    {

        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(read);

        int c=0;
        String MAG[]={"", "Nat Geo Chunks (Global Monthly)-: NATIONAL GEOGRAPHIC CHANNEL", "POPSCI future of-:POPSCI(Monthly)", "Scholastic Yearbook 2013(Yearly)", "INFOPEDIA(Monthly)-ALL for Info & Tech", "MTG PCMB (monthly) for JEE", "CARS-: The ULTIMAT-um", "BSE-:Business BRUNCH", "Open  Current Affairs and Features Weekly","Tehelka  News  Weekly","Industry 2.0  Manufacturing Technology Updates and News  Monthly","CTO Forum  -  Monthly","Yo Vizag Lifestyle Monthly DSA Media","Puthiya Thalaimurai - A Weekly Tamil Magazine","Shair Urdu Magazine","Desh magazine","Rythubandhu","Sportstar","Outlook","India Today","Femina (India)","PCQuest","Dataquest - Fortnightly Information Technology","Sanctuary Asia","Himal","The Business Enterprise  Business  Monthly","The Week","Frontline","Electronics For You  Technology  Monthly","Elle Decor Magazine","India Today Travel Plus Magazine","Outlook Business And Careers 360 (Combo) Magazine","BBC Knowledge Magazine"};
        int MAGP[]={0,1399, 799, 699, 899, 1099, 499, 877, 799, 699, 899, 1099, 499, 799, 699, 899, 1099, 499, 799, 699, 899, 1099, 499, 799, 699, 899, 1099, 499, 799, 699, 899, 1099, 499};

        String MAGSELECT[]=new String[70];
        int MAGSELECTP[]=new int[70];
        String TMAGSELECT[]=new String[70];

        int ar1[]=displayMAG();
        
        if(ar1[0]==-1)
        
        System.out.println("You Havent Purchased Anything");
        
        else
        {
        System.out.println(" IN MAGAZINES SECTION You Have Selected");
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=MAG[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10)
                System.out.println("(0"+c+")"+MAG[d]+h+"Rs."+MAGP[d]);

            else
                System.out.println("("+c+")"+MAG[d]+h+"Rs."+MAGP[d]);

        }
        
        System.out.println("Do you want to remove any book, if yes then enter the no. of the book else ENTER 'NO' to Bill");
        LOOP1:
        while(true)
        {

            System.out.println("Do you want to remove any book, if yes then enter the no. of the book else ENTER 'NO' to Bill");
            String a=buf.readLine();

            LOOP2:
            for(int i=0;i<ar1.length;i++)
            {
                if(a.equalsIgnoreCase("NO") || ANAGRAM.areAnagrams("no", a)==1)
                    break LOOP1;

                int m=Integer.parseInt(a);
                if((i+1)==m)

                    ar1[i]=0;
            }

        }
        c=0;
        System.out.println(" NOW IN MAGAZINES SECTION You Have Selected");
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=MAG[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10 && MAGP[d]>0)

                System.out.println("(0"+c+")"+MAG[d]+h+"Rs."+MAGP[d]);

            else if(MAGP[d]>0)
                System.out.println("("+c+")"+MAG[d]+h+"Rs."+MAGP[d]);

        }
        int qty[]=new int[62];
        System.out.println("\n\n*******************************ENTER QUANTITY FOR EACH BOOK*****************************************");
        c=0;
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=MAG[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10 && MAGP[d]>0)
            {
                System.out.println("\n(0"+c+")"+MAG[d]+h+"Rs."+MAGP[d]);
                qty[i]=TAKE.takeQty();
                MAGSELECT[i]=MAG[d];
                MAGSELECTP[i]=MAGP[d];
                TMAGSELECT[i]=MAG[d]+""+SPACEDOT.space(MAG[d].length())+qty[i]+"............."+""+Integer.toString(MAGP[d]);
            }

            else if(MAGP[d]>0)
            {
                System.out.println("("+c+")"+MAG[d]+h+"Rs."+MAGP[d]);
                qty[i]=TAKE.takeQty();
                MAGSELECT[i]=MAG[d];
                MAGSELECTP[i]=MAGP[d];
                TMAGSELECT[i]=(MAG[d]+""+SPACEDOT.space(MAG[d].length())+qty[i]+"............."+""+Integer.toString(MAGP[d]));
            }

        }
        
        c=0;
        int cou=0;
        int s=0;
        BILL_SHOW.showHeader();
        for(int i=0;i<ar1.length;i++)
        {

            if(MAGSELECT[i]!=null)
            {
                int p=MAGSELECT[i].length();
                String h=SPACEDOT.space(p);
                c++;
                cou=cou+1;
                int sq=qty[i]*MAGSELECTP[i];
                s=s+sq;
                String conv=Integer.toString(MAGSELECTP[i]);
                System.out.println(TMAGSELECT[i]+SPACEDOT.smallspace(conv.length())+sq);

            }

            if(MAGSELECT[i]==null && cou>0)
                break;

        }

        System.out.println("\n");
        for(int y=0;y<"Product-------------------------------------------------------------------------------------------------------------------------------------Qty-----------R".length();y++)
        {
            System.out.print(" ");
        }
        System.out.println("TOTAL BILL=>"+s); return s;
    }
    
    return(0);

        
    }

    
    public static int billREF()throws IOException
    {

        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(read);

        int c=0;
        String REF[]={"", "Oxford English Dictionary-ADVANCED", "Cambridge Syndicate Mathematical log book- Powell", "Oxford Dictionary of Physics", "Oxford Dictionary of Chemistry", "Table of Chemical valencies and periodicity of elements", "Units, Distances, Symbols- Standard Internaccional", "Standards for Mid-Range Trajectory and Projectile height locus", "India 2013 (Paperback) by Government of India (Ministry of Information Broadcasting)","Manorama Yearbook 2013 with Free Encylopaedia Britannica","Geography of India 4 Edition (Paperback) by Majid Husain","Key To High School English Grammar & Composition ","Advanced Learner's Dictionary 8 Edition (Paperback) by A S Hornby","Oxford School Atlas (With CD) (Paperback) by Oxford University Press","Oxford Student Atlas for India 2nd Edition (Paperback) by Oxford University Press","Oxford Advanced Learner's Dictionary 8th Edition (Hardcover) by Oxford University Press","Pocket Oxford English Dictionary 10th Edition (Hardcover) by Oxford Dictionary","The Book of Indian Birds 13th Edition (Hardcover) by Salim Ali","I, Steve: Steve Jobs in his own words (Paperback)","The Pearson Concise General Knowledge Manual 2013 (Paperback) by Edgar Thorpe","Oxford Hindi–English Dictionary (Hindi, English) 1st Edition (Paperback) by R. S. McGregor","Reactions, Rearrangements & Reagents, Sanyal (Paperback) by S. N. Sanyal","Yearbook 2013 (Paperback)","Current Affairs Annual Issue 2013 PB by Singh A P","Dictionary of Economics (Paperback)","Concise Medical Dictionary 8th Edition (Paperback) by Elizabeth A. Martin","Oxford Dictionary of Chemistry 6th Edition (Paperback) by John Daintith","The Oxford Dictionary of Philosophy 2nd Edition (Paperback) by Simon Blackburn","Oxford Dictionary Of Biomedicine (Paperback) by John Lackie","The Oxford Dictionary Of Literary Terms 3rd Edition (Paperback) by Chris Baldick","The Concise Oxford Dictionary of Mathematics 4th Edition (Paperback) byChristopher Clapham, James Nicholson","The Oxford Dictionary of Synonyms and Antonyms 2nd Edition (Paperback) byOxford Dictionary","Oxford Essential French Dictionary 1st Edition (Paperback) by Oxford Dictionary","Oxford Dictionary of Biology 6th Edition (Paperback)",};
        int REFP[]={0, 345, 541, 234, 200, 400, 500, 345, 541, 234, 200, 400, 500, 345, 541, 234, 200, 400, 500, 345, 541, 234, 200, 400, 500, 345, 541, 234, 200, 400, 500, 345, 541, 234};


        String REFSELECT[]=new String[70];
        int REFSELECTP[]=new int[70];
        String TREFSELECT[]=new String[70];

        int ar1[]=displayREF();
        
        if(ar1[0]==-1)
        
        System.out.println("You Havent Purchased Anything");
        
        else
        {
        System.out.println(" IN REFERENCES SECTION You Have Selected");
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=REF[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10)
                System.out.println("(0"+c+")"+REF[d]+h+"Rs."+REFP[d]);

            else
                System.out.println("("+c+")"+REF[d]+h+"Rs."+REFP[d]);

        }
        
        System.out.println("Do you want to remove any book, if yes then enter the no. of the book else ENTER 'NO' to Bill");
        LOOP1:
        while(true)
        {


            String a=buf.readLine();

            LOOP2:
            for(int i=0;i<ar1.length;i++)
            {
                if(a.equalsIgnoreCase("NO") || ANAGRAM.areAnagrams("no", a)==1)
                    break LOOP1;

                int m=Integer.parseInt(a);
                if((i+1)==m)

                    ar1[i]=0;
            }

        }
        c=0;
        System.out.println(" NOW IN REFERENCES SECTION You Have Selected");
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=REF[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10 && REFP[d]>0)

                System.out.println("(0"+c+")"+REF[d]+h+"Rs."+REFP[d]);

            else if(REFP[d]>0)
                System.out.println("("+c+")"+REF[d]+h+"Rs."+REFP[d]);

        }
        int qty[]=new int[62];
        System.out.println("\n\n*******************************ENTER QUANTITY FOR EACH BOOK*****************************************");
        c=0;
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=REF[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10 && REFP[d]>0)
            {
                System.out.println("\n(0"+c+")"+REF[d]+h+"Rs."+REFP[d]);
                qty[i]=TAKE.takeQty();
                REFSELECT[i]=REF[d];
                REFSELECTP[i]=REFP[d];
                TREFSELECT[i]=REF[d]+""+SPACEDOT.space(REF[d].length())+qty[i]+"............."+""+Integer.toString(REFP[d]);
            }

            else if(REFP[d]>0)
            {
                System.out.println("("+c+")"+REF[d]+h+"Rs."+REFP[d]);
                qty[i]=TAKE.takeQty();
                REFSELECT[i]=REF[d];
                REFSELECTP[i]=REFP[d];
                TREFSELECT[i]=(REF[d]+""+SPACEDOT.space(REF[d].length())+qty[i]+"............."+""+Integer.toString(REFP[d]));
            }

        }
        
        c=0;
        int cou=0;
        int s=0;
        BILL_SHOW.showHeader();
        for(int i=0;i<ar1.length;i++)
        {

            if(REFSELECT[i]!=null)
            {
                int p=REFSELECT[i].length();
                String h=SPACEDOT.space(p);
                c++;
                cou=cou+1;
                int sq=qty[i]*REFSELECTP[i];
                s=s+sq;
                String conv=Integer.toString(REFSELECTP[i]);
                System.out.println(TREFSELECT[i]+SPACEDOT.smallspace(conv.length())+sq);

            }

            if(REFSELECT[i]==null && cou>0)
                break;

        }

        System.out.println("\n");
        for(int y=0;y<"Product-------------------------------------------------------------------------------------------------------------------------------------Qty-----------R".length();y++)
        {
            System.out.print(" ");
        }
        System.out.println("TOTAL BILL=>"+s); return s;
    }
    return (0);
        
    }

    
    
     
    public static int billFOOD()throws IOException
    {

        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(read);

        int c=0;
        String FOOD[]= {"", "Oh Calcutta: Cookbook (Paperback) by Anjan Chatterjee", "Highway On My Plate: The Indian Guide To Roadside Eating (Paperback) by Rocky Singh, Mayur Sharma", "Chicken Recipes (Paperback) by Sanjeev Kapoor", "Cooking With Love: Vegetarian Recipes From My Mother's Kitchen (Hardcover) by Sanjeev Kapoor", "The Mainland China Cookbook (Paperback) by Anjan Chatterjee", "Tea 1st Edition (Hardcover)","Modernist Cuisine: The Art and Science of Cooking (Boxed Set) by Nathan Myhrvold,Chris Young, Maxime Bilet","The Oxford Encyclopedia of Food and Drink in America: 3-Volume Set (Hardcover) by Bruce Kraig","Simple Home Baking (Paperback) by Sanjeev Kapoor","Cakes And Bakes (Paperback) by Sanjeev Kapoor","Nm Breakfast Recipes -Vegetarian (Paperback) by Nita Mehta","Rice,Biryani and Pulao (NON-VEG) (Paperback) by Sanjeev Kapoor","How the Banana Goes to Heaven (Paperback) by Ratna Rajaiah","Eggless Desserts (Paperback) by Nita Mehta","Essential Kerala Cookbook (Paperback)","101 KERALADELICACIES (Paperback)by G. Padma Vijay","Khanna Khazana Bhartiya Vyanjanon Ka Utsav (Hindi) (Hardcover) by Sanjeev Kapoor","How to Be a Domestic Goddess : Baking and the Art of Comfort Cooking (Paperback) by Nigella Lawson","100 Favourite Hand Picked Recipes (Paperback) by Sanjeev Kapoor","Vegetarian Rice, Biryani and Pulao (Paperback) by Sanjeev Kapoor","Rasachandrika: Saraswat Cookery Book (Paperback) by S. MahilaSamaj","Bengali Cuisine: India on My Plate (Paperback) by Aditi Das","Modern Cookery for Teaching and the Trade (Volume - 2) 6th Edition (Paperback) by Thangam E. Philip","My Great India Cookbook (Hardcover) by Vikas Khanna","Tikkas & Kebabs (Chefs Special) (Paperback) by MASTER CHEFS OF INDIA"};
        int FOODP[]={0,212, 242, 213, 233, 124, 211, 233, 243, 323, 129, 199, 176, 287, 234, 298, 342, 231, 213, 143, 123, 154, 123, 198, 156, 78, 323, 235, 212, 321, 324, 125, 345, 323, 333, 222, 122, 323};

        String FOODSELECT[]=new String[62];
        int FOODSELECTP[]=new int[62];
        String TFOODSELECT[]=new String[62];

        int ar1[]=displayFOOD();
        
        if(ar1[0]==-1)
        
        System.out.println("You Havent Purchased Anything");
        
        else
        {
            
        System.out.println(" IN FOODS & BEVERAGES SECTION You Have Selected");
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=FOOD[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10)
                System.out.println("(0"+c+")"+FOOD[d]+h+"Rs."+FOODP[d]);

            else
                System.out.println("("+c+")"+FOOD[d]+h+"Rs."+FOODP[d]);

        }
        System.out.println("Do you want to remove any book, if yes then enter the no. of the book else ENTER 'NO' to Bill");
        LOOP1:
        while(true)
        {

            
            String a=buf.readLine();

            LOOP2:
            for(int i=0;i<ar1.length;i++)
            {
                if(a.equalsIgnoreCase("NO") || ANAGRAM.areAnagrams("no", a)==1)
                    break LOOP1;

                int m=Integer.parseInt(a);
                if((i+1)==m)
                
                    
                    ar1[i]=0;
                    
            }

        }
        c=0;
        System.out.println(" NOW IN FOODS & BEVERAGES SECTION You Have Selected");
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=FOOD[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10 && FOODP[d]>0)

                System.out.println("(0"+c+")"+FOOD[d]+h+"Rs."+FOODP[d]);

            else if(FOODP[d]>0)
                System.out.println("("+c+")"+FOOD[d]+h+"Rs."+FOODP[d]);

        }
        int qty[]=new int[62];
        System.out.println("\n\n*******************************ENTER QUANTITY FOR EACH BOOK*****************************************");
        c=0;
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=FOOD[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10 && FOODP[d]>0)
            {
                System.out.println("\n(0"+c+")"+FOOD[d]+h+"Rs."+FOODP[d]);
                qty[i]=TAKE.takeQty();
                FOODSELECT[i]=FOOD[d];
                FOODSELECTP[i]=FOODP[d];
                TFOODSELECT[i]=FOOD[d]+""+SPACEDOT.space(FOOD[d].length())+qty[i]+"............."+""+Integer.toString(FOODP[d]);
            }

            else if(FOODP[d]>0)
            {
                System.out.println("("+c+")"+FOOD[d]+h+"Rs."+FOODP[d]);
                qty[i]=TAKE.takeQty();
                FOODSELECT[i]=FOOD[d];
                FOODSELECTP[i]=FOODP[d];
                TFOODSELECT[i]=(FOOD[d]+""+SPACEDOT.space(FOOD[d].length())+qty[i]+"............."+""+Integer.toString(FOODP[d]));
            }

        }
        
        c=0;
        int cou=0;
        int s=0;
        BILL_SHOW.showHeader();
        for(int i=0;i<ar1.length;i++)
        {

            if(FOODSELECT[i]!=null)
            {
                int p=FOODSELECT[i].length();
                String h=SPACEDOT.space(p);
                c++;
                cou=cou+1;
                int sq=qty[i]*FOODSELECTP[i];
                s=s+sq;
                String conv=Integer.toString(FOODSELECTP[i]);
                System.out.println(TFOODSELECT[i]+SPACEDOT.smallspace(conv.length())+sq);

            }

            if(FOODSELECT[i]==null && cou>0)
                break;

        }

        System.out.println("\n");
        for(int y=0;y<"Product-------------------------------------------------------------------------------------------------------------------------------------Qty-----------R".length();y++)
        {
            System.out.print(" ");
        }

        System.out.println("TOTAL BILL=>"+s); return s;
    }
    return (0);
        
        

        

    }
    
    
    public static int billSELFHELP()throws IOException
    {

        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(read);

        int c=0;
        String SELFHELP[]= {"", "Practising Spiritual Intelligence : For Innovation, Leadership and Happiness (Paperback)", "Don't Slap Your Wife But don't Get Slapped Either (Paperback) by Sunil Vaid", "The Now Effect : How a Mindful Moment can Change The Rest of Your Life (Paperback) by Elisha Goldstien", "The Secret (Hardcover)", "The 7 Habits Of Highly Effective People (Paperback) by Stephen R. Covey", "Combo of The Power of Your Subconscious Mind (Paperback)","Beating the Blues: A Complete Guide to Overcoming Depression (Paperback)","Management Mantras: Keys to Effective Management and Leadership (Paperback)","The 7 Minute Solution: Time Strategies to Prioritize, Organize and Simplify Your Life at Work and at Home (Paperback)","The Golden Collection Box Set (Paperback)","Speak Up, Speak Out : My Favourite Elocution Pieces and How to Deliver Them (Paperback)","Exclusive Stephen R. Covey (Set of 3 Books) (Paperback)","The Monk Who Sold His Ferrari (Paperback)","And the Lion Smiled At the Rabbit : Manage Emotions to Win (Paperback)","Why So Stupid (Paperback)","Who Will Cry When You Die? (Paperback)","The Power of Your Subconscious Mind (Paperback)","Don't Feel Stupid At 60 (Paperback)","Golden Cloud, Silver Lining: Lessons from the Masters on Happiness & Longevity (Paperback)","The Great Thoughts on Self-Improvement, Relaxation, Friendship, Happiness, Success, Marriage and Life (Paperback)","The Robin Sharma Pack (Set Of 10 Volumes) (Paperback)","Meditation (Paperback)","Wishes Fulfilled: Mastering The Art Of Manifesting (Paperback)","Seven Spiritual Laws of Success: A Pocket Guide to Fulfilling Your Dreams (Hardcover)","Seed of Genius: Nurture Your Natural Multiple Intelligences (Paperback) by Ankur Gupta","An Idiot, Placements And IntervYou (Paperback) by Toffee","Rajini's Punchtantra: Business and Life Management the Rajinikanth Way (Paperback) by P.C. Balasubramanian, Raja Krishnamoorthy","How to Be Brilliant: Change your ways in 90 days! 3rd Edition (Paperback) byMichael Heppell","Life is Fundamentally Management (Paperback) by A. Senthivel, Govind Babu","Body Language In The Work Place (Paperback) by Allan, Barbara Pease","How To Win Friends And Influence People (Paperback) by Dale Carnegie","The Definitive Book of Body Language (Paperback) by Allan, Barbara Pease","How Will You Measure Your Life? (Paperback)",};
        int SELFHELPP[]={0, 250, 2200, 2350, 400, 565,250, 2200, 2350, 400, 565,250, 2200, 2350, 400, 565,250, 2200, 2350, 400, 565,250, 2200, 2350, 400, 565,250, 2200, 2350, 232, 232};
        
        String SELFHELPSELECT[]=new String[62];
        int SELFHELPSELECTP[]=new int[62];
        String TSELFHELPSELECT[]=new String[62];

        int ar1[]=displaySELFHELP();
        
        if(ar1[0]==-1)
        
        System.out.println("You Havent Purchased Anything");
        
        else
        {
        System.out.println(" IN SELF-HELP SECTION You Have Selected");
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=SELFHELP[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10)
                System.out.println("(0"+c+")"+SELFHELP[d]+h+"Rs."+SELFHELPP[d]);

            else
                System.out.println("("+c+")"+SELFHELP[d]+h+"Rs."+SELFHELPP[d]);

        }
        System.out.println("Do you want to remove any book, if yes then enter the no. of the book else ENTER 'NO' to Bill");
        LOOP1:
        while(true)
        {

            
            String a=buf.readLine();

            LOOP2:
            for(int i=0;i<ar1.length;i++)
            {
                if(a.equalsIgnoreCase("NO") || ANAGRAM.areAnagrams("no", a)==1)
                    break LOOP1;

                int m=Integer.parseInt(a);
                if((i+1)==m)
                
                    
                    ar1[i]=0;
                    
            }

        }
        c=0;
        System.out.println(" NOW IN SELF-HELP SECTION You Have Selected");
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=SELFHELP[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10 && SELFHELPP[d]>0)

                System.out.println("(0"+c+")"+SELFHELP[d]+h+"Rs."+SELFHELPP[d]);

            else if(SELFHELPP[d]>0)
                System.out.println("("+c+")"+SELFHELP[d]+h+"Rs."+SELFHELPP[d]);

        }
        int qty[]=new int[62];
        System.out.println("\n\n*******************************ENTER QUANTITY FOR EACH BOOK*****************************************");
        c=0;
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=SELFHELP[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10 && SELFHELPP[d]>0)
            {
                System.out.println("\n(0"+c+")"+SELFHELP[d]+h+"Rs."+SELFHELPP[d]);
                qty[i]=TAKE.takeQty();
                SELFHELPSELECT[i]=SELFHELP[d];
                SELFHELPSELECTP[i]=SELFHELPP[d];
                TSELFHELPSELECT[i]=SELFHELP[d]+""+SPACEDOT.space(SELFHELP[d].length())+qty[i]+"............."+""+Integer.toString(SELFHELPP[d]);
            }

            else if(SELFHELPP[d]>0)
            {
                System.out.println("("+c+")"+SELFHELP[d]+h+"Rs."+SELFHELPP[d]);
                qty[i]=TAKE.takeQty();
                SELFHELPSELECT[i]=SELFHELP[d];
                SELFHELPSELECTP[i]=SELFHELPP[d];
                TSELFHELPSELECT[i]=(SELFHELP[d]+""+SPACEDOT.space(SELFHELP[d].length())+qty[i]+"............."+""+Integer.toString(SELFHELPP[d]));
            }

        }
        
        c=0;
        int cou=0;
        int s=0;
        BILL_SHOW.showHeader();
        for(int i=0;i<ar1.length;i++)
        {

            if(SELFHELPSELECT[i]!=null)
            {
                int p=SELFHELPSELECT[i].length();
                String h=SPACEDOT.space(p);
                c++;
                cou=cou+1;
                int sq=qty[i]*SELFHELPSELECTP[i];
                s=s+sq;
                String conv=Integer.toString(SELFHELPSELECTP[i]);
                System.out.println(TSELFHELPSELECT[i]+SPACEDOT.smallspace(conv.length())+sq);

            }

            if(SELFHELPSELECT[i]==null && cou>0)
                break;

        }

        System.out.println("\n");
        for(int y=0;y<"Product-------------------------------------------------------------------------------------------------------------------------------------Qty-----------R".length();y++)
        {
            System.out.print(" ");
        }

        System.out.println("TOTAL BILL=>"+s); return s;

    }
    return (0);
        

        

    }
    
    public static int billBIO()throws IOException
    {

        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(read);

        int c=0;
       String BIO[]= {"", "Dongri To Dubai: Six Decades of The Mumbai Mafia (Paperback) by S Hussain Zaidi", "Steve Jobs: The Exclusive Biography (Hardcover) by Walter Isaacson", "Wings of Fire: An Autobiography 1st Edition (Paperback) by APJ Abdul Kalam, Arun Tiwari", "The Race of My Life : An Autobiography (Paperback)", "My Encounter with IIT JEE: The Story of Preparation (Paperback) by Arpit Agrawal", "The Freethinker's Prayer Book (Hardcover) by Khushwant Singh","Playing to Win (Paperback) by Saina Nehwal","Combo of Indira: The Life Of Indira Nehru Gandhi (Paperback)","My World in Cricket (Hardcover) by Stuart Broad","14 Hours: An Insider's Account of the 26/11 Taj Attack (Paperback) by Ankur Chawla","Impatient Optimist: Bill Gates in his Own Words (Paperback)","Conversations with Mani Ratnam (Hardcover) by Baradwaj Rangan","Total Recall: My Unbelievably True Life Story (Paperback) by Arnold Schwarzenegger","Neerh Ka Nirman Phir (Hindi) Rajpal & Sons Edition (Hardcover) by Harivansh Rai Bachchan","Mohammed Rafi (Paperback) by Yasmin Khalid Rafi","The Last Lecture (Paperback) by Randy Pausch","The Test of My Life from Cricket to Cancer and Back (Hardcover) by Yuvraj Singh,Sharda Ugra, Nishant Jeet Arora","Rahul Dravid: Timeless Steel (Hardcover) by ESPN Cricinfo","Mein Kampf (Paperback) by Adolf Hitler","A complete biography of Abraham Lincoln (Paperback)","Why I Failed: Lessons from Leaders (Paperback) by Shweta Punj","Autobiography Of A Yogi (Paperback) by Sri Sri Paramahansa Yogananda","Before Memory Fades: An Autobiography (Paperback) by Fali S. Nariman","M. K. Gandhi - An Autobiography Or The Story Of My Experiments With Truth (Paperback) by M K Gandhi","The Man Who Knew Infinity [Srinivasa Ramanujan] (Paperback) by KANIGEL ROBERT","Open : an Autobiography (Paperback)",};
        int BIOP[]={0, 250, 2200, 2350, 400, 565, 2200, 2350, 400, 565, 2200, 2350, 400, 565, 2200, 2350, 400, 565, 2200, 2350, 400, 565, 2200, 2350, 400, 565, 340};
        
        String BIOSELECT[]=new String[62];
        int BIOSELECTP[]=new int[62];
        String TBIOSELECT[]=new String[62];

        int ar1[]=displayBIO();
        System.out.println(" IN BIOGRAPHIES and AUTOBIOGRAPHIES SECTION You Have Selected");
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=BIO[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10)
                System.out.println("(0"+c+")"+BIO[d]+h+"Rs."+BIOP[d]);

            else
                System.out.println("("+c+")"+BIO[d]+h+"Rs."+BIOP[d]);

        }
        System.out.println("Do you want to remove any book, if yes then enter the no. of the book else ENTER 'NO' to Bill");
        LOOP1:
        while(true)
        {

            
            String a=buf.readLine();

            LOOP2:
            for(int i=0;i<ar1.length;i++)
            {
                if(a.equalsIgnoreCase("NO") || ANAGRAM.areAnagrams("no", a)==1)
                    break LOOP1;

                int m=Integer.parseInt(a);
                if((i+1)==m)
                
                    
                    ar1[i]=0;
                    
            }

        }
        c=0;
        System.out.println(" NOW IN BIOGRAPHIES and AUTOBIOGRAPHIES SECTION You Have Selected");
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=BIO[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10 && BIOP[d]>0)

                System.out.println("(0"+c+")"+BIO[d]+h+"Rs."+BIOP[d]);

            else if(BIOP[d]>0)
                System.out.println("("+c+")"+BIO[d]+h+"Rs."+BIOP[d]);

        }
        int qty[]=new int[62];
        System.out.println("\n\n*******************************ENTER QUANTITY FOR EACH BOOK*****************************************");
        c=0;
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=BIO[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10 && BIOP[d]>0)
            {
                System.out.println("\n(0"+c+")"+BIO[d]+h+"Rs."+BIOP[d]);
                qty[i]=TAKE.takeQty();
                BIOSELECT[i]=BIO[d];
                BIOSELECTP[i]=BIOP[d];
                TBIOSELECT[i]=BIO[d]+""+SPACEDOT.space(BIO[d].length())+qty[i]+"............."+""+Integer.toString(BIOP[d]);
            }

            else if(BIOP[d]>0)
            {
                System.out.println("("+c+")"+BIO[d]+h+"Rs."+BIOP[d]);
                qty[i]=TAKE.takeQty();
                BIOSELECT[i]=BIO[d];
                BIOSELECTP[i]=BIOP[d];
                TBIOSELECT[i]=(BIO[d]+""+SPACEDOT.space(BIO[d].length())+qty[i]+"............."+""+Integer.toString(BIOP[d]));
            }

        }
        
        c=0;
        int cou=0;
        int s=0;
        BILL_SHOW.showHeader();
        for(int i=0;i<ar1.length;i++)
        {

            if(BIOSELECT[i]!=null)
            {
                int p=BIOSELECT[i].length();
                String h=SPACEDOT.space(p);
                c++;
                cou=cou+1;
                int sq=qty[i]*BIOSELECTP[i];
                s=s+sq;
                String conv=Integer.toString(BIOSELECTP[i]);
                System.out.println(TBIOSELECT[i]+SPACEDOT.smallspace(conv.length())+sq);

            }

            if(BIOSELECT[i]==null && cou>0)
                break;

        }

        System.out.println("\n");
        for(int y=0;y<"Product-------------------------------------------------------------------------------------------------------------------------------------Qty-----------R".length();y++)
        {
            System.out.print(" ");
        }

        System.out.println("TOTAL BILL=>"+s); return s;

        
        

        

    }

    
      public static int billBESTSELLERS()throws IOException
    {

        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(read);

        int c=0;
        
       String BESTSELLERS[]= { "", "A tale of 2 cities by Charles Dickens","The Lord of Rings by J.R.R Tolkein","Le Petit Prince (The Little Prince) by Antoine de Saint-Exupéry","The Hobbit by J. R. R. Tolkien","And Then There Were None by Agatha Cristie","The Lion, the Witch and the Wardrobe by C. S. Lewis","She: A History of Adventure by H. Rider Haggard","The Da Vinci Code by Dan Brown","Think and Grow Rich by Napoleon Hill","The Catcher in the Rye by J. D. Salinger",};
        int BESTSELLERSP[]={0, 250, 2200, 2350, 400, 565, 250, 2200, 2350, 400, 565};
       
        String BESTSELLERSSELECT[]=new String[62];
        int BESTSELLERSSELECTP[]=new int[62];
        String TBESTSELLERSSELECT[]=new String[62];

        int ar1[]=displayBESTSELLERS();
        System.out.println(" IN BESTSELLERS SECTION You Have Selected");
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=BESTSELLERS[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10)
                System.out.println("(0"+c+")"+BESTSELLERS[d]+h+"Rs."+BESTSELLERSP[d]);

            else
                System.out.println("("+c+")"+BESTSELLERS[d]+h+"Rs."+BESTSELLERSP[d]);

        }
        System.out.println("Do you want to remove any book, if yes then enter the no. of the book else ENTER 'NO' to Bill");
        LOOP1:
        while(true)
        {

            
            String a=buf.readLine();

            LOOP2:
            for(int i=0;i<ar1.length;i++)
            {
                if(a.equalsIgnoreCase("NO") || ANAGRAM.areAnagrams("no", a)==1)
                    break LOOP1;

                int m=Integer.parseInt(a);
                if((i+1)==m)
                
                    
                    ar1[i]=0;
                    
            }

        }
        c=0;
        System.out.println(" NOW IN BESTSELLERS SECTION You Have Selected");
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=BESTSELLERS[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10 && BESTSELLERSP[d]>0)

                System.out.println("(0"+c+")"+BESTSELLERS[d]+h+"Rs."+BESTSELLERSP[d]);

            else if(BESTSELLERSP[d]>0)
                System.out.println("("+c+")"+BESTSELLERS[d]+h+"Rs."+BESTSELLERSP[d]);

        }
        int qty[]=new int[62];
        System.out.println("\n\n*******************************ENTER QUANTITY FOR EACH BOOK*****************************************");
        c=0;
        for(int i=0;i<ar1.length;i++)
        {

            int d=ar1[i];
            if(d==-1)
                break;

            int p=BESTSELLERS[d].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10 && BESTSELLERSP[d]>0)
            {
                System.out.println("\n(0"+c+")"+BESTSELLERS[d]+h+"Rs."+BESTSELLERSP[d]);
                qty[i]=TAKE.takeQty();
                BESTSELLERSSELECT[i]=BESTSELLERS[d];
                BESTSELLERSSELECTP[i]=BESTSELLERSP[d];
                TBESTSELLERSSELECT[i]=BESTSELLERS[d]+""+SPACEDOT.space(BESTSELLERS[d].length())+qty[i]+"............."+""+Integer.toString(BESTSELLERSP[d]);
            }

            else if(BESTSELLERSP[d]>0)
            {
                System.out.println("("+c+")"+BESTSELLERS[d]+h+"Rs."+BESTSELLERSP[d]);
                qty[i]=TAKE.takeQty();
                BESTSELLERSSELECT[i]=BESTSELLERS[d];
                BESTSELLERSSELECTP[i]=BESTSELLERSP[d];
                TBESTSELLERSSELECT[i]=(BESTSELLERS[d]+""+SPACEDOT.space(BESTSELLERS[d].length())+qty[i]+"............."+""+Integer.toString(BESTSELLERSP[d]));
            }

        }
        
        c=0;
        int cou=0;
        int s=0;
        BILL_SHOW.showHeader();
        for(int i=0;i<ar1.length;i++)
        {

            if(BESTSELLERSSELECT[i]!=null)
            {
                int p=BESTSELLERSSELECT[i].length();
                String h=SPACEDOT.space(p);
                c++;
                cou=cou+1;
                int sq=qty[i]*BESTSELLERSSELECTP[i];
                s=s+sq;
                String conv=Integer.toString(BESTSELLERSSELECTP[i]);
                System.out.println(TBESTSELLERSSELECT[i]+SPACEDOT.smallspace(conv.length())+sq);

            }

            if(BESTSELLERSSELECT[i]==null && cou>0)
                break;

        }

        System.out.println("\n");
        for(int y=0;y<"Product-------------------------------------------------------------------------------------------------------------------------------------Qty-----------R".length();y++)
        {
            System.out.print(" ");
        }

        System.out.println("TOTAL BILL=>"+s); return s;

        
        

        

    }
    
    
    
    
    
    
    
}

