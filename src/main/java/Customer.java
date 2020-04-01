import vehicle.Car;

import java.util.ArrayList;

public class Customer {

    private int wallet;
    private ArrayList<Car> cars;

    public Customer(int wallet){
        this.wallet = wallet;
        this.cars = new ArrayList<Car>();
    }

    public int getWallet() {
        return wallet;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void buyCar(Car car){
        this.cars.add(car);
        this.wallet -= car.getPrice();
    }
}
