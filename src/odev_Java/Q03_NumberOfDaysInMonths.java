package odev_Java;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Q03_NumberOfDaysInMonths {
    /*
    Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

    INPUT:
    Ay Numarasi:
    2
    Yil :
    2016
    OUTPUT :
    Subat 2016 29 Gundur.
     */
    public static void main(String[] args) {
        System.out.println(" **** YÖNTEM BİR **** ");
        yontemBir();
        System.out.println("\n **** YÖNTEM İKİ **** ");
        yontemIki();




    }

    private static void yontemIki() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ay numarasını giriniz: ");
        int ayNumarasi = scanner.nextInt();

        String ay = getAyAdi(ayNumarasi);

        System.out.print("Yılı giriniz: ");
        int yil = scanner.nextInt();

        LocalDate tarih = LocalDate.of(yil,ayNumarasi,1);
        int gunSayisi = tarih.lengthOfMonth();

        System.out.println(yil + " yılı " +ay+ " ayı "+ gunSayisi + " gündür.");
    }

    private static void yontemBir() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ay numarasını giriniz: ");
        int ayNumarasi = scanner.nextInt();

        String ay = getAyAdi(ayNumarasi);

        System.out.print("Yılı giriniz: ");
        int yil = scanner.nextInt();

        int gunSayisi = getGunSayisi(ayNumarasi, yil);
        System.out.println(yil + " yılı " +ay+ " ayı "+ gunSayisi + " gündür.");

    }



    private static int getGunSayisi(int ayNumarasi, int yil) {
        int gunSayisi = 0;
        switch (ayNumarasi) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                gunSayisi = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                gunSayisi = 30;
                break;
            case 2:
                if (yil % 4 == 0 && (yil % 100 != 0 || yil % 400 == 0)) {
                    gunSayisi = 29;

                } else {
                    gunSayisi = 28;

                }
                break;
        }

        return gunSayisi;

    }
    private static String getAyAdi(int ayNumarasi) {
        String ay = "";

        switch (ayNumarasi) {
            case 1 : ay = "OCak"    ;break;
            case 2 : ay = "Şubat"   ;break;
            case 3 : ay = "Mart"    ;break;
            case 4 : ay = "Nisan"   ;break;
            case 5 : ay = "Mayıs"   ;break;
            case 6 : ay = "Haziran" ;break;
            case 7 : ay = "Temmuz"  ;break;
            case 8 : ay = "Ağustos" ;break;
            case 9 : ay = "Eylül"   ;break;
            case 10: ay = "Ekim"    ;break;
            case 11: ay = "Kasım"   ;break;
            case 12: ay = "Aralık"  ;break;
        }

        return ay;
    }
}
