package src.Designs.Behavorial.strategy;

public class PhonePay implements PayMethode{

    @Override
    public void payment(){
        System.out.println("Phone Pay");
    }
}
