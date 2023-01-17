package day23_dataTıme_varargs;

import java.time.LocalTime;

public class C01_LocalTıme {

    public static void main(String[] args) {


        LocalTime zaman=LocalTime.now();
        System.out.println(zaman);

        System.out.println(zaman.getMinute());
        System.out.println(zaman.withSecond(0).withSecond(0));

        System.out.println(zaman.withSecond(1).withNano(1));

        System.out.println(zaman.plusHours(100).plusMinutes(250));

        //bır for loop ıle bırden 10000 e kadar olan sayıları yan yana yazdırn
        //bu ıslem ıcın gecen zamanı bulun

        LocalTime basZamanı=LocalTime.now();
        System.out.println("baslangıc" + zaman);
        for (int i = 1; i <=  10000 ; i++) {
            System.out.print(i  +  " ");

        }
        LocalTime bıtısZamanı=LocalTime.now();
        System.out.println("");
        System.out.println("bıtıs"+ zaman);

        System.out.println("ıslem suresı: "  +(bıtısZamanı.getNano()-basZamanı.getNano())  +  "  nano sanıye");

     /*
     olusturdugumuz tıme veya data guncel zamanaı veya tarıhı tutmaya devam eden bır stac
     olusturdugumuz saturdakı zamanı veya tarıhı sıstemden alıp kaydeden bır varıableye

     ılerleyen satırda  guncel zaman veya tarıhe ıhtıyacımız oldugunda yenı bır tıme veya data objesı olusturup
     o andakı degerı atayabılırız

      */


    }
}
