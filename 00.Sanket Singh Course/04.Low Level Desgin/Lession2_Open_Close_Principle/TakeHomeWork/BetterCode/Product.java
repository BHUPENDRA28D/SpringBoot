package Lession2_Open_Close_Principle.TakeHomeWork.BetterCode;

import Lession2_Open_Close_Principle.TakeHomeWork.ProblematicCode.DiscountCalculator;

public class Product {
    private double price;
    private DiscountStratergies discountStratergies;

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discountStratergies.applyDiscount(price);
    }
}





