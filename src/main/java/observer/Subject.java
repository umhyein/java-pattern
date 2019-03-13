package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void datach(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer ob: observers){
            ob.update();
        }
    }
}
