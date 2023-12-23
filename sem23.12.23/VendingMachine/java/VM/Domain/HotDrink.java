package Domain;

public class HotDrink extends Product {
    
    private float hotDrinkVolume;
    private int temperature;

    public HotDrink(int price, int place, String name, long id, float hotDrinkVolume, int temperature){
        super(price, place, name, id);
        this.hotDrinkVolume = hotDrinkVolume;
        this.temperature = temperature;
    }

    public float getHotDrinkVolume() {
        return hotDrinkVolume;
    }

    public void setHotDrinkVolume(float hotDrinkVolume) {
        this.hotDrinkVolume = hotDrinkVolume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Hot drink volume = " + hotDrinkVolume + "\n" + "Temperature = " + temperature + "\n";
    }
}
