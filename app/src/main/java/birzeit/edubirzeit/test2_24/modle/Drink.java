package birzeit.edubirzeit.test2_24.modle;

import androidx.annotation.NonNull;

public class Drink {
    private String catigory;
    private String name;
    private int UnitPrice;


    public Drink(String catigory, String name, int unitPrice) {
        this.catigory = catigory;
        this.name = name;
        UnitPrice = unitPrice;
    }

    public String getCatigory() {
        return catigory;
    }

    public void setCatigory(String catigory) {
        this.catigory = catigory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        UnitPrice = unitPrice;
    }

    @NonNull
    @Override
    public String toString() {
        return getName()+", Price: "+getUnitPrice();
    }
}
