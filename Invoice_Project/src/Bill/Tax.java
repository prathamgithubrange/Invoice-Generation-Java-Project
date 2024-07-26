package Bill;

import java.util.HashMap;
import java.util.Map;

public class Tax {
    private static Map<String, Double> taxes = new HashMap<>();

    static {
        taxes.put("VAT", 0.18);
        taxes.put("SGST", 0.09);
        taxes.put("CGST", 0.09);
    }

    public static Double getTaxPercentage(String taxName) {
        return taxes.get(taxName);
    }
}
