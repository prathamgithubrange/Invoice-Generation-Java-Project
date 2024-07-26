package Bill;

import java.util.HashMap;
import java.util.Map;

public class Product  {
    private static Map<String, ProductDetails> products = new HashMap<>();

    static {
        products.put("Rice", new ProductDetails(40, "No Tax"));
        products.put("Petrol", new ProductDetails(65, "VAT Only"));
        products.put("Soap", new ProductDetails(10, "SGST and CGST"));
        // Add more products as needed
    }

    public static ProductDetails getProductDetails(String productName) {
        return products.get(productName);
    }
}

