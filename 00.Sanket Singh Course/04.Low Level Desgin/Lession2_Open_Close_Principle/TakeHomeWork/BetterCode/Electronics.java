package Lession2_Open_Close_Principle.TakeHomeWork.BetterCode;

public class Electronics implements DiscountStratergies {

    @Override
    public double applyDiscount(double price) {
        return price * 0.10; // 10% discount
    }
}
