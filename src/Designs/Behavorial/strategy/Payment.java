package src.Designs.Behavorial.strategy;

public class Payment {
    private PayMethode payType;

    public void setPayment(PayMethode payType) {
        this.payType = payType;
    }

    public void executePayment(){
        if (payType != null) {
            payType.payment();
        }
        else {
            throw new IllegalArgumentException("Payment type cannot be null");
        }
    }
}
