package car;

public class HybridCar extends Car {
    private int batteryLevel;
    private double fuelLevel;

    public HybridCar(String model, String color, int speed, int batteryLevel, double fuelLevel) {
        super(model, color, speed);
        this.batteryLevel = batteryLevel;
        this.fuelLevel = fuelLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    @Override
    public void displaySpeedInfo() {
        System.out.println("Hybrid " + model + " (" + getColor() + "), Speed: "
                + getSpeed() + " km/h, Battery: " + batteryLevel + "%, Fuel: "
                + fuelLevel + " L");
    }
}
