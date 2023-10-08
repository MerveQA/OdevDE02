package odev_Java;

import java.util.Scanner;

public class Q05_Continue {
    /*
    Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
    atlar ve loop’un bir sonraki değerinden devam eder.
     */

    // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
    // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir ifade girin : ");
        String str = scan.nextLine();

        for (int i = 0; i <str.length(); i++) {
            if ( str.charAt(i) == ' ' || str.charAt(i) == 'a') {
                continue;
            }
            System.out.println(str.charAt(i));
        }


    }

}
