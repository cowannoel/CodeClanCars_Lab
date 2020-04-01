import org.junit.Before;
import org.junit.Test;
import vehicle.Engine;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    
    Engine engine;
    
    @Before
    public void before(){
        engine = new Engine("diesel");
    }

    @Test
    public void hasType(){
        assertEquals("diesel", engine.getType());
    }


}
