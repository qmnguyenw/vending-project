package vending;

public enum Product {
    COKE(1, 10),
    PEPSI(2, 10),
    SODA(3, 20),
    EMPTY(0, 0);

    private int selectionNumber;
    private int price;

    Product(int selectionNumber, int price) {
        this.selectionNumber = selectionNumber;
        this.price = price;
    }

    public int getSelectionNumber() {
        return selectionNumber;
    }

    public int getPrice() {
        return this.price;
    }

    public static Product valueOf(int numberSelection){
        for(Product product: Product.values()){
            if(numberSelection == product.getSelectionNumber()){
                return product;
            }
        }
        return EMPTY;
    }
}
