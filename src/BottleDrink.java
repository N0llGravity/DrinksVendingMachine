public class BottleDrink {
    protected float price;
    protected float place;
    protected String name;
    protected long id;
    protected double volume;


    public BottleDrink(float price, float place, double volume, String name, long id){
        this.price = price;
        this.place = place;
        this.name = name;
        this.id = id;
        this.volume = volume;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if(price <= 0)
        this.price = 10;
        else
        this.price = price;
    }

    public float getPlace() {
        return place;
    }

    public void setPlace(float place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }
    
    @Override
    public String toString(){
        return "\nPrice = " + this.price + "\n"+
                "Place = " + this.place + "\n"+
                "Volume = " + this.volume + "\n"+
                "Name = " + this.name + "\n"+
                "Id = " + this.id + "\n";
    }
    
}
