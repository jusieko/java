public class Konto {
    String nrkonta;
    double saldo;

    public Konto(String nrkonta) {
        int liczbaTestow=0;
        //sprawdz nr kontrolny
        if (sprawdzKontrolny(nrkonta)) {
                liczbaTestow++;
            }
        //sprawdz liczbe i prawidlowosc znakow
        if (sprawdzZnaki(nrkonta)) {
                liczbaTestow++;

            if (liczbaTestow==2)
                this.nrkonta=nrkonta;
            saldo=0;
        }
    }

    public void wplacSrodki(double srodki){
        this.saldo=this.saldo+srodki;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNrkonta() {
        return nrkonta;
    }

    public double wyciagnij(double withdraw){
        try {
            if (this.saldo-withdraw>0){
                this.saldo = this.saldo-withdraw;
            }else {
                throw new NoFoundExeption(12);

            }
        }catch (NoFoundExeption e){
            e.printStackTrace();
        }
        return saldo;
    }
    /*
    public String generateNumKonta(){
        nrkonta="";
        for (int i = 0; i<7; i++){
            nrkonta=nrkonta+String.valueOf((int)(Math.random()*10));
        }
        return nrkonta;
    }
*/
    public boolean sprawdzKontrolny(String nrkonta) {
        int tablicaWag[] = new int[]{7, 1, 3, 9, 7, 11, 3};
        char tablicaNumeruKonta[] = nrkonta.toCharArray();
        int suma=0;
        int dodawanie=0;
        String konto="";
        for (int i=0;i<7;i++){
            dodawanie=(tablicaWag[i]*Integer.parseInt(String.valueOf(tablicaNumeruKonta[i])));

            suma=suma+dodawanie;
            konto=konto+String.valueOf(tablicaNumeruKonta[i]);
        }
        int cyfraKontrolna=suma%10;
        konto=konto+String.valueOf(cyfraKontrolna);
        try {


            if (nrkonta.equals(konto)) {
                return true;

            } else {
                throw new ControlExeption();

            }
        }catch (ControlExeption e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean sprawdzZnaki(String nrkonta) throws java.lang.NumberFormatException {
        int dobre = 0;
        for (int i = 0; i < 7; i++) {
            if ((int) nrkonta.charAt(i) >= 48 && (int) nrkonta.charAt(i) <= 57) {
                dobre++;
            }
        }
        try {
            if (dobre == 7) {
                return true;
            } else {
                throw new java.lang.NumberFormatException();

            }
        }catch (java.lang.NumberFormatException e){
            e.printStackTrace();
            return false;
        }


    }

}
