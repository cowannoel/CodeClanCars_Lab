import org.junit.Before;
import org.junit.Before;
import org.junit.Test;
import vehicle.Car;
import vehicle.Engine;
import vehicle.HybridCar;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Engine engine;
    Customer customer;
    HybridCar hybridCar;

    @Before
    public void before(){
        engine = new Engine("hybrid");
        hybridCar = new HybridCar(15000, "blue", engine);
        customer = new Customer(1000000);
    }

    @Test
    public void hasWallet(){
        assertEquals(1000000, customer.getWallet());
    }

    @Test
    public void carsStartOffEmpty(){
        assertEquals(0, customer.getCars().size());
    }

    @Test
    public void canBuyHybridCar(){
        customer.buyCar(hybridCar);
        assertEquals(1, customer.getCars().size());
        assertEquals(985000, customer.getWallet());
    }

}
