public class HotDrink extends BottleDrink {
    
    private float temperature;

    public HotDrink(float price, float place, double volume, float temperature, String name, long id){
        super(price, place, volume, name, id);
        this.temperature = temperature;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    
    @Override
    public String toString(){
        return super.toString() + "temperature = " + this.temperature + "\n";
    }

}
