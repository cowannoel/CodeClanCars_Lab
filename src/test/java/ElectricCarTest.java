import org.junit.Before;
import org.junit.Test;
import vehicle.ElectricCar;
import vehicle.Engine;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine("electric");
        electricCar = new ElectricCar(20000, "red", engine);
    }
    
    @Test
    public void hasPrice(){
        assertEquals(20000, electricCar.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals("red", electricCar.getColour());
    }

    @Test
    public void hasEngineType(){
        assertEquals("electric", electricCar.getEngine().getType());
    }
}
