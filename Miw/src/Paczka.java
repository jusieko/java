

public class Paczka extends Pudelko implements Comparable<Paczka>, Stackable {

    public Paczka(int wysokosc,int szerokosc, int dlugosc, int waga, String name){
        super(wysokosc,szerokosc,dlugosc,waga,name);
    }





    @Override
    public String toString() {
        return name + " zapelnienie: " + objetosc/waga + "g/cm^3" ;
    }

    @Override
    public int compareTo(Paczka p) {
        //Show object with greater "zapelnieine"

            if ((this.objetosc/this.waga)-(p.objetosc/p.waga)<0){
                return 1;
            }

         else if ((this.objetosc/this.waga)-(p.objetosc/p.waga)>0){
                return -1;
            }
        else
            return 0;
        }

    @Override
    public boolean stack(Paczka p) {
        if (p.szerokosc<=this.szerokosc&&p.dlugosc<=this.dlugosc){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean stack(Worek w) {
        return false;
    }
}


