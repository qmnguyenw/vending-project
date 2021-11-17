package vending;

public enum Cash {
    TEN_VND(10), TWENTY_VND(20), FIFTY_VND(50), ONEHUNDRED_VND(100), TWOHUNDRED_VND(200);

    private int value;

    Cash(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public static int[] parseCash(String coins){
        // parse 
        String[] numberCoinsInText = coins.split(",");
        int[] result = new int[numberCoinsInText.length];
        for(int index=0;index<numberCoinsInText.length;index++){
            result[index] = Integer.parseInt(numberCoinsInText[index]);
        }
        return result;
    }
}
