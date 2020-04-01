import vehicle.Car;

import java.util.ArrayList;

public class Dealership {

    private int till;
    private ArrayList<Car> cars;

    public Dealership(int till){
        this.till = till;
        this.cars = new ArrayList<Car>();

    }

    public int getTill() {
        return till;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}
