
import java.util.Scanner;

public class Main{


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Grid grid = new Grid();
        VendingMachine vendingMachine = new VendingMachine();
        System.out.println("Menu: ");
        System.out.println(grid);
        System.out.println("Please choose an item: ");
        String itemName = scan.nextLine();

        FetchItem fetch = new FetchItem(itemName, 2, 20, vendingMachine);

        System.out.println(fetch.toString());
        

    }
} 