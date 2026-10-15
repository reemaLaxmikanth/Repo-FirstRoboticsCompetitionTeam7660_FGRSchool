import car.Car;
import car.ElectricCar;
import car.GasolineCar;
import car.HybridCar;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Main4...");
        Car[] cars = {
            new ElectricCar("Tesla", "Blue", 0, 100),
            new GasolineCar("F150", "Red", 0, 80.0),
            new HybridCar("Accord", "Silver", 0, 75, 40.0)
        };

        for (Car car : cars) {
            car.accelerate(25);
            car.displaySpeedInfo();
        }
    }
}
