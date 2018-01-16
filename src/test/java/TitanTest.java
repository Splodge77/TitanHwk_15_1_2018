import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TitanTest {

    Bob bob;

    @Before
    public void before(){
        bob = new Bob();
    }

    @Test
    public void bobCanRoar(){
        assertEquals("Bob Roars!", bob.roar("Bob"));
    }

}
