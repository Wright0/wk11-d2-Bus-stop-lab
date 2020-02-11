import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus partyBus;
    private Person person;
    private BusStop waverley;

    @Before
    public void before(){
        partyBus = new Bus("London", 5);
        waverley = new BusStop("Waverley");
        person = new Person();

        waverley.addPersonToQueue(person);
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, partyBus.getPassengerCount());
    }

    @Test
    public void canAddPassengerIfSpaceAvailable(){
        partyBus.addPassenger(person);
        assertEquals(1, partyBus.getPassengerCount());
    }

    @Test
    public void cannotAddBecauseOverCapacity(){
        List<Person> peopleToAdd = Arrays.asList(person, person, person, person, person, person);
        ArrayList<Person> newPassengerList = new ArrayList<Person>(peopleToAdd);
        partyBus.addMultiplePassengers(newPassengerList);
        assertEquals(5, partyBus.getPassengerCount());
    }

    @Test
    public void canRemovePassenger(){
        partyBus.addPassenger(person);
        partyBus.removePassenger();
        assertEquals(0, partyBus.getPassengerCount());
    }

    @Test
    public void canPickUpPassengerFromBusStop(){
        partyBus.pickUpFromBusStop(waverley);
        assertEquals(0, waverley.getQueueCount());
        assertEquals(1, partyBus.getPassengerCount());
    }



}
