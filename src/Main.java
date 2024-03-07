import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //                              float price, float place, float volume, String name, long id, float temperature
        BottleDrink item1 = new BottleDrink(50, 5, 0.5, "Sprite", 00001);
        BottleDrink item2 = new BottleDrink(40, 8, 0.5, "Bonaqua", 00002);
        BottleDrink item3 = new BottleDrink(50, 12, 0.5, "Cola", 00003);
        BottleDrink item4 = new HotDrink(150, 20, 0.35, 70, "Raff", 00004);
        BottleDrink item5 = new HotDrink(150, 19, 0.25, 10, "Mazagran", 00005);

        ArrayList <BottleDrink> listDrinks = new ArrayList<>();

        listDrinks.add(item1);
        listDrinks.add(item2);
        listDrinks.add(item3);
        listDrinks.add(item4);
        listDrinks.add(item5);

        HotDrinksVendingMachine hdvm = new HotDrinksVendingMachine();
        hdvm.addDrink(listDrinks);
        hdvm.getProduct(0.25, 10, "Mazagran");
    }

}
