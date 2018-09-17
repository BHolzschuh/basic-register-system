package q4;

import java.util.ArrayList;

public class Receipt {
    /**
     * Constructs an empty receipt list.
     */
    public Receipt(){
        s = new Screen();
        list = new ArrayList<>();
        total = 0;
    }

    /**
     * Add products to the end of the receipt and prints the item to the screen.
     * @param newProduct the product to be added
     */
    public void add(Product newProduct){
        s.printItem(newProduct);
        list.add(newProduct);
        total += newProduct.getPrice();
    }

    /**
     * Prints the receipt to the screen.
     */
    public void printReceipt(){
        s.printReceipt(list, total);
    }

    /**
     * gets the total amount of the receipt.
     * @return total amount of the receipt
     */
    public int pay(){
        s.printTotal(total);
        return total;
    }

    private int total;
    private ArrayList<Product> list;
    private Screen s;
}
