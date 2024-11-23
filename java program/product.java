/**
 * This class is for displaying the items ordered
 * this class has constructor 
 * product method and payment method has parameter
 * @param item qty price message
 */
 
public class Product  {
    String item;
    int qty;
    int price;
    double total;
    
    Product(){
    this.item=item;
    this.qty=qty;
    this.price=price;
    this.total=total;
}
    /*product method has argument
    *@param String,int,int
    */
    
    void product(String item,int qty,int price,double total){
       if(qty!=0){
    System.out.println(item+"\t\t"+qty+"\t\t"+price+"\t\t"+total);
    }
    }
    void payment(String message){
         System.out.println("PAYMENT TYPE\t\t\t\t\t"+message);
    }
    
    /*
    *This method return boolean value
    *Its check for length and pattern 
    */
    
     boolean vcard(String c){
        return c.length()==16 && c.matches("[0-9]+");
        
    }
    
     boolean valid(String i){
        return i.length()==8 && i.matches("[0-9]+");
        
    }
    
   boolean vphone(String p){
        return p.length()==10 && p.matches("[0-9]+");
        
    }
}
