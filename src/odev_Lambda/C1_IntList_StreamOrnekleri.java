package odev_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class C1_IntList_StreamOrnekleri {
    public static void main(String[] args) {
         /*
     peek () 'in Javadoc sayfası şöyle diyor: " Bu yöntem, temelde, öğeleri bir
    ardışık düzen içinde belirli bir noktadan geçerken görmek istediğiniz
    yerde hata ayıklamayı desteklemek için vardır . Ara islemdir.. yapilam islemi gormek icin kullanilir

     */

        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));

        // S1  : listi aralarinda bosluk birakarak yazdiriniz
        System.out.println("  -- Soru 1 --  ");
        list.stream().forEach(t -> System.out.print(t + "    "));
        System.out.println("\n-----------------");

        // S2  : sadece negatif olanlari yazdir
        System.out.println("  -- Soru 2 --  ");
        list.stream().filter(t -> t < 0).forEach(t -> System.out.print(t + "    "));
        System.out.println("\n-----------------");

        // S3  : pozitif olanlardan yeni bir liste olustur
        list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        System.out.println("  -- Soru 3 --  ");
        List<Integer> yeniList = new ArrayList<>();
        yeniList = list.stream().filter(t -> t > 0).collect(Collectors.toList());
        System.out.println("Pozitif olanların listesi -> " +yeniList);
        System.out.println("-----------------");

        // S4  : list in elemanlarin karelerinden yeni bir list olusturalim
        list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        System.out.println("  -- Soru 4 --  ");
        yeniList = new ArrayList<>();
        yeniList = list.stream().map(t -> (int)Math.pow(t,2)).collect(Collectors.toList());
        System.out.println("Karelerin listesi -> " +yeniList);
        System.out.println("-----------------");

        // S5  : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim
        list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        System.out.println("  -- Soru 5 --  ");
        yeniList = new ArrayList<>();
        yeniList = list.stream().map(t -> (int)Math.pow(t,2)).distinct().collect(Collectors.toList());
        System.out.println("Karelerin tekrarsız listesi -> " +yeniList);
        System.out.println("-----------------");

        // S6  : listin elemanlarini kucukten buyuge siralayalim
        list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        System.out.println("  -- Soru 6 --  ");
        list.stream().sorted().forEach(t -> System.out.print(t + "    "));
        System.out.println("\n-----------------");

        // S7  : listin elemanlarini buyukten kucuge siralayalim
        list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        System.out.println("  -- Soru 7 --  ");
        list.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + "    "));
        System.out.println("\n-----------------");

        // S8  : list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
        list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        System.out.println("  -- Soru 8 --  ");
        yeniList = new ArrayList<>();
        yeniList = list.stream().filter(t -> t> 0).
                map(t -> (int)Math.pow(t,3)).filter(t -> t % 5 == 0 && t % 2 != 0).collect(Collectors.toList());
        System.out.println("Birler basamağı 5 olanların listesi -> " +yeniList);
        System.out.println("-----------------");

        // S9  : list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
        list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        System.out.println("  -- Soru 9 --  ");
        yeniList = new ArrayList<>();
        yeniList = list.stream().filter(t -> t> 0).
                map(t -> (int)Math.pow(t,2)).filter(t -> t % 5 != 0 || t % 2 == 0).collect(Collectors.toList());
        System.out.println("Birler basamağı 5 olmayanların listesi -> " +yeniList);
        System.out.println("-----------------");

        // S10 : list elemanlarini toplamini bulalim
        list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        System.out.println("  -- Soru 10 --  ");
       int toplam = list.stream().reduce(0, Integer::sum);
        System.out.println("Elemanlar toplamı -> " +toplam);
        System.out.println("-----------------");

        // S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim
        list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        System.out.println("  -- Soru 11 --  ");
        yeniList = new ArrayList<>();
        list.stream().filter(t -> t< 0).peek(t -> System.out.print(t +"  ")).
                map(t -> (int)Math.pow(t,2)).forEach(t -> System.out.print(t +"   "));

        System.out.println("\n-----------------");

        // S12 : listeden 5 den buyuk  sayi var mi? -anyMatch
        list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        System.out.println("  -- Soru 12 --  ");
        boolean flag = list.stream().anyMatch(t -> t >5);
        System.out.println("Listede 5'den büyük sayı var mı --> " +flag);
        System.out.println("-----------------");

        // S13 : listenin tum elemanlari sifirdan kucuk mu? -allMatch
        list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        System.out.println("  -- Soru 13 --  ");
        flag = list.stream().allMatch(t -> t < 0);
        System.out.println("Tüm elemanlar 0'dan küçük mü --> " +flag);
        System.out.println("-----------------");

        // S14 : listenin 100 e esit elemani yok mu ? -noneMatch
        list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        System.out.println("  -- Soru 14 --  ");
        System.out.println(list.stream().noneMatch(t -> t == 100) ? "100 'e eşit eleman yok" : "100 'e eşit eleman var");
        System.out.println("-----------------");

        // S15 : listenin sifira esit elemani yok mu? - noneMatch
        list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        System.out.println("  -- Soru 15 --  ");
        System.out.println(list.stream().noneMatch(t -> t == 0) ? "O'a eşit eleman yok" : "0'a eşit eleman var");
        System.out.println("-----------------");

        // S16 : listenin ilk 5 elemanini topla? - limit(5)
        list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        System.out.println("  -- Soru 16 --  ");
        toplam = list.stream().limit(5).reduce(0,Integer::sum);
        System.out.println("Ilk 5 eleman toplamı --> " + toplam);
        System.out.println("-----------------");

        // S17 : listenin son bes elemaninin  listele -skip long
        list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));

        System.out.println("  -- Soru 17 --  ");
        System.out.print("Son 5 eleman -> ");
        list.stream().skip(list.size()-5).
                forEach(t -> System.out.print(t + "   "));

    }




















}