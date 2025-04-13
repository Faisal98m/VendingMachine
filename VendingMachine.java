public class VendingMachine {

    private Grid grid;

    public VendingMachine() {
        this.grid = new Grid();
    }

    public Slot getSlot(int itemId) {
        Slot[][] slots = grid.getGrid();  // this calls Grid's getGrid() method

        for (int row = 0; row < slots.length; row++) {
            for (int col = 0; col < slots[row].length; col++) {
                if (itemId == slots[row][col].getItem().getId()) {
                    return slots[row][col];
                }
            }
        }

        return null;
    }
}
