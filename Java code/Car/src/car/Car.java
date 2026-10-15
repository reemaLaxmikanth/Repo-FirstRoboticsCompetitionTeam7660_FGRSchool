package car;

public class Car {
    public static int carCount = 0;
    public String model;
    private String color;
    private int speed;

    public Car(String model, String color, int speed) {
        System.out.println("Constructor(): Creating a new car...");
        this.model = model;
        this.color = color;
        this.speed = speed;
       
    }

    public String getColor() {
        return color;
    }
    
    public int getSpeed() {
        return speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate(int increment) {
        speed += increment;
    }

    public void brake(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        } else {
            System.out.println("Car is braking. New speed: " + speed + " km/h");
        }
    }

    public void displaySpeedInfo() {
        System.out.println("Car color: " + color + ", Speed: " + speed + " km/h");
    }
}
