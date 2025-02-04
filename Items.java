public class Items {
    
    /*Today we'll work on the items themselves

    //Class Responsibility: Create a class for an item
    //This class can then be used in a slot in the vending machine
    //We have to first create a class for an item
    //Then we have to populate another class with this item


    /How would we use this class?
    /We will call the Item class
    //Item fanta = new Item(<"Fanta", 1 >, null, 1.50 )

    VendingMachine(row(1).column(1)).add(Fanta)
    VendingMachine(row(1).column(2)).add(7up)
    VendingMachine(row(1).column(3)).add(Coca)
    VendingMachine(row(1).column(4)).add(Pepsi)
    VendingMachine(row(2).column(1)).add(Sensations)
    VendingMachine(row(3).column(2)).add(Snickers)
    VendingMachine(row(4).column(3)).add(Pringles)
    

    Properties:
     ->Name
     ->Key: 
        -This will be automatically generated for every item

     ->Stock level
     ->Price

     */


     private String name;
     private Integer id;
     private Integer stockLevel;
     private Double price;

     public Items(String name, Integer id, double price){
        this.name = name;
        this.id = id;
        this.stockLevel = 8;
        this.price = price;
     }

     public Items(){
        
     }
     public String getName(){
        return this.name;
     }

     public int getId(){
        return this.id;
     }

     public int getStock(){
        return this.stockLevel;
     }

     public int reduceStock(int quantity){

        if(quantity <= 0){
            return 0;
        }

        return this.stockLevel -quantity;

     }


     public double getPrice(){
        return this.price;
     }


     public String toString(){

        StringBuilder result = new StringBuilder();

        result.append(this.getName())
            .append(", ID:")
            .append(getId())
            .append(", In Stock: ")
            .append(getStock())
            .append(", Price: £")
            .append(getPrice());

        return result.toString();
     }

     

}
