package odev_Lambda;
//multi arrayleri cevirirken flatMap kullaniriz yapilis sekli iki turludur
//1) lambda kullanarak
// Arrays.stream(arr).flatMap(t->Arrays.stream(t))
//2) method ile
// Arrays.stream(arr).flatMap(Arrays::stream)
// BU SEKLIDE ARTIK TUM STREAM METHODLARI KULLANILABILIR

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C3_MultiArrays_StreamOrnekleri {
    public static void main(String[] args) {

        String arr[][] = {
                {"Elma", "Muz"},
                {"Portakal", "Cilek", "Limon"},
                {"Havuc", "Erik"}
        };

    }

    // S1 : E ile baslayan elemanlari double (elmaelma) olarak yazdiralim
    // S2 : tum elemanlari list yapalim
    // S3 : E ile baslayan elemanlari liste olarak yazdirali
    // S4 : k ile bitenlerin sonuna '*' ekleyelim   ***endsWith("k")



}
