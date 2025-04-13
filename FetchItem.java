public class FetchItem {
    
     private final int inputId;
     private final int inputQuantity;
     private double amount;
     private VendingMachine vendingMachine;

     public FetchItem(int id, int quantity, double amount, VendingMachine vendingMachine){
        this.inputId = id;
        this.inputQuantity = quantity;
        this.amount = amount;
        this.vendingMachine = vendingMachine;
     }


     public Boolean doesItemExist(int id){

      Boolean exists = false;//Boolean flag

      //Bring in the slot class and get slot id 
      Slot slot = this.vendingMachine.getSlot(id);
      

      //
      if(slot == null){
        return false;
      }

      if(slot.getItem() == null){
        return false;
      }

      if(slot.getItem().getStock() <= 0){
        System.out.println("No more stock of this item");
        return false;
      }

      if(slot.getItem().getId() == id){
        exists = true;
      }

      return exists;
        
     }


     public double isPayVerified(double userPay, int id, int quantity){

        double change;

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



     /*Method for giving user their item*/
     
     public String toString(){
        Slot slot = this.vendingMachine.getSlot(this.inputId);
        StringBuilder result = new StringBuilder();
        

        if(slot == null){
            return "Empty";
          }

        if(slot.getItem() == null){
            return "Empty";
          }

    
        if(this.inputId == slot.getItem().getId()){

            result.append("Here is your item: ")
            .append(slot.getItem().getName())
            .append("\nHere is your change: ")
            .append(isPayVerified(amount, inputId, inputQuantity));

        }
    
        

        return result.toString();

     }


}
