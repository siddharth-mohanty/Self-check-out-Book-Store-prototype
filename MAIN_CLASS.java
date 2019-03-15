import java.io.*;
import java.util.*;

public class MAIN_CLASS
{
    public static void main(String[] args)throws IOException
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Time=:");
        DATE_AND_TIME.getDateandTime();
        
        
        BookStore ob=new BookStore();
        
        
        
        ob.bookdirect();
        System.out.println("THANKYOU FOR VISITING OUR STORE! PLEASE VISIT AGAIN.. :)");
        
        System.out.println("\nPLEASE ENTER 1 AFTER TAKING YOUR BOOKS OR WHEN YOU THINK TO LEAVE"+SPACEDOT.space(150,"PLEASE ENTER 1 AFTER TAKING YOUR BOOKS OR WHEN YOU THINK TO LEAVE".length() ));
        
        String ac=in.next();
        
        if(ac.equals("1"))
        ob.bookdirect();
        
        
        
    }
}