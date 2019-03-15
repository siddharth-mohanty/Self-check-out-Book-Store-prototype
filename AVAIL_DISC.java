import java.io.*;
public class AVAIL_DISC extends BILLING
{
    public static void avail()throws IOException
    {

        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        String name;

        String DOB;

        String address;
        
        String City_Town;

        String state;
        
        String emailID;
        
        
        int c=0;

        

        
        
        
        
        System.out.println("\n"+" FILL IN THE BELOW GIVEN DETAILS TO \n BECOME A MEMBER TO AVAIL DISCOUNTS.....\n");

        int i=0;
        while(true)
        {
            System.out.println("\n"+"*#|| name:\n");
            name=in.readLine();//accepting name
            while(true)
            {
                if(name.equals(""))
                {
                    System.out.println("\n"+"*#|| YOUR name(MANDATORY FIELD):\n");
                    name=in.readLine();//accepting name
                }
                if(name.equals("")==false)
                    break;

            }

            System.out.println("\n"+"*#|| Date Of Birth:\n");
            DOB=in.readLine();//accepting age
            while(true)
            {
                if(DOB.equals(""))
                {
                    System.out.println("\n"+"*#|| YOUR Date of Birth(MANDATORY FIELD):(DDMMYYYY)\n");
                    DOB=in.readLine();//accepting name
                }
                if(DOB.equals("")==false)
                    break;

            }

            System.out.println("\n"+"*#|| Address ID\n");
            address=in.readLine();
        
            System.out.println("\n"+"*#|| City/Town\n");
            City_Town  =in.readLine();

            System.out.println("\n"+"*#|| State\n");
            state=in.readLine();

            

            System.out.println("\n"+"*#|| e-mail ID\n");
            emailID=in.readLine();
            
            
            i=i+1;
            c=c+1;
            break;
            
        }
        
        System.out.println("YOUR DETAILS\n\n");
        System.out.println("Name=>  "+name );
        System.out.println("DOB=>  "+DOB);
        System.out.println("ADDRESS=>  "+address);
        System.out.println("City/ Town=>"  +City_Town);
        System.out.println("Email ID=>  "+emailID);
       
        
        
    }
}



        
        