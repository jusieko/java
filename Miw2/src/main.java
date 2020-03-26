public class main {
    public static void main(String[] args) {

        Konto k2 = new Konto( "10103421");

        System.out.println(k2.getSaldo());
        k2.wplacSrodki(100);
        k2.wyciagnij(20);
        System.out.println(k2.getSaldo());
        k2.wyciagnij(10);
        System.out.println(k2.getSaldo());
        System.out.println();
        //zabraraklo srodkow
        k2.wyciagnij(100);

        Konto k3 = new Konto( "10103422");
        Konto k4 = new Konto( "1a103422");


    }
}
