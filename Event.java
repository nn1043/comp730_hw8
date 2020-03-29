package HW8;

public class Event {

    private int EventNumber = 0;
    private int EventData;

    public Event(int EventNumber, int EventData) {
        EventData = return ((int) (Math.random()*(5000 - 1))) + 1;
        EventNumber = EventNumber + 1;
    }

    public int getEventNumber() { return EventNumber; }
    public int getEventData() {return EventData; }
}
