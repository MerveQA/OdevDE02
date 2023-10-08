package odev_Lambda;
        //multi arrayleri cevirirken flatMap kullaniriz yapilis sekli iki turludur
        //1) lambda kullanarak
        // Arrays.stream(arr).flatMap(t->Arrays.stream(t))
        //2) method ile
        // Arrays.stream(arr).flatMap(Arrays::stream)
        // BU SEKLIDE ARTIK TUM STREAM METHODLARI KULLANILABILIR

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C3_MultiArrays_StreamOrnekleri {
    public static void main(String[] args) {

        String arr[][] = {
                {"Elma", "Muz"},
                {"Portakal", "Cilek", "Limon"},
                {"Havuc", "Erik"}
        };
        soruBir(arr);
        soruIki(arr);
        soruUc(arr);
        soruDort(arr);

    }




    private static void soruDort(String[][] arr) {
        // S4 : k ile bitenlerin sonuna '*' ekleyelim   ***endsWith("k")
        System.out.println("  --- Soru 4 ---  ");
        Arrays.stream(arr).flatMap(t -> Arrays.stream(t)).filter(t -> t.endsWith("k")).
                map(t -> t + "*").forEach(t -> System.out.print(t + "   "));

        System.out.println("\n-----------------\n");
    }

    private static void soruUc(String[][] arr) {
        // S3 : E ile baslayan elemanlari liste olarak yazdirali
        System.out.println("  --- Soru 3 ---  ");
        List<String> list = new ArrayList<>();
        list = Arrays.stream(arr).flatMap(Arrays::stream).filter(t -> t.startsWith("E")).collect(Collectors.toList());
        System.out.println("StarsWith 'E' -> " + list);

        System.out.println("-----------------\n");
    }

    private static void soruIki(String[][] arr) {
        // S2 : tum elemanlari list yapalim
        System.out.println("  --- Soru 2 ---  ");
        List<String> list = new ArrayList<>();
        list = Arrays.stream(arr).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println("Array to List --> " +list);
        System.out.println("-----------------\n");
    }

    private static void soruBir(String[][] arr) {
        // S1 : E ile baslayan elemanlari double (elmaelma) olarak yazdiralim
        System.out.println("  --- Soru 1 ---  ");
        Arrays.stream(arr).flatMap(t -> Arrays.stream(t)).
                map(t -> t+t).forEach(t -> System.out.print(t +"   "));
        System.out.println("\n-----------------\n");
    }





}
