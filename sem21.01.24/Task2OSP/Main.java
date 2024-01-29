package Task2OSP;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(120, new Car());
        double allowedSpeedForCar = car.calculateAllowedSpeed();

        Vehicle bus = new Vehicle(80, new Bus());
        double allowedSpeedForBus = bus.calculateAllowedSpeed();

    }
}