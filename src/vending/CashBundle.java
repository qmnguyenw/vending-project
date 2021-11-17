package vending;

public class CashBundle {

    public int numberTEN_VND;
    public int numberTWENTY_VND;
    public int numberFIFTY_VND;
    public int numberONEHUNDRED_VND;
    public int numberTWOHUNDRED_VND;

    public CashBundle(int... enteredCoins) {
        this.numberTEN_VND = enteredCoins[0];
        this.numberTWENTY_VND = enteredCoins[1];
        this.numberFIFTY_VND = enteredCoins[2];
        this.numberONEHUNDRED_VND = enteredCoins[3];
        this.numberTWOHUNDRED_VND = enteredCoins[4];
    }

    public int getTotal(){
        int total = 0;
        total = total+this.numberTEN_VND* Cash.TEN_VND.getValue();
        total = total+this.numberTWENTY_VND* Cash.TWENTY_VND.getValue();
        total = total+this.numberFIFTY_VND* Cash.FIFTY_VND.getValue();
        total = total+this.numberONEHUNDRED_VND* Cash.ONEHUNDRED_VND.getValue();
        total = total+this.numberTWOHUNDRED_VND* Cash.TWOHUNDRED_VND.getValue();
        return total;
    }
}
