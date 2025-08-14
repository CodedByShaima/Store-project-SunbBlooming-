public class Item {
private String itemId;
private String name;
private int quantity;
private double price;
private int soldCount;

public Item(){

itemId = " ";
name= " ";
quantity= 0;
price= 0;
soldCount= 0;

}

public Item(String itemId, String name, int  quantity, double price){

this.itemId = itemId;
this.name= name;
this.quantity= quantity;
this.price= price;
soldCount= 0;

}

public boolean updateStock(int purchasedQuantity){

if (quantity >= purchasedQuantity) {
    quantity  -= purchasedQuantity;
    soldCount += purchasedQuantity; 
    return true; }
    else {
      return false;
      }

}

public double getTotalCost(int purchasedQuantity) {
return price * purchasedQuantity;
}

public void display(){ 

System.out.printf("|%-8s|%-15s|%-8d|%-16.2f|%-9d|\n" , itemId, name, quantity, price, soldCount);

}

public void setItemId(String id){
itemId = id;
}

public void setQuantity(int quantity){
this.quantity = quantity;
}
public void setName(String name){
this.name=name;
}

public void setPrice(double price){
this.price=price;
}
public void setSoldCount(int soldCount){
this.soldCount = soldCount ;
}

public String getItemId(){
return itemId; }

public String getName(){
return name; }

public int getQuantity(){
return quantity;
}

public double getPrice(){
return price;
}

public int getSoldCount(){
return soldCount;
}

}// end class

