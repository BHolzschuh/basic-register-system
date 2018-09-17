package q4;

import java.util.Scanner;

public class CashRegisterTester {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        UPCScanner scanner = new UPCScanner();
        Cashier cashier = new Cashier(scanner, in);
        cashier.run();
    }
}
