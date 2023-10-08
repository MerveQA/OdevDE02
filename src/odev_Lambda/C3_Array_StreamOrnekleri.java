package odev_Lambda;


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C3_Array_StreamOrnekleri {
    public static void main(String[] args) {

            // Arraylerde Stream kullanabilmek icin 2 yol vardir
            // 1) Stream <Integer> isim=StreamOf(cevrilecek olan) -> Stream objesi
            // 2) Arrays.stream(arr).  ->  Array sinifindan yararlanarak
            // Array ler collection sinifinda degillerdir..set ve MAp ler gibi degildir..
            // kullanabilmek icin donusum yapilmalidir

        Integer arr1 [] ={1,5,-5,6,12,-8,9,3,4};

        soruBir(arr1);
        soruIki(arr1);
        soruUc(arr1);


    }

    private static void soruUc(Integer[] arr1) {
        // S3 : Array in elemanlarinin ortalamasini bulalim yazdir
        System.out.println("  --- Soru 3 ---  ");
        double ortalama = Arrays.stream(arr1).mapToDouble(t ->t).average().orElse(0);
        System.out.println("Toplam -> " + ortalama);
        System.out.println("-----------------\n");
    }

    private static void soruIki(Integer[] arr1) {
        // S2 : Arrayin elemanlarini toplamini bulalim
        System.out.println("  --- Soru 2 ---  ");
        int toplam = Arrays.stream(arr1).reduce(0,Integer::sum);
        System.out.println("Toplam -> " + toplam);
        System.out.println("-----------------\n");
    }

    private static void soruBir(Integer[] arr1) {
        // S1 : arrayin elemanlarini bir liste yazdiralim
        System.out.println("  --- Soru 1 ---  ");
        List<Integer> list = new ArrayList<>();
        list = Arrays.stream(arr1).collect(Collectors.toList());
        System.out.println(list);
        System.out.println("-----------------\n");
    }





}
