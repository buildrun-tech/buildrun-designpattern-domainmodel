package goodcode;

import common.Product;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyGoodCode {

    private static final Logger logger = Logger.getLogger(MyGoodCode.class.getName());

    public static void main(String[] args) {

        var laptop = new Product(
                "Laptop",
                3500.00
        );

        logger.log(Level.INFO,
                "Final price calculation");

        var finalPrice = laptop.getFinalPrice();

        logFinalPrice(finalPrice);
    }

    private static void logFinalPrice(Double finalPrice) {
        logger.log(Level.INFO, "Result: {0}",
                finalPrice);
    }

}
