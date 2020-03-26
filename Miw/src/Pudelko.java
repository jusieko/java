public class Pudelko {
    //in centymeters
    int szerokosc, dlugosc, wysokosc,objetosc;
    //in grams
    int waga;
    String name;
    public Pudelko(int szerokosc, int dlugosc, int wysokosc, int waga, String name){
        this.szerokosc=szerokosc;
        this.dlugosc=dlugosc;
        this.wysokosc=wysokosc;
        this.objetosc=szerokosc*dlugosc*wysokosc;
        this.waga=waga;
        this.name=name;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
