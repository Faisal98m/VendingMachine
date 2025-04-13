public class Items {
    

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

        return this.stockLevel - quantity;
 
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
