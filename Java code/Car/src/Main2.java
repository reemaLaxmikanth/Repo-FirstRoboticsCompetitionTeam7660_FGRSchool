import car.Car;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Main2...");
        Car f150 = new Car("F150", "Red", 0);
        Car mustang = new Car("Mustang", "Blue", 0);
        Person person = new Person("Alex");

        person.drive(f150, 20);
        person.drive(mustang, 30);
        System.out.println("Total number of cars created: " + Car.carCount);
    }
}
