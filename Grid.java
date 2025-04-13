
public class Grid {
    
    private final Slot[][] grid;

    public Grid(){
        

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

    public Slot[][] getGrid() {
        return this.grid;
    }


    public String toString(){

        StringBuilder result = new StringBuilder();

        for(int row= 0; row < this.grid.length; row++){
            for(int col = 0; col < this.grid[row].length; col++){
                result.append("Slot at (")
                    .append(row)
                    .append(", ")
                    .append(col)
                    .append("): ");
                if(this.grid[row][col] != null && this.grid[row][col].getItem() != null){
                    result.append(this.grid[row][col].getItem().getName())
                    .append(" (£")
                    .append(this.grid[row][col].getItem().getPrice())
                    .append(")");

                }else{
                    result.append("[Empty]");
                }
                result.append("\n");
            }
        }

        return result.toString();

     }

}
