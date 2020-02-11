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

    public void addPassenger(Person personBanana) {
        if (getPassengerCount() < this.capacity) {
            this.passengers.add(personBanana);
        }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }

    public void addMultiplePassengers(ArrayList<Person> people){
        for (Person person : people){
            this.addPassenger(person);
        }
    }

    public void pickUpFromBusStop(BusStop busStop) {
        if(this.getPassengerCount() < this.capacity && busStop.getQueueCount() > 0){
            Person personRemoved = busStop.removePersonFromQueue();
            this.addPassenger(personRemoved);
        }
    }
}
