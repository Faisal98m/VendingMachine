public class VendingMachine {

    private Grid grid;

    public VendingMachine() {
        this.grid = new Grid();
    }

    public Slot getSlot(int itemId) {
        Slot[][] slots = grid.getGrid();  

        for (int row = 0; row < slots.length; row++) {
            for (int col = 0; col < slots[row].length; col++) {
                if (itemId == slots[row][col].getItem().getId()) {
                    return slots[row][col];
                }
            }
        }

        return null;
    }

    public int findItemIdByName(String name){
        Slot[][] slots  = grid.getGrid();
        
        for(int row = 0; row < slots.length; row++){
            for(int col = 0; col < slots[row].length; col++){
                Items item = slots[row][col].getItem();
                if(item.getName().equalsIgnoreCase(name)){
                    return item.getId();
                }
            }   
        }
        return -1;
        
    }

    
}
