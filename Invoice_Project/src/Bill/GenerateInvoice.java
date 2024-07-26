package Bill;

import java.util.List;

public class GenerateInvoice {
    public static void generateInvoice(List<String> purchasedProducts) {
        double totalPrice = 0;
        double totalTax = 0;

        System.out.println("-----------------------------");

        for (String productName : purchasedProducts) {
            ProductDetails product = Product.getProductDetails(productName);
            double price = product.getPrice();
            String taxGroup = product.getTaxGroup();

            double taxAmount = 0;
            for (String tax : TaxGroup.getTaxGroup(taxGroup)) {
                taxAmount += price * Tax.getTaxPercentage(tax);
            }

            System.out.println(productName + "     " + price + " " + Math.round(taxAmount * 100.0) / 100.0);

            totalPrice += price;
            totalTax += taxAmount;
        }

        double grandTotal = totalPrice + totalTax;

        System.out.println("Total         " + totalPrice + " " + Math.round(totalTax * 100.0) / 100.0);
        System.out.println("Grand Total  : " + Math.round(grandTotal * 100.0) / 100.0);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        List<String> purchasedProducts = List.of("Petrol", "Soap");
        generateInvoice(purchasedProducts);
    }
}
