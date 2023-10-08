package odev_Lambda;


import java.util.stream.IntStream;

public class C6_Lambdada_ForLoop_Aralik_Kontrolu {

    public static void main(String[] args) {
    //iterate bize sayilari istedigimiz sekilde yineletmeyi saglar yani buradaki ornekte 7ser7ser artmayi saglar
   // iterate icin bir baslangic degeri girilmeli ve artisin nasil olacagi belirtilmeli nerede biteceginide limit() ile belirliyoruz

        // S1:1 den 30 kadar olan sayilari (30 dahil degil) 1 2 3 .... seklinde siralayalim (for loopsuz)
        //range(int startInclusive, int endExclusive)
        System.out.println("  --- Soru 1 ---  ");
        IntStream.range(1, 30).forEach(t -> System.out.print(t + "  "));
        System.out.println("\n-----------------\n");

        //S2:  1 den 30 kadar olan sayilari (30 dahil ) 1 2 3 .... seklinde siralayalim (for loopsuz)
        //rangeClosed(int startInclusive, int endInclusive)
        System.out.println("  --- Soru 2 ---  ");
        IntStream.rangeClosed(1, 30).forEach(t -> System.out.print(t + "  "));
        System.out.println("\n-----------------\n");

        //S3 Istenen iki deger(dahil) arasindaki sayilari toplayalim **rangeClosed(a,b)
        System.out.println("  --- Soru 3 ---  ");
        int a = 2;
        int b = 10;
        int toplam = IntStream.rangeClosed(a, b).sum();
        System.out.println("Değerler toplamı => " + toplam);
        System.out.println("-----------------\n");

        //S4: 30 ile 40 arasindaki sayilarin (dahil) ortalamasini bulalim **average()
        System.out.println("  --- Soru 4 ---  ");
        double ort = IntStream.rangeClosed(30, 40).average().orElse(0);
        System.out.println("Sayıların ortalaması = " + ort);
        System.out.println("-----------------\n");

        //S5: 325 ile 468 arasinda 8 e bolunen kac sayi vardir?  **rangeClosed(a,b)   filter()  count()- long
        System.out.println("  --- Soru 5 ---  ");
        long count = IntStream.rangeClosed(325,468).filter(t -> t % 8 == 0).count();
        System.out.println("8'e bölünen sayı adedi = " + count);
        System.out.println("-----------------\n");

        //S6: 325 ile 468 arasinda 8 e bolunen sayilari yazdiralim **rangeClosed(a,b)   filter()  forEach()
        System.out.println("  --- Soru 6 ---  ");
        IntStream.rangeClosed(325,468).filter(t -> t % 8 == 0).forEach(t -> System.out.print(t + "  "));
        System.out.println("\n-----------------\n");

        // S7:325 ile 468 arasinda 8 e bolunen sayilarin toplamini bulalim  **rangeClosed(a,b)   filter() sum()
        System.out.println("  --- Soru 7 ---  ");
        System.out.println("(328 - 468) sayıların toplamı = " +IntStream.rangeClosed(325, 468).filter(t -> t % 8 == 0).sum());
        System.out.println("-----------------\n");

        // S8: 7 ile 15 (dahil) arasindaki tek sayilarin carpimini bulalim **rangeClosed(a,b)   Methods::tekMi   reduce(1, carpim)
        System.out.println("  --- Soru 8 ---  ");
        int carpim = IntStream.rangeClosed(7,15).filter(t -> t % 2 != 0).reduce(1,Math::multiplyExact);
        System.out.println("(7-15) arası sayıların carpımı = " + carpim);
        System.out.println("-----------------\n");

        //S9: pozitif tek sayilarin ilk 10 elemanin yazdiralim  *** IntSteram    limit(10)  filter ()  forEach()
        System.out.println("  --- Soru 9 ---  ");
        IntStream.iterate(1,t -> t+2 ).limit(10).forEach(t -> System.out.print(t + "  "));
        System.out.println("\n-----------------\n");

        //S10: 21 den baslayan 7 nin katlarinin tek olanlari ilk 10 teriminin yazdiralim
        System.out.println("  --- Soru 10 ---  ");
        IntStream.iterate(21, t-> t+7).filter(t -> t % 2 != 0).limit(10).forEach(t -> System.out.print(t + "  "));
        System.out.println("\n-----------------\n");

        //S11: 21 den baslayan 7 nin katlarinin ilk 20 teriminin toplayalim
        System.out.println("  --- Soru 11 ---  ");
        IntStream.iterate(21, t -> t+7).limit(20).forEach(t -> System.out.print(t + "  "));
        System.out.println("\n-----------------\n");

    }


}
