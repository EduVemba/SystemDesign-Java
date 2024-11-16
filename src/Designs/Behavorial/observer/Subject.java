package src.Designs.Behavorial.observer;

import java.util.ArrayList;
import java.util.List;
import src.Designs.Behavorial.observer.Observer;

public abstract class Subject implements Observable {
    private List<Observer> observerList;

    public Subject() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer[] observers){
        for (Observer observer : observers){
            if (!observerList.contains(observer)){
                this.observerList.add(observer);
            }
        }
    }

    @Override
    public void deleteObserver(Observer observer){
        this.observerList.remove(observer);
    }

    @Override
    public void notify(Object obj){
        for (Observer observer : this.observerList){
            observer.update(obj);
        }
    }




}
