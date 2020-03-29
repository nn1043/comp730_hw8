package HW8;

public class SubscriberEvens implements ObserverInterface {

  private int evensCount = 0;

  @Override
  public void notifyObserver(Event e) {

    if (e.getEventData % 2 == 0)
        System.out.println("Event " + event.getNumber() + " is even: " + event.getData());
        evensCount = evensCount + 1;

        if (evensCount > 15) {
          unregisterMe();
        }
  }
}