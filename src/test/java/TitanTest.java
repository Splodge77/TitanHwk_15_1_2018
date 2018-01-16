import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TitanTest {

    Titan titan;

    @Before
    public void before(){
        Titan titan = new Bob();
    }

    @Test
    public void titanCanRoar(){
        assertEquals("Bob Roars!", titan.roar("Bob"));
    }

}
