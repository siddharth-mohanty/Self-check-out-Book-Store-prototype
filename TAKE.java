import java.util.*;
public class TAKE extends ANAGRAM
{
    public static String take()
    {

        Scanner in=new Scanner(System.in);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Enter the no. of the corresponding book you want to buy: \n or Enter DONE to proceed");
        String a=in.nextLine();

        System.out.println("*******************************************");

    
        return a;

    }

    public static int takeInt()
    {

        Scanner in=new Scanner(System.in);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Enter the no. of the corresponding book");
        int a=in.nextInt();

        System.out.println("*******************************************");

    
        return a;

    }

    public static int takeQty()
    {
        
        int a;
        Scanner in=new Scanner(System.in);

        System.out.println("ENTER QUANTITY FOR THE ABOVE MENTIONED BOOK:");

        a=in.nextInt();
    
        
        
        return a;
    }

}