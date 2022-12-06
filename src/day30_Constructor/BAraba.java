package day30_Constructor;

public class BAraba {
    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    String yakit = "Yakit turu belirtilmedi";
    int yil;
    int fiyat;

    public BAraba(String marka, String model, String yakit, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public BAraba() {
    }

    @Override
    public String toString() {
        return "BAraba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakit='" + yakit + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }public int maxHiz(String yakit){
        int maxHiz =120;
        if (yakit.equalsIgnoreCase("Hibrit")){
            maxHiz = 190;
        } else if (yakit.equalsIgnoreCase("LPG")) {
            maxHiz = 195;
        } else if (yakit.equalsIgnoreCase("Elektrikli")) {
            maxHiz = 200;
        }
        return  maxHiz;
    }
}
