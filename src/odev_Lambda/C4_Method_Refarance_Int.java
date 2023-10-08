package odev_Lambda;

        // lambda da method kullanimi :
        //ilk olarak class adi yazilir
        //sonra  :: noktalar konur
        //son olarak method secilir
        //String class i sayesinde length gibi touppercase gibi methodlari kullanabiliriz
        //Math classi sayesinde de sum vb methodlar kullanabiliriz

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class C4_Method_Refarance_Int {
    public static void main(String[] args) {
        List<Integer> liste= Arrays.asList(-2,-8,-5,1,2,5,6,7,15,6,8);

        soruBir(liste);
        soruIki(liste);
        soruUc(liste);
        soruDort(liste);

    }

    private static void soruDort(List<Integer> liste) {
        // S4: poziflerin kuplerinden max olani yazdiralim

        System.out.println("  --- Soru 4 ---  ");
        int max = liste.stream().filter( t -> t > 0).map(t -> (int)Math.pow(t,3)).reduce(Integer.MIN_VALUE,Integer::max);

        System.out.println("Pozitiflerin küpleri max --> "+ max);
        System.out.println("-----------------\n");
    }

    private static void soruUc(List<Integer> liste) {
        // S3: negatiflerin kare toplamlarini  bulalim
        System.out.println("  --- Soru 3 ---  ");
        int toplam =  liste.stream().filter(t -> t < 0).map(t -> (int)Math.pow(t,2)).
                reduce(0,Integer::sum);
        System.out.println("Negatiflerin Kare Toplamları --> "+ toplam);
        System.out.println("-----------------\n");
    }

    private static void soruIki(List<Integer> liste) {
        // S2: ciftlerin carpimini bulalim
        System.out.println("  --- Soru 2 ---  ");
       int carpim =  liste.stream().filter(C4_Method_Refarance_Int::ciftMi).
                reduce(1,Math::multiplyExact);
        System.out.println("Çiftlerin Carpimları --> "+ carpim);
        System.out.println("-----------------\n");
    }

    private static void soruBir(List<Integer> liste) {
        // S1: tekleri aralarinda bir bosluk birakarak yazdiralim
        System.out.println("  --- Soru 1 ---  ");

        liste.stream().forEach(C4_Method_Refarance_Int::printMetot);
        System.out.println("\n-----------------\n");


    }
    private static void printMetot(int i) {
        System.out.print(i + "   ");
    }
    private static boolean ciftMi(int i) {
        return i % 2 == 0;
    }




}
