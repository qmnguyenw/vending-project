package vending;

public class TextVendingMachineInterface implements VendingMachineInterface {

    private int selectedProduct;
    private CashBundle change;

    @Override
    public void displayProducts() {
        System.out.println(" *********************************************");
        System.out.println("     WELCOME TO COIN-OPERATED SODA MACHINE    ");
        System.out.println(" *********************************************");
        System.out.println("            Products available:               ");
        System.out.println("\n");
        for (Product product : Product.values()) {
            if (!Product.EMPTY.equals(product)) {
                System.out.println("\t" + product.getSelectionNumber() + ".\t" + product.name() + " - Price: " + product.getPrice() + ".000VND\t");
            }
        }
        System.out.println("\n");
        System.out.println(" Please select your product: ");
    }

    @Override
    public void selectProduct(int product) {
        this.selectedProduct = product;
    }

    @Override
    public void displayEnterMoneyMessage() {
        System.out.println("Please enter money as follows: ");
        System.out.println(" num of 10.000 VND, num of 20.000 VND, num of 50.000 VND, num of 100.000 VND, num of 200.000 VND");
        System.out.println("Example: If you would like to enter 40.000 VND: 0,2,0,0,0");
        System.out.println("Please enter money:");
    }

    @Override
    public void enterCoins(int... coins) {
        VendingMachineRequest request = new VendingMachineRequest(selectedProduct, coins);
        change = calculateChange(request);
    }

    @Override
    public void displayChangeMessage() {
        System.out.println("\n");
        System.out.println("Your change is :" + change.getTotal() + ".000 VND splitted as follows: ");
        System.out.println("\t200.000 VND: " + change.numberTWOHUNDRED_VND);
        System.out.println("\t100.000 VND: " + change.numberONEHUNDRED_VND);
        System.out.println("\t50.000 VND: " + change.numberFIFTY_VND);
        System.out.println("\t20.000 VND: " + change.numberTWENTY_VND);
        System.out.println("\t10.000 VND: " + change.numberTEN_VND);
    }

    private Calculator calculator = new SimpleCalculator();

    @Override
    public CashBundle calculateChange(VendingMachineRequest request) {
        int total = calculator.calculateTotal(request.enteredCash);
        int totalChange = total - request.product.getPrice();
        if (totalChange < 0) {
            System.out.println("Not enough money to buy.");
            return calculator.calculateChange(total);
        } else {
            return calculator.calculateChange(totalChange);
        }
    }
}
