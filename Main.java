

public class Main{


    public static void main(String[] args){


        // Vending machine project

        // 1/view items   2/ buy items
    
        // ViewItem class will print out a CLI form of the vending machine with all it's 
        // properties correctly portrayed.


        //how can we represent each row
        //how can we represent each column
        //the way we want to print it out is by 
        //populating the vending machine first
        //then printing out by going through our vending machine class


        //Let's say we have 6 columns and 4 rows
        //Each slot in a column within a row, has 8 possible of an item
        //Everytime an item is taken out, the vending machine keeps track for the new user
        
        // Steps we would need to take

        // create vending machine
        // display vending machine
        // ask for payment
        // verify payments
        // verify stock
        // fetch items


        Items item = new Items("Fanta", 2, 3.50 );


        System.out.println(item.toString());


    }
}