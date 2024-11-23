import java.util.Scanner;
public class Gst extends Product {
    
    /*instance variable*/
    
    double t1,t2,t3,t4;
    String item,message;
    int qty1,qty2,qty3,qty4;
    String pizza,burger,french,mocktail;
    double total,gst,dis,netTotal,grandTotal;
    double pizza_p=350.00;double burger_p=200.00; 
double    french_p=100.00;double mocktail_p=60.000; 
    
void order()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER THE NUMBER OF ITEM YOU WANT TO ORDER");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        if(ch==1){   
            System.out.println("Pizza-Rs"+pizza_p);
            System.out.println("enter the quantity");
            qty1+=sc.nextInt();
            pizza="Pizza     ";
	        t1=qty1*pizza_p;
            System.out.println(t1);
            
        }
        else if(ch==2){
            
            System.out.println("Burger-Rs"+burger_p);
            System.out.println("enter the quantity");
            qty2+=sc.nextInt();
            burger="Burger     ";
	        t2=qty2*burger_p;
            System.out.println(t2); 
            
        }
        else if(ch==3){
            System.out.println("French frise-Rs"+french_p);
            System.out.println("enter the quantity");
            qty3+=sc.nextInt();
            french="French frise";
	        t3=qty3*french_p;
            System.out.println(t3); 
            
        }
        else if(ch==4){
            System.out.println("Mocktail-Rs"+mocktail_p);
            System.out.println("enter the quantity");
            qty4+=sc.nextInt();
            mocktail="Mocktail     ";
	        t4=qty4*mocktail_p;
            System.out.println(t4);
        }

     else if(ch==0){
  cal();
}
        
        else{
          System.out.println("Ensure that you order from above menu..\nDon't worry Already placed order will not be erased ");
          System.out.println("You can also order furthur");
          order();
        }
}
}
//float total+=tot;

       void cal(){
            total=t1+t2+t3+t4;
            gst=0.05*total;
            dis=0.2*total;
            netTotal=total-dis;
            grandTotal= netTotal+ gst;
           
	}
        void pay(){
                System.out.println("\n");
        System.out.println("******************************************************");
        System.out.println("CHOOSE THE PAYMENT GATEWAY");
        System.out.println("1) PAY THROUGHT DEBIT OR CREDIT CARD ");
        System.out.println("2)NEFT TRANSCATION");
        System.out.println("3)ONLINE TRANSCATION");
        System.out.println("******************************************************");
            try{
        System.out.println("enter your option");
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       switch(n){
           case 1:
               System.out.println("enter the debit or credit card number");
               String card=sc.next();
                while(super.vcard(card)!=true)
                {
                System.out.println("enter the valid Number");
                card=sc.next();
                }
                System.out.println("validation successfull");
                System.out.println("Payment made Succesfully");
                message="CARD";
               
               break;
               
           case 2:
               System.out.println("NEFT TRANSACTION");
               System.out.println("Press 1 for INDIAN OVERSEABANK  and 2 for STATE BANK OF INDIA");
               String IFSC;
               int c;
               try{
               System.out.println("Enter the bank that you pay ");
                c=sc.nextInt();
               if(c==1){
                   System.out.println("ENTER YOUR IFSC CODE:");
                   IFSC=sc.next();
                 while(super.valid(IFSC)!=true)
                 {
                 System.out.println("Enter the valid IFSC code");
                IFSC=sc.next();
                 }
                 System.out.println("Payment made Succesfully");
                System.out.println("IOB"+IFSC);
                message="NEFT TRANSACTION";
                   }
                   
                 else if(c==2){
                     System.out.println("ENTER YOUR IFSC CODE:");
                     IFSC=sc.next();
                    while(super.valid(IFSC)!=true)
                     {
                        System.out.println("Enter the valid IFSC code");
                        IFSC=sc.next();
                     }
                     System.out.println("Payment made Succesfully");
                    System.out.println("SBI"+IFSC);
                    message="NEFT TRANSACTION";
                     }
                else
                {
                 System.out.println("Kindly press 1 or 2 for NEFT TRANSACTION or else choose any other gateway");
                pay();
                }
               }
                
                 catch(Exception e){
                   System.out.println(e);
                   System.out.println("Kindly give the valid input");
                   pay();
               }
               

                break;
               
            case 3:
                System.out.println("UPI TRANSACTION");
               String id="java@oksbi";
               String msg="yes";
                System.out.println("UPI ID:"+id);
               System.out.println("Please inform once you made payment");
               String online=sc.next();
               while(!online.matches("yes"))
               {
                 System.out.println("Waiting for your response");
                 online=sc.next();
               }
                System.out.println("Payment made Succesfully");
                message="ONLINE TRANSACTION";
               break;
               
            default:
            System.out.println("Ensure that you choose above GATEWAY");
            pay();
               }
               
       }
       catch(Exception e1){
           System.out.println(e1);
            System.out.println("Kindly give the valid input");
            pay();
          }
      
        }




	/*method display calls
	*super keyword is used to call parent class method
	*@param passing String,int,int
	*/
            
     
    
    void display()
        {
        
        super.product(pizza,qty1,350,t1);
        super.product(burger,qty2,200,t2);
        super.product(french,qty3,100,t3);
        super.product(mocktail,qty4,60,t4);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("SUBTOTAL \t\t\t                       "+ total);
        System.out.println("DISCOUNT@20%\t\t\t                       "+ 0.2*total);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("NETTOTAL\t\t\t                       "+netTotal);
        System.out.println("GST     \t\t\t                       "+gst);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("GRANDTOTAL\t\t\t                       "+grandTotal);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------");
        super.payment(message);
        System.out.println("PAYMENT MADE SUCCESSFULLY");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("THANK YOU DO VISIT AGAIN");
        }
        }
