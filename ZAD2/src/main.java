import javax.swing.*;
import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) {
        String fileName = "cars.csv";
        File file = new File(fileName);
        List<Car> listaSamochodow = new ArrayList<Car>();
        Car car;
        try{

        Scanner inputStream = new Scanner(file);
        if (inputStream.hasNext())
            inputStream.nextLine();

        while (inputStream.hasNext()){
            car=new Car();
            String data = inputStream.nextLine();
            String[] arr = data.split(",");
            car.setMarka(arr[0]);
            car.setModel(arr[1]);
            car.setNadwozie(arr[2]);
            car.setSilnik(arr[3]);
            car.setDrzwi(arr[4]);
            car.setRabat(arr[5]);
            for (int i=6;i<arr.length;i++){
                car.addToList(arr[i]);
            }
            listaSamochodow.add(car);

        }
        inputStream.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println(listaSamochodow.get(0));

        //System.out.println("\n"+listaSamochodow);

        //Tworze kolekcje diseli i suvow
        List<Car> listSuv = new ArrayList<Car>();
        List<Car> listDisel = new ArrayList<Car>();
        for (Car c: listaSamochodow) {
            if (c.getSilnik().equals("diesel")) {
                listDisel.add(c);
            }
            if (c.getNadwozie().equals("SUV")) {
                listSuv.add(c);
            }
        }

        //System.out.println(listDisel);
        //System.out.println(listSuv);

        //tworze czesc wspolna
        List<Car> comon = new ArrayList<Car>(listDisel);
        comon.retainAll(listSuv);
        //System.out.println(comon);
        System.out.println("---------------------------2B----------------------");
        //Tworze kolekcje samochodow z rabatem i Toyot
        List<Car> listToyota = new ArrayList<Car>();
        List<Car> listRabat = new ArrayList<Car>();
        for (Car c: listaSamochodow) {
            if (c.getRabat().equals("tak")) {
                listRabat.add(c);
            }
            if (c.getMarka().equals("Toyota")) {
                listToyota.add(c);
            }
        }

        //System.out.println(listToyota);
        //System.out.println(listRabat);
        List<Car> l2 = new ArrayList<Car>(listRabat);
        l2.removeAll(listToyota);

       // System.out.println(l2);

        System.out.println("---------------------------2C----------------------");
        //laczenie wynikowych
        List<Car> wynik = new ArrayList<Car>(l2);
        wynik.addAll(comon);
        System.out.println(wynik);

        try {
            FileWriter fw = new FileWriter("carsOut.csv",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(wynik);
            pw.flush();
            pw.close();

            JOptionPane.showMessageDialog(null,"Saved");

        }catch (Exception e){

            JOptionPane.showMessageDialog(null,"Not Saved");

        }





    }
}
