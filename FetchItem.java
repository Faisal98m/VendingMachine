public class FetchItem {
    

    /*We want to update the vending machine in this class
     * Once the payment is verified
     * This class will then hold the responsibility of reducing the stock from vending machine
     * We can also use this class to verify if an item is in stock
     * 
     * 
     * 
     * 
     * 
     * Is the payment verified ---> update stock
     * 
     * if(verifiedPayment){
     *  
     *  slot.getStock - quantity
     * }
     * 
     * 
     * Then we would need to update the stock in our vending machine class.
     * 
     * I think the updating stock and verifying payments should all be one class
     */

     private int inputId;
     private int inputQuantity;
     private double amount;
     private VendingMachine vendingMachine;

     public FetchItem(int id, int quantity, double amount, VendingMachine vendingMachine){
        this.inputId = id;
        this.inputQuantity = quantity;
        this.amount = amount;
        this.vendingMachine = vendingMachine;
     }


     public Boolean doesItemExist(int id){

      Boolean exists = false;

      Slot slot = this.vendingMachine.getSlot(id);

      if(slot == null){
        return false;
      }

      if(slot.getItem() == null){
        return false;
      }

      if(slot.getItem().getStock() <= 0){
        return false;
      }

      if(slot.getItem().getId() == id){
        exists = true;
      }

      return exists;
        
     }


     public double isPayVerified(double userPay, int id, int quantity){

        double change = 0;

        Slot slot = this.vendingMachine.getSlot(id);
        

        if(slot == null){
            return 0;
          }

        if(slot.getItem() == null){
            return 0;
          }


        double totalAmount = slot.getPrice() * quantity;

  
        if(userPay <= 0 ){
            return -1;
        }


        if(userPay >= totalAmount){
            change = userPay- totalAmount;
        }else{
            return 0;
        }

        
        return change;

     }




}
