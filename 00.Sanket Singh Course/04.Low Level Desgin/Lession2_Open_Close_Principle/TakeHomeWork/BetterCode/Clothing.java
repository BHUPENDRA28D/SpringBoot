package Lession2_Open_Close_Principle.TakeHomeWork.BetterCode;

public class Clothing implements DiscountStratergies {

    @Override
    public double applyDiscount(double price) {
        return price * 0.20; // 20% discount

    }
}
