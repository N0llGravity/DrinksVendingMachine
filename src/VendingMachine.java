import java.util.ArrayList;

public interface VendingMachine {
    void addDrink(ArrayList<BottleDrink> addDrinks);
    
    public void getProduct(double volume, float temperature, String name);
    
}