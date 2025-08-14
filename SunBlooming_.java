
import java.util.*;
public class SunBlooming_{
static Scanner input = new Scanner (System.in);
static Item item1, item2, item3, item4, item5; // we make it static because it will used with multiple methods
static int tempcount1, tempcount2, tempcount3, tempcount4, tempcount5; //if the customer want to cancel so we don't cross any problem
static double totalProfit=0; //for owner
static String invoiceOut;
static double max; // to avoid any error
public static void main(String[] args) {

// declearing our item as constrcter
item1 = new Item ("1" ,  "Lavender" , 70 , 2.25); 
item2 = new Item ("2" ,  "Sunflower" , 15 ,7.00);
item3 = new Item ("3" ,  "Tulip" , 10 , 8.00);
item4 = new Item ("4" ,  "Rose" , 33, 3.00);
item5 = new Item ("5" ,  "Lily" , 35 , 5.00);

System.out.println("Welcome where flowers bloom under the sun!!!"); // welcoming to our store

displayMenu();

} // end main


public static void customerMenu(){
tempcount1=0; tempcount2=0; tempcount3=0; tempcount4=0; tempcount5=0;
invoiceOut = String.format("%-15s %-8s %-8s %-8s\n", "name", "quantity", "price", "Total"); // to use it for every choice in a easy way than S.O.P evry time

int choice;
do { 
System.out.println("\nCustomer Menu");
System.out.println("1- View available flowers");
System.out.println("2- Select an flowers and specify the quantity");
System.out.println("3- Checkout and generate an invoice");
System.out.println("4- Cancel and return to the main menu");
System.out.println("Enter your choice : ");
choice = input.nextInt();

switch (choice) {
 case 1: //View available products
 
 System.out.printf("|%-8s|%-15s|%-8s|%-16s|%-8s|\n" , "Id", "name", "quantity", "price per unit", "soldCount");

if (item1.getQuantity() > 0)
item1.display();

if (item2.getQuantity() > 0)
item2.display();

if (item3.getQuantity() > 0)
item3.display();

if (item4.getQuantity() > 0)
item4.display();

if (item5.getQuantity() > 0)
item5.display();

 break; // frome case 1

 case 2: // Select an item and specify the quantity
 System.out.println("Enter your flower choice: ");
 String idflower = input.next();
 if ( !idflower.equals(item1.getItemId()) && !idflower.equals(item2.getItemId()) && !idflower.equals(item3.getItemId()) && !idflower.equals(item4.getItemId()) && !idflower.equals(item5.getItemId()) ){ // if not equal
    System.out.println("Invalid input");
   break;}  // from if NOT the case
 
 System.out.println("How much do you want: ");
 int qunflower = input.nextInt();
  // item 1
  if ( idflower.equals(item1.getItemId()) ) {
  if ( item1.updateStock(qunflower) == true ) {
  
  invoiceOut += String.format("%-15s %-8d %-8.2f %-8.2f\n", item1.getName(), qunflower, item1.getPrice(), item1.getTotalCost(qunflower)); 
  tempcount1 += qunflower;
  System.out.println("Your bouquet is preparing :) ");
  }
  else
 System.out.println("The store is currently out of stock :( \n We are working on restocking soon <3 \n " );
 }
 
 // item 2
  if ( idflower.equals(item2.getItemId()) ) {
  if ( item2.updateStock(qunflower) == true ) {
  
 invoiceOut += String.format("%-15s %-8d %-8.2f %-8.2f\n", item2.getName(), qunflower, item2.getPrice(), item2.getTotalCost(qunflower));
  tempcount2 += qunflower;
  System.out.println("Your bouquet is preparing :) ");
  }
  else
  System.out.println("The store is currently out of stock :( \n We are working on restocking soon <3 \n " );
}
 // item 3
   if ( idflower.equals(item3.getItemId()) ) {
  if ( item3.updateStock(qunflower) == true ) {
  
  invoiceOut += String.format("%-15s %-8d %-8.2f %-8.2f\n", item3.getName(), qunflower, item3.getPrice(), item3.getTotalCost(qunflower));  
  tempcount3 += qunflower;
  System.out.println("Your bouquet is preparing :) ");
  }
  else
  System.out.println("The store is currently out of stock :( \n We are working on restocking soon <3 \n " );
  }
   // item 4
     if ( idflower.equals(item4.getItemId()) ) {
     if ( item4.updateStock(qunflower) == true ) {
     
  invoiceOut += String.format("%-15s %-8d %-8.2f %-8.2f\n", item4.getName(), qunflower, item4.getPrice(), item4.getTotalCost(qunflower)); // to store at the bill
  tempcount4 += qunflower;
  System.out.println("Your bouquet is preparing :) ");
  }
  else
  System.out.println("The store is currently out of stock :( \n We are working on restocking soon <3 \n " );
}
 // item 5
  if ( idflower.equals(item5.getItemId()) ) {
  if ( item5.updateStock(qunflower) == true ) {
  
  invoiceOut += String.format("%-15s %-8d %-8.2f %-8.2f\n", item5.getName(), qunflower, item5.getPrice(), item5.getTotalCost(qunflower)); // to store at the bill
  tempcount5 += qunflower;
  System.out.println("Your bouquet is preparing :) ");
  }
  else
  System.out.println("The store is currently out of stock :( \n We are working on restocking soon <3 \n " );
}

 break; // end case 2
 
 case 3: //Checkout and generate an invoice
 generateInvoice();
 break;
 
 case 4: //Cancel and return to the main menu
 
 item1.setQuantity(item1.getQuantity() + tempcount1); // we sum casue we need back to orgainal qun.
 item1.setSoldCount(item1.getSoldCount() - tempcount1); // we mins casue we need back to orgainal qun.
 
 item2.setQuantity(item2.getQuantity() + tempcount2); 
 item2.setSoldCount(item2.getSoldCount() - tempcount2);
 
 item3.setQuantity(item3.getQuantity() + tempcount3); 
 item3.setSoldCount(item3.getSoldCount() - tempcount3);
  
 item4.setQuantity(item4.getQuantity() + tempcount4); 
 item4.setSoldCount(item4.getSoldCount() - tempcount4);
  
 item5.setQuantity(item5.getQuantity() + tempcount5); 
 item5.setSoldCount(item5.getSoldCount() - tempcount5);

 break;
 
 default:
     System.out.println("Invalid choice!");


} // end switch
} // rnd do-while
while (choice != 3 && choice != 4 );

} // end customer menu

public static void generateInvoice(){ 

if (tempcount1 == 0 && tempcount2 == 0 && tempcount3 == 0 && tempcount4 == 0 && tempcount5 == 0) {
System.out.println("Sorry your bouquet is empty :( ");
return;
}
double totalCost = item1.getTotalCost(tempcount1)+item2.getTotalCost(tempcount2)+item3.getTotalCost(tempcount3)+item4.getTotalCost(tempcount4)+item5.getTotalCost(tempcount5); // total cost for each item 
    System.out.println("==================================================");
    System.out.println("                   Purchase Bil                   ");
    System.out.println("==================================================");
    System.out.println(invoiceOut);
    System.out.println("==================================================");
    System.out.println("Total price= " + totalCost + " SR" );
    System.out.println("==================================================");
    
totalProfit += totalCost; // to add the sum value for the owner
}

public static void storeOwnerMenu(){


int Ochoice;
do{
  System.out.println("\nOwner store system!");
  System.out.println("1- View total profit");
  System.out.println("2- View the most popular item");
  System.out.println("3- Return to the main menu");
  Ochoice = input.nextInt();

  switch(Ochoice) {
  case 1: //  View total profit
          
     if ( totalProfit == 0)
      System.out.println("Until now you don’t have any sales :( ");
     else
       System.out.println("Total profit = " + totalProfit + "SR");

  break;

  case 2: //View the most popular item
     findMostPopularItem();
  break;
 
  case 3: //Return to the main menu
    System.out.println(" return to the main menu! ");
  break;
 
 default:
    System.out.println("Invalid choice!");

} //end switch 
} // end do while
while (Ochoice != 3);
}// end store menu


public static void findMostPopularItem(){
  
    if ( totalProfit == 0)
    {
      System.out.println("Until now you don’t have any sales :( "); 
    return;
    }
    
        max = item1.getSoldCount();
   
    if (item2.getSoldCount() > max)
         max = item2.getSoldCount();
         
    if ( item3.getSoldCount() > max)
        max = item3.getSoldCount();
         
   if ( item4.getSoldCount() > max)
         max = item4.getSoldCount();
         
   if ( item5.getSoldCount() > max)
         max = item5.getSoldCount();
            
     
  System.out.println("The most popular flower : "); // comparinng here without break so if any product sales thr same qunt. can show
  
       System.out.printf("|%-8s|%-15s|%-8s|%-16s|%-8s|\n" , "Id", "name", "quantity", "price per unit", "soldCount"); // the header

  if ( max == item1.getSoldCount() )
     item1.display();
     
     
     if ( max == item2.getSoldCount() )
     item2.display();
     
    if ( max == item3.getSoldCount() ) 
     item3.display();
          
    if ( max == item4.getSoldCount() )
     item4.display();
     
    if ( max == item5.getSoldCount() )
     item5.display();
  }

public static void displayMenu(){ // to display the intrface (main menu)
int mainChoice;
do {
System.out.print("\n1- Coustmoer \n2- Store owner \n3- Exit \n");
System.out.println("Enter your choice : " );
mainChoice = input.nextInt();

switch (mainChoice) {
case 1 : // choice customer
  customerMenu();
  break;

case 2:// choice owner
  storeOwnerMenu();
  break;
  
case 3: // Exit from the menu
  System.out.println("========================================");
  System.out.println("           See you soon :) ");
  System.out.println("========================================");
break;

 default:
 System.out.println("Invalid input!");
} // end switch
} // end do while
 while( mainChoice != 3);
} // end display Menu



}// end class
