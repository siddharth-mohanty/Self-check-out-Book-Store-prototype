import java.util.*;
import java.io.*;

public class BookStore extends MAIN_CLASS
{

    public static void bookdirect()throws IOException
    {
        int s; int c=0;
        String temp="", rtemp="";

        Scanner in=new Scanner(System.in);
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(read);

        System.out.println("\f^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
        System.out.println("Welcome to Universal Book Store(Indian Branch, Mumbai):\n");
        DELAY.delay(10000);//delay loop

        System.out.println("Hello Dear Customer!\n\n\n");
        System.out.println("How may we help you?\n\n\n");

        System.out.println("****************************************************\n");

        System.out.println("[1]-: Buy Book");
        System.out.println("[2]-: Register name to avail Discounts");

        System.out.println("\n****************************************************");

        System.out.println("Please Enter Your Choice:-");
       
            String choice=in.next();
        
        BOOKS obj=new BOOKS();
        AVAIL_DISC ob=new AVAIL_DISC();

        switch (choice)
        {

            case "1":
            obj.book();
            break;

            case "2":
            {
                ob.avail();
                System.out.println("Do You Want to Buy Book? Enter Y or N");
                char sel=buf.readLine().charAt(0);

                if(sel=='Y' || sel=='y')
                {
                    System.out.println("\f\n\n\t\tPLEASE WAIT WHILE WE ARE REDRECTING YOU TO OUR BOOKS PAGE.............");
                    DELAY.delay(100000);
                    obj.book();
                }

                else
                    break;
            }
            break;

            
            default:
            break;

        }
        
        
        
        
    }

}


         