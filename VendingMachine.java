public class VendingMachine {


    /*Let's begin creating the grid for the vending machine
    What is the point of this class
    Let's work our way backwards
    If we were to call this class, how would we want it to function

    VendingMachine vendingMachine = new VendingMachine()
    This class could be used in the fetchItems class to get the items
    Can be used in the verifyPayments aswell
    In the main class when the user asks to print out the vending machine
    It's responsiblities:
     * Create the structure for the vending machine
     * Have it's rows, columns and separate slots
     * 
     *
    Slot[4][4]
    Slot{{fanta,3.50}, {7up, 3.0},{coke, 5.0}, {irb bru, 4.0}}



     */
    private Slot[][] grid;

    public VendingMachine(){
        grid = new Slot[4][4];

        // Row 0: Drinks
        grid[0][0] = new Slot(new Items("Fanta", 1, 3.50), 3.50);
        grid[0][1] = new Slot(new Items("7up", 2, 3.00), 3.00);
        grid[0][2] = new Slot(new Items("Coke", 3, 5.00), 5.00);
        grid[0][3] = new Slot(new Items("Irn Bru", 4, 4.00), 4.00);

        // Row 1: Crisps
        grid[1][0] = new Slot(new Items("Lays", 5, 2.50), 2.50); 
        grid[1][1] = new Slot(new Items("Pringles", 6, 3.50), 3.50);
        grid[1][2] = new Slot(new Items("Doritos", 7, 3.00), 3.00);
        grid[1][3] = new Slot(new Items("Cheetos", 8, 2.80), 2.80);

        // Row 2: Chocolates
        grid[2][0] = new Slot(new Items("Mars", 9, 1.50), 1.50);
        grid[2][1] = new Slot(new Items("Snickers", 10, 1.75), 1.75);
        grid[2][2] = new Slot(new Items("Twix", 11, 1.60), 1.60);
        grid[2][3] = new Slot(new Items("KitKat", 12, 1.80), 1.80);

        // Row 3: Sandwiches
        grid[3][0] = new Slot(new Items("Ham Sandwich", 13, 4.50), 4.50);
        grid[3][1] = new Slot(new Items("Chicken Salad", 14, 5.00), 5.00);
        grid[3][2] = new Slot(new Items("Veggie Wrap", 15, 4.00), 4.00);
        grid[3][3] = new Slot(new Items("Tuna Sandwich", 16, 4.75), 4.75);


    }   

    /*Now our grid is created, we would need to find a way to output this so we can use it in our other classes
     * 
     */

    //Need to create a getter for this class so that we're able to extract the grid and run operations on it

    public Slot getSlot(int itemId){

        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                if(itemId == grid[row][col].getItem().getId() ){
                    return grid[row][col];
                }
            }
        }

        return null;
    }

     public String toString(){

        StringBuilder result = new StringBuilder();

        for(int row= 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                result.append("Slot at (")
                    .append(row)
                    .append(", ")
                    .append(col)
                    .append("): ");
                if(grid[row][col] != null && grid[row][col].getItem() != null){
                    result.append(grid[row][col].getItem().getName())
                    .append(" (£")
                    .append(grid[row][col].getItem().getPrice())
                    .append(")");

                }else{
                    result.append("[Empty]");
                }
                result.append("\n");
            }
        }

        return result.toString();

     }


     /*Do we update the stock here?
      
        


      * 


      */


}
