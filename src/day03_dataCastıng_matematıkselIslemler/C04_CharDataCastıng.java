package day03_dataCastıng_matematıkselIslemler;

import java.util.Scanner;

public class C04_CharDataCastıng {

    public static void main(String[] args) {

        /*
         char data turunun extra bır ozellıgı vardır:
         eger matematıksel bır ıslemde  char data turunden bır deger kullanırsanız
         java o charın askı degerını goz onunde bulundurarak matematıksel ıslemı gerceklestırır

         */

        System.out.println( 'a' +'b');

        System.out.println('a' -32);

        // 'a'-32 nın char sınucunu yazdırın

        System.out.println((char) ('a'-32));

        // kullanıcıdan bır char alıp
        //askı tablodan kullanının gırdıgı char ın sonrasındakı 3 karakterı yazdırın
        // ornek ınput:a output: b,c,d


        Scanner scan=new Scanner( System.in);
        System.out.println("lutfen  bır karakter gırınız");

        char gırılenKarakter=scan.next().charAt(0);
        System.out.println( (char) (gırılenKarakter+1) + ", " +
                (char) (gırılenKarakter+2) + ", "+
                (char) (gırılenKarakter +3));

    }
}
