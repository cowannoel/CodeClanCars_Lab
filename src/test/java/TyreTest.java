import org.junit.Before;
import org.junit.Test;
import vehicle.Tyre;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre("Good Year");
    }

    @Test
    public void hasMake(){
        assertEquals("Good Year", tyre.getMake());
    }
}
