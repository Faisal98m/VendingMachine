public class FetchItem {
    
     private final String name;
     private final int inputQuantity;
     private final double amount;
     private final VendingMachine vendingMachine;

     public FetchItem(String name, int quantity, double amount, VendingMachine vendingMachine){
        this.name = name;
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
            System.out.println("Not enough money!");
            return 0;
        }

        
        return Math.round(change);

     }



     /*Method for giving user their item*/
     
     public String toString(){
        int slot = this.vendingMachine.findItemIdByName(this.name);
        StringBuilder result = new StringBuilder();
        Integer itemId = vendingMachine.findItemIdByName(this.name);

        

        if(itemId == 0){
            return "Empty";
          }

        if(itemId == 0){
            return "Empty";
          }

    
        if(itemId == vendingMachine.findItemIdByName(this.name)){

            result.append("Here is your item: ")
            .append(this.name)
            .append("\nHere is your change: ")
            .append(isPayVerified(amount, itemId, inputQuantity));

        }
    
        

        return result.toString();

     }


}
