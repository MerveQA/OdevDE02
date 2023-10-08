package odev_Java;

import java.util.Scanner;

public class Q01_RecursiveForLoop {

        /*  Problem Tanımı
      Verilen iki sayının kombinasyonunu bulan kodu yazınız.
      Hatırlatma C(n,r) = n! / (r!(n-r)!)

      Verilen iki sayının permütasyonunu bulan kodu yazınız.
      Hatırlatma P(n,r) = n! / (n-r)!

      Ekran Çıktısı
      Birinci sayıyı giriniz: 15
      Ikinci sayıyı giriniz: 4
      Kombinasyon: 1365
      permütasyon: 32760

      Birinci sayıyı giriniz: 5
      Ikinci sayıyı giriniz: 3
      Kombinasyon: 10
      permütasyon: 60
        */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı gir : ");
        int n = scan.nextInt();

        System.out.print("İkinci sayıyı gir : ");
        int r = scan.nextInt();

        // faktoriyelleri bulalım

        int faktoriyelN = 1;
        int faktoriyelR = 1;
        int faktoriyelFark = 1;
        for (int i = 1; i <= n; i++) {
            faktoriyelN *= i;
        }
        for(int i = 1 ; i <= r; i++) {
            faktoriyelR *= i;
        }
        for(int i = 1 ; i <= (n-r); i++) {
            faktoriyelFark *= i;
        }
        System.out.println("faktoriyelR = " + faktoriyelR);
        System.out.println("faktoriyelN = " + faktoriyelN);
        System.out.println("faktoriyelFark = " + faktoriyelFark);

        // işlemlere gelelim
        int kombinasyon = faktoriyelN / (faktoriyelR * faktoriyelFark);
        int permutasyon = faktoriyelN / faktoriyelFark;

        System.out.println("Kombinasyon => " + kombinasyon);
        System.out.println("Permütasyon => " + permutasyon);


    }


}
