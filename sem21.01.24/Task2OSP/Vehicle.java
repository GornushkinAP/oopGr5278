package Task2OSP;

public class Vehicle {
    private int maxSpeed;
    private SpeedCalculator speedCalculator;

    public Vehicle(int maxSpeed, SpeedCalculator speedCalculator) {
        this.maxSpeed = maxSpeed;
        this.speedCalculator = speedCalculator;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public double calculateAllowedSpeed() {
        return speedCalculator.calculateAllowedSpeed(this);
    }

}
