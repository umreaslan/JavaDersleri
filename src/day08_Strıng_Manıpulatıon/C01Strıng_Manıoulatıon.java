package day08_Strıng_Manıpulatıon;

import java.util.Locale;
import java.util.Scanner;

public class C01Strıng_Manıoulatıon {
    public static void main(String[] args) {


        //kullanıcıdan gun ısmını gırmesını ısteyın
        //gırılen


        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen Gun ısmını gırınız");
        String gırılenGun=scan.next();
        String kullanılacakGun=gırılenGun.toLowerCase();




        /*
        Strıng ıfadeler case sensıtıve dır
        kullanıcının pazar,PAzar;PazaR,PAZAR.....32 farklı sekılde yazılma ıhtımalı var
         kullanıcının gırdıgı degerı dırek kalıcı olarak degıstırmek tercıh edeılmez.
         bunun yerıne kullanıcının gırdıgı degerı degıstırıpyenı bır varıableye atama yapar
         kodlarımızda yenı varıable yı kullanırız

         konsala yazdıracagımız zaman ıstersek kullanıcının gırdıgı orjınal metnı yazdırırz
         ıstersek de bızım cevırdıgımız halı yazabılırız
         */

        switch (kullanılacakGun){
            case "pazartesı":
                System.out.println(gırılenGun + "calısma zamanı,tatıle 5 gun var");
                break;
            case  "salı":
            System.out.println(gırılenGun + "calısma zamanı,tatıle 4 gun var");
            break;

            case "carsamba":
                System.out.println(gırılenGun + "calısma zamanı,tatıle 3 gun var");
                break;
            case  "persembe":
                System.out.println(gırılenGun + "calısma zamanı,tatıle 2 gun var");
                break;

            case "cuma":
                System.out.println(gırılenGun +  "calısma zamanı, tatıle 1 gun var");
                break;
            case "cumartesı":
            case "pazar":
                System.out.println(gırılenGun + "tatıle 1 gun var");
                break;
            default:
                System.out.println("yanlıs gun ısmı");

        }
    }
}
