package birzeit.edubirzeit.test2_24.modle;

import java.util.ArrayList;

public class DrinksMockup {

    private ArrayList<Drink> drinks = new ArrayList<>();


    public DrinksMockup(){
        drinks.add(new Drink("Cold Drinks", "Sprite", 5));

        drinks.add(new Drink("Hot Drinks", "Hot chocklete", 20));

        drinks.add(new Drink("Hot Drinks", "Tea", 12));

        drinks.add(new Drink("Cocacola", "Cocacola", 5));

    }

    public ArrayList<Drink> getDrinks (String cat){

        ArrayList<Drink> result = new ArrayList<>();

        for (Drink d : drinks){
            if(d.getCatigory().equals(cat)){
                result.add(d);
            }
        }
        return result;
    }

    public String[] getCatigories(){
        String[] cats = {"Cold Drinks", "Hot Drinks", "Cocacola", "Fresh"};
        return cats;
    }
}
