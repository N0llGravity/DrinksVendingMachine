import java.util.ArrayList;

public class HotDrinksVendingMachine implements VendingMachine {
    ArrayList<BottleDrink> listDrinks = new ArrayList<>();

    @Override
    public void addDrink(ArrayList<BottleDrink> addDrinks) {
        listDrinks = addDrinks;
    }
    

    @Override
    public void getProduct(double volume, float temperature, String name) {
        for (BottleDrink drink : listDrinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume && ((HotDrink) drink).getTemperature() == temperature)
                System.out.println(drink);
        }
    }




}
