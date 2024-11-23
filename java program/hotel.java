import java.util.Date;
import java.util.Scanner;
class Hotel {
    String cname;
    String pno;
    Date d=new Date();
    /*Hotel is constructor
    *@param Constructor 
    *getdetails method is printing the ClassFormatError
    */
    Hotel(String cname,String pno){
        this.cname=cname;
        this.pno=pno;
    }
    
    void getdetails(){
    	System.out.println("\n\t***********************HOTEL JAVA**********************");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("INVOICE NAME:"+cname);
        System.out.println("MOBILE NUMBER:"+pno);
        System.out.println("------------------------------------------------------------------------");
	    System.out.println("DATE\t"+d);
        System.out.println("------------------------------------------------------------------------");
        System.out.print("ITEM\t\t\t");
        System.out.print(" QTY\t\t");
        System.out.print(" PRICE\t\t");
        System.out.println("TOTAL\t\t\t");
        System.out.println("------------------------------------------------------------------------");
    }
}
