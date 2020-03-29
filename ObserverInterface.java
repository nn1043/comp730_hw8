package HW8;

public interface ObserverInterface {

  public void notifyObserver(Event e);

  public void unregisterMe(PublisherImplementation p) {
    p.removeObserver(this);
  }
}
