package q4;

import java.util.Scanner;

public class Cashier {
    /**
     * Constructs a cashier instance with a upcscanner
     * and customer object passed to it.
     */
    public Cashier(UPCScanner upc, Scanner input){
        receipt = new Receipt();
        scanner = upc;
        in = input;
    }

    /**
     * takes a upc value and scans it with the UPCScanner
     * @param upc a upc int relating to a product id
     */
    public void scanItem(int upc){
        scanner.scan(upc, receipt);
    }

    /**
     * The cashier presses the pay button taking the cash
     * from the customer and printing the receipt.
     */
    public void payButton(){
        int money = receipt.pay();
        getPayment(money);
        receipt.printReceipt();
    }

    /**
     * Runs the cash register system.
     */
    public void run(){
        System.out.println("\n\nPlease type a upc (101-104) and press enter after each.\n" +
                "Invalid input will cause the cashier to press the 'Pay' button");
        while(in.hasNextInt()){
            int upc = in.nextInt();
            scanItem(upc);
        }
        in.next();
        payButton();
    }

    /**
     * Gets cash from the user/customer.
     * @param amount amount the customer owes for the purchase
     */
    public void getPayment(int amount){
        int paid = 0;
        while(amount > paid){
            try{
                System.out.print("Payment: $");
                paid += in.nextInt();
                if(amount > paid) {
                    System.out.println("Amount still due: $" + (amount - paid));
                }
            } catch (Exception ex){
                System.out.println("Numbers only!");
                in.next();
            }
        }
        if(paid > amount){
            System.out.println("Your change is: $" + (paid - amount));
        }
    }

    private Receipt receipt;
    private UPCScanner scanner;
    private Scanner in;
}
