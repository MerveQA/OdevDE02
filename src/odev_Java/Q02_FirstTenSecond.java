package odev_Java;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Q02_FirstTenSecond {
    // Local time ile her dakikanın ilk 10  saniyesi ise ilk 10 sanıye içindeyiz
    // değilse ilk 10 saniye dışındayız yazdıralım

    public static void main(String[] args) {

        int saniye = LocalTime.now().getSecond();

        if (saniye < 10) System.out.println("İlk 10 saniye içindeyiz");
        else System.out.println("İlk 10 saniye dışındayız");

    }

}
