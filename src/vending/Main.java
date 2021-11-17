package vending;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            VendingMachineInterface machineInterface = new TextVendingMachineInterface();

            // get selected product user want to buy
            machineInterface.displayProducts();
            String selectedProduct;
            do {
                selectedProduct = scanner.nextLine();
            } while(!ValidData.checkOption(selectedProduct, 1, 3));
            machineInterface.selectProduct(Integer.parseInt(selectedProduct));

            machineInterface.displayEnterMoneyMessage();

            // get cash user enter
            String userEnteredCash;
            do {
            userEnteredCash = scanner.nextLine();
            } while(!ValidData.checkCash(userEnteredCash));

            // parse cash input
            int[] enteredCoins = Cash.parseCash(userEnteredCash);
            machineInterface.enterCoins(enteredCoins);

            machineInterface.displayChangeMessage();
        }

    }
}
