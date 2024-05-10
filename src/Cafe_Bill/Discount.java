package Cafe_Bill;

public class Discount {

    double discountThreshold = 50.0;
    double discountRate = 0.1;

    public double applyDiscount(double allbill) {
        if (allbill > discountThreshold) {
            double discountAmount = allbill * discountRate;
            allbill -= discountAmount;
            System.out.println("10% discount applied!");
        }
        return allbill;
    }
}

