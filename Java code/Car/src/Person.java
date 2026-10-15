import car.ElectricCar;
import car.GasolineCar;
import car.HybridCar;
import car.Car;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public void drive(Car car, int acceleration) {
        System.out.println(name + " is driving the " + car.model + ".");
        car.accelerate(acceleration);
        car.displaySpeedInfo();
    }

    public void drive(ElectricCar car, int acceleration) {
        System.out.println("Electric-car overload selected.");
        car.accelerate(acceleration);
        car.displaySpeedInfo();
    }

    public void drive(GasolineCar car, int acceleration) {
        System.out.println("Gasoline-car overload selected.");
        car.accelerate(acceleration);
        car.displaySpeedInfo();
    }

    public void drive(HybridCar car, int acceleration) {
        System.out.println("Hybrid-car overload selected.");
        drive((Car) car, acceleration); // Call the general drive method for Car
    }
}
