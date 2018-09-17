package q4;

import java.util.ArrayList;

public class UPCScanner {
    /**
     * Constructs a UPCScanner with Hard coded
     * list of items in the store.
     */
    public UPCScanner(){
        inventory = new ArrayList<>();
        inventory.add(p1);
        inventory.add(p2);
        inventory.add(p3);
        inventory.add(p4);
    }

    /**
     * Scans upcs and adds them to the receipt if they're in the system.
     * @param upc the number relating to product id
     */
    public void scan(int upc, Receipt receipt){
        for(Product prod: inventory){
            if(upc == prod.getUPC()){
                receipt.add(prod);
            }
        }
    }

    private Product p1 = new Product("eggs", 101, 3);
    private Product p2 = new Product("snickers", 102, 1);
    private Product p3 = new Product("milk", 103, 2);
    private Product p4 = new Product("butter", 104, 5);
    private ArrayList<Product> inventory;
}
