package Lesson4_LeskovSubsitutionPrinciple.ProblemCode.BetterCode;

public class MasterCard  extends CreditCard implements InternationPaymentCreditCard {

    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of MasterCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer impl of MasterCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay impl of MasterCard");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate payment impl of MasterCard");
    }

    @Override
    public void internationalPayment() {
        System.out.println("Intl payment impl of MasterCard");
    }

    //    public void upiPayment() {
//
//    }
//
//    @Override
//    public void intlPayment() {
//        System.out.println("Intl payment impl of MasterCard");
//    }
}
