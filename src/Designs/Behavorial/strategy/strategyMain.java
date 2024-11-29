package src.Designs.Behavorial.strategy;

public class strategyMain {
    public static void main(String[] args) {

        Payment payment = new Payment();

        PayMethode cardPay = new CardPay();
        payment.setPayment(cardPay);
        payment.executePayment();

        PayMethode moneyPay = new MoneyPay();
        payment.setPayment(moneyPay);
        payment.executePayment();

        PayMethode phonePay = new PhonePay();
        payment.setPayment(phonePay);
        payment.executePayment();
    }
}
