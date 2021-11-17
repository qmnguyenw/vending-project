package vending;

public interface VendingMachineInterface {
    void displayProducts();

    void selectProduct(int product);

    void displayEnterMoneyMessage();

    void enterCoins(int... coins);

    void displayChangeMessage();

    CashBundle calculateChange(VendingMachineRequest request);
}
