package Task2OSP;

public class Car implements SpeedCalculator {
    @Override
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed() * 0.8;
    }
}