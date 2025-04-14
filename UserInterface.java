
import java.util.Scanner;

public class UserInterface {
    

     public UserInterface(){
       
     }

     public void start(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Menu: ");
        Grid grid = new Grid();
        System.out.println(grid);

        VendingMachine vending = new VendingMachine(grid);

        FetchItem fetch = null;
        

        while (true){
            System.out.println("1.List items\n2.Buy\n3.Quit");
            int option = Integer.valueOf(scan.nextLine());

            if (fetch != null) {
                System.out.println(fetch);
            }

            if(option == 1){
                System.out.println(grid);
            }else if(option == 2){
                System.out.println("Please choose an item:");
                String item = scan.nextLine();
                System.out.println("Quantity: ");
                Integer quantity = Integer.valueOf(scan.nextLine());
                System.out.println("Please insert payment amount:");
                Integer payment = Integer.valueOf(scan.nextLine());
                fetch = new FetchItem(item, quantity, payment, vending);
                System.out.println(fetch);
            }else if(option ==  3){
                break;
            }
        }

        
     }







}
