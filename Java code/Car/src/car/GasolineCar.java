package car;

public class GasolineCar extends Car {
    private double fuelLevel;

    public GasolineCar(String model, String color, int speed, double fuelLevel) {
        super(model, color, speed);
        this.fuelLevel = fuelLevel;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    @Override
    public void displaySpeedInfo() {
        System.out.println("Gasoline " + model + " (" + getColor() + "), Speed: "
                + getSpeed() + " km/h, Fuel: " + fuelLevel + " L");
    }
}
