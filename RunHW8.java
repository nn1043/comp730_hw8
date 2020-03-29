package HW8;

public class RunHW8 {

  public static void main(String[] args) {
    PublisherImplementation pub = new PublisherImplementation();

    SubscriberOdds odds = new SubscriberOdds();
    SubscriberEvens evens = new SubscriberEvens();
    SubscriberThrees threes = new SubscriberThrees();

    pub.registerObserver(odds);
    pub.registerObserver(evens);
    pub.registerObserver(threes);

    pub.runSimulation();

  }
}
