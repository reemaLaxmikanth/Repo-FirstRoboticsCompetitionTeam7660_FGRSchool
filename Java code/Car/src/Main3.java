import car.Car;
import car.ElectricCar;
import car.GasolineCar;
import car.HybridCar;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Main3...");
        ElectricCar Tesla = new ElectricCar("Tesla", "Blue", 0, 100);
        GasolineCar f150 = new GasolineCar("F150", "Red", 0, 80.0);
        HybridCar accord = new HybridCar("Accord", "Silver", 0, 75, 40.0);
        Person person = new Person("Alex");
        System.out.println("**** Day1 **** ");
        person.drive(Tesla, 30);
        System.out.println("**** Day2 **** ");
        person.drive(f150, 20);
        System.out.println("**** Day3 **** ");
        person.drive(accord, 25);

        System.out.println("Total number of cars created: " + Car.carCount);
    }
}
