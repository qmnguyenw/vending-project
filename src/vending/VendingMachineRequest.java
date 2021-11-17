package vending;

public class VendingMachineRequest {
    public Product product;
    public CashBundle enteredCash;

    public VendingMachineRequest(int selectedProduct,int... enteredCash){
        this.product = Product.valueOf(selectedProduct);
        this.enteredCash = new CashBundle(enteredCash);
    }
}
