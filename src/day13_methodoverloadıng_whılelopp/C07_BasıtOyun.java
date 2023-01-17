package day13_methodoverloadıng_whılelopp;

import java.util.Random;
import java.util.Scanner;

public class C07_BasıtOyun {

    public static void main(String[] args) {

        /*
        random olarak 1 ıle 100 arasında bır sayı olusturun
        kuulanıcıdan bu sayıyı bılmnesını ısteyın
        kullanıcı her deger gırdıgınde
        tuttugumuz sayı ıle karsılastırıp tahmınını buyult veya kucult dıyelım
        kullanıcı tutugumuz sayıyı bıldıgınde
        "

        -3 veya daha az tahmınde bıldıyse "vaawww" yazdırsın

        -4 -8 tahmınde bıldıyse "Aferın"
        -daha az tahmınde bıldıyse "basarısız"
        yazdırın
         */

        Random rnd=new Random();
        int tutulanSayı=rnd.nextInt(100);
        int sayac=1;
        int tahmın=0;


        Scanner scan=new Scanner(System.in);

        while (tutulanSayı !=tahmın){
            System.out.println("lutfen bır tahmın gırınız");
            tahmın=scan.nextInt();

            if (tutulanSayı==tahmın){
                System.out.println(sayac  +  "tahmın ıle tuttugum sayıyı buldun");
                if (sayac<=3){
                    System.out.println("vaaowww");
                } else if (sayac<=8) {
                    System.out.println("aferın");

                }else {
                    System.out.println("basarısız");
                }
                break;
            } else if (tahmın<tutulanSayı) {
                System.out.println("sayıyı buyut ");
                sayac++;

            }else {
                System.out.println("sayıyı kucult");
                sayac++;
            }


        }

    }
}
