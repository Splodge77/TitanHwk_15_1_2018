import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GodzillaTest {

    Godzilla godzilla;

    @Before
    public void before(){
        godzilla = new Godzilla("Bob", 3000);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", godzilla.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(3000, godzilla.getHp());
    }
}
