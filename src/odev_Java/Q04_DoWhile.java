package odev_Java;


import java.util.Scanner;

public class Q04_DoWhile {

    /*
     Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
     ve x girildiğinde ise "Program bitti" yazan programı yazınız.
     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str;

        do {
            System.out.print("Bir ifade girin : ");
            str = scan.nextLine();
            if (str.equalsIgnoreCase("x")) {
                System.out.println("Program bitti");


            }
            else System.out.println("\nProgram çalışıyor");

        }while(!str.equalsIgnoreCase("x"));


    }
}
