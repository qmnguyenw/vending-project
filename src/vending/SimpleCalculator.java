package vending;

public class SimpleCalculator implements Calculator{

    @Override
    public int calculateTotal(CashBundle enteredCoins) {
        return enteredCoins.getTotal();
    }

    @Override
    public CashBundle calculateChange(int amountMoneyToReturn) {
        CashBundle change = new CashBundle(new int[5]);
        int remainingAmount = amountMoneyToReturn;

        change.numberTWOHUNDRED_VND = remainingAmount / Cash.TWOHUNDRED_VND.getValue();
        remainingAmount = remainingAmount % Cash.TWOHUNDRED_VND.getValue();

        change.numberONEHUNDRED_VND = remainingAmount / Cash.ONEHUNDRED_VND.getValue();
        remainingAmount = remainingAmount % Cash.ONEHUNDRED_VND.getValue();

        change.numberFIFTY_VND = remainingAmount / Cash.FIFTY_VND.getValue();
        remainingAmount = remainingAmount % Cash.FIFTY_VND.getValue();

        change.numberTWENTY_VND = remainingAmount / Cash.TWENTY_VND.getValue();
        remainingAmount = remainingAmount % Cash.TWENTY_VND.getValue();

        change.numberTEN_VND = remainingAmount / Cash.TEN_VND.getValue();

        return change;
    }
}