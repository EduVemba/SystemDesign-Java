package src.Designs.Behavorial.observer;

public class OberserverMain {
    public static void main(String[] args) {

        ConcretSubject subject = new ConcretSubject();

        ConcreteObserver obs1 = new ConcreteObserver("Oberserver1");
        ConcreteObserver obs2 = new ConcreteObserver("Oberserver2");


        subject.addObserver(new Observer[]{obs1, obs2});

        subject.setState("New Message");

        subject.deleteObserver(obs1);

        subject.setState("2 New Messages");



    }
}
