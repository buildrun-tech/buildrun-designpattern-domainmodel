package badcode;

import common.Product;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyBadCode {

    private static final Logger logger = Logger.getLogger(MyBadCode.class.getName());

    public static void main(String[] args) {

        var laptop = new Product(
                "Laptop",
                3500.00
        );

        logger.log(Level.INFO,
                "Final price calculation");

        var profit = 200.00;

        var finalPrice =
                laptop.getPrice() + profit;

        logFinalPrice(finalPrice);
    }

    private static void logFinalPrice(Double finalPrice) {
        logger.log(Level.INFO, "Result: {0}",
                finalPrice);
    }
}
