public class Worek implements Comparable<Worek>, Stackable {
    int waga,srednica,wysokosc;

    public Worek(int srednica, int wysokosc, int waga){
        this.waga=waga;
        this.srednica=srednica;
        this.wysokosc=wysokosc;
    }


    @Override
    public int compareTo(Worek w) {
        if (((this.srednica*this.wysokosc)/this.waga)-((w.srednica*w.wysokosc)/w.waga)<0) {
            return 1;
        }
        else if (((this.srednica*this.wysokosc)/this.waga)-((w.srednica*w.wysokosc)/w.waga)>0){
            return -1;
        }
        else {
            return 0;
        }

    }

    @Override
    public boolean stack(Paczka p) {
        return false;
    }

    @Override
    public boolean stack(Worek w) {
        if (w.wysokosc<=this.wysokosc&&w.srednica<=this.srednica){
            return true;
        }
        else {
            return false;
        }
    }
}
