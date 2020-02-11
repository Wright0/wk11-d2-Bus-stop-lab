import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus partyBus;
    private Person person;

    @Before
    public void before(){
        partyBus = new Bus("London", 5);
        person = new Person();

//        List<Person> peopleToAdd = Arrays.asList(person, person, person, person, person);
//        ArrayList<Person> newPassengerList = new ArrayList<Person>(peopleToAdd);

    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, partyBus.getPassengerCount());
    }

    @Test
    public void canAddPassengerIfSpaceAvailable(){
        partyBus.addOnePassenger(person);
        assertEquals(1, partyBus.getPassengerCount());
    }

    @Test
    public void cannotAddBecauseOverCapacity(){
        partyBus.addOnePassenger(person);
        partyBus.addOnePassenger(person);
        partyBus.addOnePassenger(person);
        partyBus.addOnePassenger(person);
        partyBus.addOnePassenger(person);
        partyBus.addOnePassenger(person);
        assertEquals(5, partyBus.getPassengerCount());
    }

    @Test
    public void canRemovePassenger(){
        partyBus.addOnePassenger(person);
        partyBus.removeOnePassenger();
        assertEquals(0, partyBus.getPassengerCount());
    }

}
