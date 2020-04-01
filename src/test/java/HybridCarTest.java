import org.junit.Before;
import org.junit.Test;
import vehicle.Car;
import vehicle.HybridCar;
import vehicle.Engine;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine("hybrid");
        hybridCar = new HybridCar(15000, "blue", engine);
    }

    @Test
    public void hasPrice(){
        assertEquals(15000, hybridCar.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals("blue", hybridCar.getColour());
    }

    @Test
    public void hasEngineType(){
        assertEquals("hybrid", hybridCar.getEngine().getType());
    }
}