public class Main{


    public static void main(String[] args){


        Grid grid = new Grid();
        VendingMachine vendingMachine = new VendingMachine();
        FetchItem fetch = new FetchItem(3, 2, 20, vendingMachine);
        //We're calling the vending machine class, which  has the Grid class in it
        //fetch the wanted item. FetchItem wants id, quantity, amount and vending machine

        
        
        System.out.println(grid.toString());


        System.out.println(vendingMachine.getSlot(3).getItem());

        System.out.println(fetch.toString());
        

    }
}