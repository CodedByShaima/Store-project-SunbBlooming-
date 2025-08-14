import java.util.Scanner;
public class _SunBlooming{
public static void main(String[] args) {
Scanner input = new Scanner (System.in);
System.out.println("Welcome where flowers bloom under the sun!!!"); // welcoming to our store
// declearing items numbers
int itemone = 1 , itemtwo = 2, itemthree = 3, itemfour = 4, itemfive = 5;
// declearing items names
String nameone = "Lavender" , nametwo = "Sunflower" , namethree = "Tulip" ,namefour = "Rose" , namefive = "Lily";
// declearing Item available quantity 
int qun1 = 70, qun2 = 15, qun3 = 10, qun4 = 33, qun5 = 35;
int temp1=70, temp2=15,tmep3=10,temp4=33,temp5=35;
// declearing Item price
double price1 = 2.25, price2 = 7.00, price3 = 8.00, price4 = 3.00, price5= 5.00;
// declearing count for item
int count1= 0, count2=0, count3=0,count4=0, count5;
// declearing total 
double total = 0;
double totalprofit = 0;

do 
{
System.out.print("1- Coustmoer \n2- Store owner \n3- Exit \n");
System.out.println("Enter your choice : " );
int choice = input.nextInt();
 
switch (choice)
case 1 : // for custmoer menu

do 
{ 
  System.out.println("+------------+--------+");
 System.out.println("|ITEM NUMBER       | NAME  | AVAILABLE QUANTITY  | PRICE ");
System.out.println("+----------------------+-----------------------+");
System.out.printf("| %-10s | %6.2f SR | %6.2f SR |", itemone, nemewone, qun1, price1);
System.out.printf("| %-10s | %6.2f SR | %6.2f SR |", itemtwo, nametwo, qun2, price2 );
System.out.printf("| %-10s | %6.2f SR | %6.2f SR |", itemthree, namethree, qun3, price3);
System.out.printf("| %-10s | %6.2f SR | %6.2f SR |", itemfour, namefour, qun4, price4 );
System.out.printf("| %-10s | %6.2f SR | %6.2f SR |", itemfive, namefive, qun5, price5 );
System.out.printf("6- chcek out");
System.out.printf("7- cancel " );
System.out.println("+----------------------+------------------------+");
       
System.out.println("what kind of flower you want ? ");
int kflower = input.nextInt(); 
System.out.println("how much do you want?");
int qun= input.nextInt();
/*if (qun == 7)
continue;*/ 
 /*if ( kflower >
continue */ // not string

switch (kflower) // switch for items
case 1 :
System.out.println("how much do you want?");
int qun= input.nextInt();
if (temp1 < qun)
System.out.print("Sorry the qun.. is not enugh!");
break;
temp1 -= qun;
total+=price1*qun;
count1 += qun;

case 2 :
total+=price2*qun

case 3 :
total+=price3*qun

case 4 :
total+=price4*qun

case 5 :
total+=price5*qun

case 6 :










case 2 :










} while (choice != 3);

}}
