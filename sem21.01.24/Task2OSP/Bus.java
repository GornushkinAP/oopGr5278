package Task2OSP;

public class Bus implements SpeedCalculator {
    @Override
    public double calculateAllowedSpeed(Vehicle vehicle) {
               return vehicle.getMaxSpeed() * 0.6;
    

}
}