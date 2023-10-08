package odev_Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C5_Method_Referance_String {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Elma", "Muz", "Portakal", "Erik","Cilek", "Limon");


        soruBir(l);
        soruIki(l);
        soruUc(l);


    }

    private static void soruUc(List<String> l) {
        // S3: E ILE Baslayanlari yazdiralim
        System.out.println("  --- Soru 3 ---  ");
       l.stream().filter(t -> t.startsWith("E")).forEach(t -> System.out.print(t + "   "));
        System.out.println("\n-----------------\n");

    }

    private static void soruIki(List<String> l) {
        // S2: Stringleri uzunluklarina gore siralayip yaziniz
        System.out.println("  --- Soru 2 ---  ");
        l.stream().sorted(Comparator.comparing(String::length)).forEach(t -> System.out.print(t + "   "));
        System.out.println("\n-----------------\n");
    }

    private static void soruBir(List<String> l) {
        // S1: Tum harfleri buyuk harf ile aralarinda bosluk birakarak yazdiralim
        System.out.println("  --- Soru 1 ---  ");
        l.stream().map(String::toUpperCase).forEach(t -> System.out.print(t + "   "));
        System.out.println("\n-----------------\n");

    }






}
