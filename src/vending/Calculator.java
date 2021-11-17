package vending;

public interface Calculator {
    int calculateTotal(CashBundle enteredCoins);
    CashBundle calculateChange(int enteredByUserMoney);
}
