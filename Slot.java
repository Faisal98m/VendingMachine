public class Slot {


    private final Items item;
    private final double price;
    

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
