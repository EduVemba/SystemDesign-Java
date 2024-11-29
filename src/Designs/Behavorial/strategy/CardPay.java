package src.Designs.Behavorial.strategy;

public class CardPay implements PayMethode{

    @Override
    public void payment(){
        System.out.println("Card Pay");
    }
}
