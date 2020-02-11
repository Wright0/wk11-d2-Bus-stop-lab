import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop waverley;
    private Person person1;

    @Before
    public void before(){
        waverley = new BusStop("Waverley");
        person1 = new Person();
    }

    @Test
    public void busStopStartsEmpty(){
        assertEquals(0, waverley.getQueueCount());
    }

    @Test
    public void canAddPersonToQueue(){
        waverley.addPersonToQueue(person1);
        assertEquals(1, waverley.getQueueCount());
    }

    @Test
    public void canRemovePersonFromQueue(){
        waverley.addPersonToQueue(person1);
        waverley.removePersonFromQueue();
        assertEquals(0, waverley.getQueueCount());
    }
}
