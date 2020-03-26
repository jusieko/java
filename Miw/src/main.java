import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Paczka paczka1 = new Paczka(10,10,10,10,"paczka1");
        Paczka paczka2 = new Paczka(10, 10, 10,8,"paczka2");
        Paczka paczka3 = new Paczka(10, 10, 10,12,"paczka3");
        Paczka paczka4 = new Paczka(4, 11, 10,9,"paczka4");
        Paczka paczka5 = new Paczka(5, 8, 10,7,"paczka5");
        System.out.println("CompareTo output");
        System.out.println(paczka1.compareTo(paczka2));

        List<Paczka> lista = new ArrayList<Paczka>();
        lista.add(paczka1);
        lista.add(paczka2);
        lista.add(paczka3);
        lista.add(paczka4);
        lista.add(paczka5);

        System.out.println("Before Collections.sort");
        for (Paczka p:lista){
            System.out.println(p);
        }

        Collections.sort(lista);

        System.out.println("After collections.sort");

        for (Paczka p:lista){
            System.out.println(p);
        }
        System.out.println();
        System.out.println("najmniejszy element: "+Collections.min(lista));

        System.out.println(paczka1.stack(paczka2));

        Worek w1 = new Worek(10,10,10);
        Worek w2 = new Worek(10,10,5);

        System.out.println();
        System.out.println(w1.compareTo(w2));
    }
}
