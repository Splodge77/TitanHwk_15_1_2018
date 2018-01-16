import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TitanTest {

    Titan titan;
    Bob bob;

    @Before
    public void before(){
        Titan titan = new Bob();
    }

    @Test
    public void titanCanRoar(){
        assertEquals("RAWR!", bob.roar());
    }


}
