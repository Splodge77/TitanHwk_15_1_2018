import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CthuluTest {

    Cthulu cthulu;

    @Before
    public void before(){
        cthulu = new Cthulu("Jim", 4000, 500);
    }

    @Test
    public void hasName(){
        assertEquals("Jim", cthulu.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(4000, cthulu.getHp());
    }

    @Test
    public void hasDmg() {
        assertEquals(500, cthulu.getDmg());
    }
}
