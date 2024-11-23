import java.util.Scanner;

/*
*This class is getting name and phoneno 
*Validation is done within try block
*Matching pattern for name and phoneno
*/

public class Main{
    public static void main(String[] args) {
    String phno;
    String cname;
    int length;
	Menu m=new Menu();
    m.display();
    Product p=new Product();
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter name of customer:"); 
    cname=sc.next();
       
            while(!cname.matches("[a-zA-Z ]+"))
            {
                System.out.println("Enter valid Name ");
                cname=sc.next();
            }
                     System.out.println("Thank you for valid name");
        
        
        
        System.out.println("Enter Mobile no");
        phno=sc.next();
        while(p.vphone(phno)!=true)
        {
        System.out.println("Enter valid Number");
        phno=sc.next();
        }
        System.out.println("validation successfull");
        
        
            

        /*Object created for hotel class its is a paramterized constructor
        *@param passing String,Integer to constructor
        *obejct are created for classes using object method are called
        */
  
       Hotel h=new Hotel(cname,phno);
       Gst g =new Gst();
       g.order();
       g.cal();
       g.pay();
       h.getdetails();
       g.display();
}
}
