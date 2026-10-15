
import car.Car;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Main1...");
        Car car1 = new Car("F150", "Red", 0);

        // Demonstrating the use of public and private members
        System.out.println("Car model: " + car1.model);
        display(car1);
        System.out.println("Accelerating car...");
        car1.accelerate(20);
        car1.displaySpeedInfo();
        Car.carCount++;
        System.out.println("Total number of cars created: " + Car.carCount);

        Car car2 = new Car("Mustang", "Blue", 0);
        display(car2);
        car2.displaySpeedInfo();
        // usin main dispaly function instaed of car2.daisplaySpeedInfo();
        display(car1);
    }
    // Public static function in Main with Car object as parameter
    public static void display(Car car) {
        System.out.println("display(): Printing car info");
        System.out.println("Car color: " + car.getColor());
        System.out.println("Car speed: " + car.getSpeed() + " km/h");
    }
}
