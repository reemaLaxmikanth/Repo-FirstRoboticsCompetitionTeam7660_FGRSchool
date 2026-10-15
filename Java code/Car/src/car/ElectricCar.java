package car;

public class ElectricCar extends Car {
    private int batteryLevel;

    public ElectricCar(String model, String color, int speed, int batteryLevel) {
        super(model, color, speed);
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void displaySpeedInfo() {
        System.out.println("Electric " + model + " (" + getColor() + "), Speed: "
                + getSpeed() + " km/h, Battery: " + batteryLevel + "%");
    }
}
