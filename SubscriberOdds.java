package HW8;

public class SubscriberOdds implements ObserverInterface {

  private int oddsCount = 0;

  @Override
  public void notifyObserver(Event e) {

    if (e.getEventData % 2 != 0)
        System.out.println("Event " + event.getNumber() + " is odd: " + event.getData());
        oddsCount = oddsCount + 1;

        if (oddsCount > 15) {
          unregisterMe();
        }
  }
}
