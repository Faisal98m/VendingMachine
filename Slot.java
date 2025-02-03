public class Slot {
    //This class will model the grid for the vending machinez

    // so the way I'd print it would be

    // row 1     fanta(8)   coke(8)    7up(3)    diet coke(4)
    // row 2     fanta(8)   coke(8)    7up(3)    diet coke(4)
    // row 3     fanta(8)   coke(8)    7up(3)    diet coke(4)
    // row 4     fanta(8)   coke(8)    7up(3)    diet coke(4)
    // row 5     fanta(8)   coke(8)    7up(3)    diet coke(4)
    // row 6     fanta(8)   coke(8)    7up(3)    diet coke(4)


    // so each row  prints out along with the rows items and the stock represented inside the brackets

    private Items item;
    private double price;
    

    public Slot(Items item, double price){
        this.item = item;
        this.price = price;
    }

    public Items getItem(){
        return this.item;
    }

    public double getPrice(){
        return this.price;
    }
    //

}
