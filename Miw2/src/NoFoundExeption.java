public class NoFoundExeption extends Exception {
    public NoFoundExeption(double ujemne){
        super("Zabraklo na koncie: "+ ujemne);
    }
}
