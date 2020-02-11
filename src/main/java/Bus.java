import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public void addOnePassenger(Person personBanana) {
        if (getPassengerCount() < capacity) {
            this.passengers.add(personBanana);
        }
    }

    public void removeOnePassenger() {
        this.passengers.remove(0);
    }
}
