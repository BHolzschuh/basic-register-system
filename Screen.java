package q4;

import java.util.ArrayList;

public class Screen {

    /**
     * Prints a single item to the screen.
     * @param item product to be printed to the screen
     */
    public void printItem(Product item){
        System.out.println(item.getUPC() + " " + item.getName() + " $" + item.getPrice());
    }

    /**
     * Prints the entire receipt to the screen.
     * @param items an array of products to be printed to the screen
     */
    public void printReceipt(ArrayList<Product> items, int total){
        System.out.println("-------Receipt-------");
        for(Product prod : items){
            printItem(prod);
        }
        System.out.println("Total: $" + total);
    }

    /**
     * Prints the total amount of the receipt.
     * @param total the amount of the receipt
     */
    public void printTotal(int total){
        System.out.println("Total Cost: " + total);
    }
}
