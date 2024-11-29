package src.Designs.Behavorial.strategy;

public class MoneyPay implements PayMethode {
    @Override
    public void payment(){
        System.out.println("Money Pay");
    }
}
