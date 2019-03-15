import java.io.*;
import java.util.Scanner;
public class BOOKS extends AVAIL_DISC
{
    public static float pay;

    public static void book()throws IOException
    {

        int s; int c=0;
        String temp="", rtemp="";

        Scanner in=new Scanner(System.in);
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(read);

      
        /**Buy Book*/
        String subs="";
        System.out.println("\n"+"\fPlease enter the name of the book or category of the book you want to search for:\n   Currently available-: \n\n ");
        System.out.println("\n"+"+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+- (1):ACADEMIC -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("\n"+"+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+- (2):FICTIONS -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("\n"+"+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+- (3):NON-FICTIONS -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("\n"+"+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+- (4):POPULAR SCIENCES -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("\n"+"+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+- (5):MAGAZINES & YEARBOOK of 2013 -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("\n"+"+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+- (6):REFERENCES -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("\n"+"+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+- (7):FOOD & BEVERAGES -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("\n"+"+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+- (8):SELF-HELP & MOTIVATIONAL -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("\n"+"+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+- (9):BIOGRAPHIES AUTOBIOGRAPHIES and MY STORIES -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("\n"+"+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+= (10):BESTSELLER & HANDPICKS BY THE EDITORS -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.print("\nYOU CAN EITHER WRITE THE NUMBER OF ANY OF THE CATEGORIES OR A KEYWORD:-");
        String name=in.next();
        name=name.trim();

        System.out.println("\n"+"");
        SEARCHERIF:
       if(name.equals("1")==false && name.equals("2")==false && name.equals("3")==false && name.equals("4")==false && name.equals("5")==false && name.equals("6")==false && name.equals("7")==false && name.equals("8")==false && name.equals("9")==false && name.equals("10")==false) 
        {
            String arr[]=SEARCHES.returnSEARCH(name);
            String arr2[]=SEARCHES.displaySEARCH(arr);
            String arr3[]=new String[arr2.length];

            c=0;
            for(int i=0;i<arr3.length;i++)
                arr3[i]="";
                
            if(arr2[0]!="")
            {
            System.out.println("\n"+"You Have Purchased");
            for(int i=0;arr2[i]!="";i++, c++)
                System.out.println("\n"+"[#"+(c+1)+"]"+arr2[i]);

            System.out.println("\n"+"Do you want to remove any of the books? Enter the number in '[# ]' of the book if yes else enter 'NO'");
            LOOP5:
            while(true)
            {
                String n=in.next();

                if(n.equalsIgnoreCase("no")==false || ANAGRAM.areAnagrams("no", n)==0)
                {
                    int m=Integer.parseInt(n);
                    arr2[m-1]=" ";
                }

                if(n.equalsIgnoreCase("no")==true || ANAGRAM.areAnagrams("no", n)==1)
                    break LOOP5;
            }

            for(int i=0;i<arr3.length;i++)
            {
                if(arr2[i]!="" && arr2[i]!=" ")
                {
                    arr3[i]=arr2[i];
                }
            }
            c=1;
            System.out.println("\n"+"NOW YOU HAVE PURCHASED");
            for(int i=0;i<arr3.length;i++, c++)
            {
                if(arr3[i]!="" && arr3[i]!=" ")
                    System.out.println("\n"+"[#"+c+"]"+arr3[i]);
            }

            int qty[]=new int[arr3.length];
            c=1;
            System.out.println("\n"+"***********************ENTER QUANTITY OF EACH BOOK*************************");
            for(int i=0;i<arr3.length;i++, c=c+1)
            {
                if(arr3[i]!="" && arr3[i]!=" ")
                {
                    System.out.println("\n"+"[#"+c+"]"+arr3[i]);
                    qty[i]=TAKE.takeQty();
                }
            }

            String t="";
            System.out.println("\n"+"\n\n\n");
            BILL_SHOW.showHeaderforSearches();
            int sum=0;
            int prices[]=new int[arr3.length];
            LOOPER:
            for(int i=0;i<arr3.length;i++)
            {
                if(arr3[i]!="" && arr3[i]!=" ")
                {
                    LOOPER_PASS:
                    for(int j=arr3[i].length()-1;j>0;j--)
                    {
                        char ch=arr3[i].charAt(j);

                        if(Character.isDigit(ch)==true)
                            t=ch+t;

                        if(Character.isDigit(ch)==false)
                            break LOOPER_PASS;
                    }

                    prices[i]=qty[i]*Integer.parseInt(t);
                    sum=sum+prices[i];

                    t="";

                    System.out.println("\n"+arr3[i]+SPACEDOT.midspace(arr3[i].length())+qty[i]+SPACEDOT.smallspace((Integer.toString(qty[i])).length())+prices[i]);
                }

                if(arr3[i]=="" && arr3[i]==" ")
                    continue LOOPER;

            }
            
            if(sum==0)
            {
                showFooter();
                System.out.println("YOU HAVENT PURCHASED ANYTHING");
                
            }
            
            else
            {
                
            System.out.println("\n"+"TOTAL=>"+sum);
            
            BILL_SHOW.showFooter();
            
            System.out.println("\n"+"Please Pay=Rs"+sum+"/-");
        }
        }
    }

        int bill;
        BILLING ob=new BILLING();

       
         if(name.equals("1"))
        {

            bill=ob.billACAD();
            BILL_SHOW.showFooter();
            
            if(bill!=0)
            {
            System.out.println("\n"+"You Get a Discount of 15% on your purchase");
            pay=-1*(0.15f*bill)+bill;

            System.out.println("\n"+"PLEASE pay=Rs."+pay+"/-");
        }
        }  

                       
       
         if(name.equals("2"))
        {
            bill=ob.billFICT();
            BILL_SHOW.showFooter();
            
            if(bill!=0)
            {
            System.out.println("\n"+"You Get a Discount of 20% on your purchase");
            pay=-1*(0.20f*bill)+bill;

            System.out.println("\n"+"PLEASE pay=Rs."+pay+"/-");
        }
        }
        System.out.print("\n\n\n\n\n");                

        if(name.equals("3"))
        {
            bill=ob.billNFICT();
            BILL_SHOW.showFooter();
            
            if(bill!=0)
            {
            System.out.println("\n"+"You Get a Discount of 13% on your purchase");
            pay=-1*(0.13f*bill)+bill;

            System.out.println("\n"+"PLEASE pay=Rs."+pay+"/-");
        }
    }
                       

        if(name.equals("4"))
        {
            bill=ob.billPOPSCI();
            BILL_SHOW.showFooter();
            
            if(bill!=0)
            {
            System.out.println("\n"+"You Get a Discount of 12% on your purchase");
            pay=-1*(0.12f*bill)+bill;

            System.out.println("\n"+"PLEASE pay=Rs."+pay+"/-");

        }
    }

                       

        if(name.equals("5"))
        {  
            bill=ob.billMAG();
            BILL_SHOW.showFooter();
            
            if(bill!=0)
            {
            
            System.out.println("\n"+"You Get a Discount of 19% on your purchase");
            pay=-1*(0.19f*bill)+bill;

            System.out.println("\n"+"PLEASE pay=Rs."+pay+"/-");
        }
    }
                       

        if(name.equals("6"))
        {
            bill=ob.billREF();
            BILL_SHOW.showFooter();
            
            {

            System.out.println("\n"+"You Get a Discount of 19% on your purchase");
            pay=-1*(0.16f*bill)+bill;

            System.out.println("\n"+"PLEASE pay=Rs."+pay+"/-");
        }
    }
         

        if(name.equals("7"))
        {
            bill=ob.billFOOD();
            BILL_SHOW.showFooter();
            
            if(bill!=0)
            {
                

            System.out.println("\n"+"You Get a Discount of 24% on your purchase");
            pay=-1*(0.24f*bill)+bill;
            System.out.println("\n"+"PLEASE pay=Rs."+pay+"/-");

        } 
    }
    
        if(name.equals("8"))
        {
            bill=ob.billSELFHELP();
            BILL_SHOW.showFooter();
         
            {
            System.out.println("\n"+"You Get a Discount of 6% on your purchase");
            pay=-1*(0.06f*bill)+bill;

            System.out.println("\n"+"PLEASE pay=Rs."+pay+"/-");

        }  
    }

        if(name.equals("9"))
        {
            bill=ob.billBIO();
            BILL_SHOW.showFooter();
        
            {
            System.out.println("\n"+"You Get a Discount of 13% on your purchase");
            pay=-1*(0.13f*bill)+bill;
            
            System.out.println("\n"+"PLEASE pay=Rs."+pay+"/-");

        } 
    }

        if(name.equals("10"))
        {
            bill=ob.billBESTSELLERS();
            BILL_SHOW.showFooter();
            
            {
            System.out.println("\n"+"You Get a Discount of 35% on your purchase");
            pay=-1*(0.35f*bill)+bill;
        
            System.out.println("\n"+"PLEASE pay=Rs."+pay+"/-");

        } 
    }

    
        
        
    }
}
