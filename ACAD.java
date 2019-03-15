import java.io.*;
public class ACAD extends FICT
{
    public static int[] displayACAD()throws IOException
    {
        int c=0;

        String ACAD[]= {"Concise maths-: SP Tripathi", "MTG JEE main 30 days course", "MTG JEE advanced 30 days course", "ICSE Preparation Book", "JD Lee concise inorganic chemistry", "IB Diploma Physics-: Sam Jijnamb", "Total HCG I & II ICSE", "Total English I ICSE", "Total English II ICSE", "Total Maths ICSE", "A textbook of ICSE Biology for class 10-: Anita Prasad", "A Textbook of ICSE Chemistry for class 10-: Anita Prasad", "A Textbook of ICSE Mathematics for class 10-: OP Sinhal ", "A textbook of ICSE Biology for class 9-: Anita Prasad", "A Textbook of ICSE Chemistry for class 9-: Anita Prasad ", "A Textbook of ICSE Mathematics for class 9-: OP Sinhal ", "Gadya Sankalan WorkBook for class 9-10 ICSE", "Ekanki Suman WorkBook for class 10 ICSE", "Treasure Trove Of Short Stories Workbook for class 10 ICSE", "Golden lyre Workbook for class 10 ICSE", "As You Like It Workbook for class 10 ICSE", "Together with ICSE Mathematics for class 9", "Together with ICSE Physics for class 9", "Together with ICSE Biology for class 9", "Together with ICSE History and Civics for class 9", "Together with ICSE Chemistry for class 9", "Together with ICSE Geography for class 9", "Together with ICSE Computer applications for class 9","Together with ICSE English 1 for class 9-10","Together with ICSE Hindi for class 9-10","Together with ICSE English 2 for class 9", "Together with ICSE Mathematics for class 10","Together with ICSE Physics for class 10","Together with ICSE Chemistry for class 10", "Together with ICSE Biology for class 10", "Together with ICSE History and civics for class 10", "Together with ICSE Geography for class 10", "Together with ICSE Computer Applications for class 10", "CBSE Mathematics class 10", "CBSE Science class 10", "CBSE Social Sciences", "ICSE Bengali complete course class 9-10", "Objective chemistry workbook for class 10 ICSE", "ISC Physics", "ISC Chemistry", "ISC Mathematics", "ISC Biology", "Hues- An Anthology of short stories", "MTG IITians Resource", "ICSE Syllabus 2013-14", "English for class 8", "English for class 7", "English for class 6", "Maths for class 8", "Maths for class 7", "Maths for class 6", "Hindi for class 8", "Hindi for class 7", "Hindi for class 6", "Social Studies for class 8", "Social Studies for class 7", "Social Studies for class 6"};
        int ACADP[]={250, 2200, 2350, 400, 565, 2100, 260, 200, 211, 245, 345, 234, 243, 213, 345, 213, 333, 321, 435, 654, 121, 324, 412, 222, 232, 212, 242, 213, 233, 124, 211, 233, 243, 323, 129, 199, 176, 287, 234, 298, 342, 231, 213, 143, 123, 154, 123, 198, 156, 78, 323, 235, 212, 321, 324, 125, 345, 323, 333, 222, 122, 323};

        int ACADSI[]=new int[ACAD.length];

       
        for(int i=0;i<ACAD.length;i++)
        {
            int p=ACAD[i].length();
            String h=SPACEDOT.space(p);
            c++;
            if(c<10)
                System.out.println("(0"+c+")"+ACAD[i]+h+"Rs."+ACADP[i]);

            else
                System.out.println("("+c+")"+ACAD[i]+h+"Rs."+ACADP[i]);
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

                for(int i=ar;i<ACADSI.length;i++)
                    ACADSI[ar]=-1;

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

                if(Integer.parseInt(s)>ACAD.length || Integer.parseInt(s)<=0 )
                {

                    System.out.println("Sorry! No Books Available");
                }
                
                IF1:
                if(Integer.parseInt(s)<=ACAD.length && Integer.parseInt(s)!=0)
                {
                    int n=Integer.parseInt(s);
                    
                    LOOP3:
                    for(int i=0;i<ACADSI.length;i++)
                    {
                        if(ACADSI[i]==n)
                        {
                            System.out.println("You Have already purchased this book");
                            break IF1;
                        }
                    }
                    
                    
                    
                    ACADSI[ar]=n;
                    
                    
                    
                    String h=SPACEDOT.space(ACAD[n-1].length());
                    System.out.println("("+s+")"+ACAD[n-1]+h+"Rs."+ACADP[n-1]);

                    ACADSI[ar]=n;

                    ar++;

                }
            }

    

        }
        return ACADSI;

    }

}

