import java.util.ArrayList;
import java.util.List;

public class Car {

    String marka, model, nadwozie, silnik, drzwi, rabat;
    List<String> list = new ArrayList<String>();

    public Car(){

    }

    public void setDrzwi(String drzwi) {
        this.drzwi = drzwi;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setNadwozie(String nadwozie) {
        this.nadwozie = nadwozie;
    }

    public void setRabat(String rabat) {
        this.rabat = rabat;
    }

    public void setSilnik(String silnik) {
        this.silnik = silnik;
    }
    public void addToList(String opcja){
        list.add(opcja);
    }


    public String getDrzwi() {
        return drzwi;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getNadwozie() {
        return nadwozie;
    }

    public String getRabat() {
        return rabat;
    }

    public String getSilnik() {
        return silnik;
    }

    @Override
    public String toString() {
        return "\nMarka: "+ marka+" model: "+model + " nadwozie: "+ nadwozie+ " silnik: "+silnik+" drzwi: "+ drzwi+ " rabat: " + rabat +
                "\n" + "lista opcji: "+ list+"\n";
    }
}
