package HW8;

public class SubscriberThrees implements ObserverInterface {

  private int threesCount = 0;

  @Override
  public void notifyObserver(Event e) {

    if (e.getEventData % 3 == 0)
        System.out.println("Event " + event.getNumber() + " is divisible by three: " + event.getData());
        threesCount = threesCount + 1;

        if (threesCount > 12) {
          unregisterMe();
        }
  }
}