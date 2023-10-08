package odev_Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C2_StringList_StreamOrnekleri {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("Java");
        list.add("ogrenmek");
        list.add("cok");
        list.add("eglencelidi");
        list.add("lambda");
        list.add("gelince");
        list.add("Daha");
        list.add("da");
        list.add("Cok");
        list.add("Eglenceli");
        list.add("Oldu");

        soruBir(list);
        soruIki(list);
        soruUc(list);
        soruDort(list);
        soruBes(list);
        soruAlti(list);
        soruYedi(list);
        soruSekiz(list);


    }

    private static void soruSekiz(List<String> list) {
        // S8 : uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz
        // ***filter(x-> x.length () !=4 && x.length () !=6)  collect
        List<String> yeniListe=new ArrayList<>();
        System.out.println("  --- Soru 8 ---  ");
        yeniListe = list.stream().filter (t -> t.length() != 4 && t.length() != 6).collect(Collectors.toList());
        System.out.println(yeniListe);
        System.out.println("-----------------\n");

    }
    private static void soruYedi(List<String> list) {
        // S7 : tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz
        //   ***map(t-< t.substring(0,1).toUpperCase() + t.substring(1).toLowerCase() forEach
        System.out.println("  --- Soru 7 ---  ");
        list.stream().map(t -> t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).
                forEach(t -> System.out.print(t + "    "));
        System.out.println("\n-----------------\n");
    }
    private static void soruAlti(List<String> list) {
        // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi
        //     ***map(t-< t.substring(0,1) + t-< t.substring(0,1) + t) forEach()
        System.out.println("  --- Soru 6 ---  ");
        list.stream().map(t -> t.substring(0,1)+t.substring(0,1)+t.substring(0,1)+t.substring(1)).
                forEach(t -> System.out.print(t + "    "));

        System.out.println("\n-----------------\n");
    }

    private static void soruBes(List<String> list) {
        // S5 : icinde e olanlardan yeni bir list olusturunuz  *** filter(contains())  collect()
        List<String> yeniListe=new ArrayList<>();

        System.out.println("  --- Soru 5 ---  ");
        yeniListe = list.stream().filter(t -> t.contains("e")).collect(Collectors.toList());
        System.out.println(yeniListe);
        System.out.println("-----------------\n");
    }

    private static void soruDort(List<String> list) {
        // S4 : tum 'l' leri silelim yazdiralim ***map(replaceAll)
        System.out.println("  --- Soru 4 ---  ");
        list.stream().map(t -> t.replace("l","")).forEach(t -> System.out.print(t + "    "));
        System.out.println("\n-----------------\n");
    }

    private static void soruUc(List<String> list) {
        // S3 : alfabetik  olarak siralayalim list olarak ***sorted()
        System.out.println("  --- Soru 3 ---  ");
        list.stream().sorted().forEach(t -> System.out.print(t + "    "));
        System.out.println("\n-----------------\n");
    }

    private static void soruIki(List<String> list) {
        // S2 : tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim *** map(t-> "*" + t + "*")
        System.out.println("  --- Soru 2 ---  ");
        list.stream().map(t -> "*"+t+"*").forEach(t -> System.out.print(t + "    "));
        System.out.println("\n-----------------\n");
    }

    private static void soruBir(List<String> list) {
        // S1 : ilk harfi d ve ya c olanlari listeleyelim *** filter-startsWith()

        System.out.println("  --- Soru 1 ---  ");
        list.stream().filter(t -> t.startsWith("d") || t.startsWith("c")).forEach(t -> System.out.print(t +"   "));
        System.out.println("\n-----------------\n");
    }








}
