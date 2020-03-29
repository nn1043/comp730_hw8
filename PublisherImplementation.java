package HW8;
import java.util.ArrayList;

public class PublisherImplementation implements PublisherInterface {

  ObserverInterface observers = new ArrayList<ObserverInterface>();

  public void registerObserver(ObserverInterface o) {
    observers.add(o);
    //JUNIT
    //return observers;
  }

  public void removeObserver(ObserverInterface o) {
    observers.remove(o);
  }

  public void notifyObservers(Event e) {
    for (ObserverInterface o : observers) {
      o.notifyObserver(e);
    }
  }

  public void generateEvent() {
    Event e = new Event();
    notifyObservers(e);
  }

  public void runSimulation() {
    for (i = 0; i < 201; i++) {
      generateEvent();
    }
  }
}
