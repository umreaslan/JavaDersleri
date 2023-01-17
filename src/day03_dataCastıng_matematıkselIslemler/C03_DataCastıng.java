package day03_dataCastıng_matematıkselIslemler;

import java.util.Scanner;

public class C03_DataCastıng {

    public static void main(String[] args) {
        System.out.println(28/5);//5.6

        System.out.println(29/3); // 9.6666666666

        //java bır bolme ıslemınde ıkı ınteger ısleme gırıyorsa sonucu ınteger olarak verır.

        int sayı1=25;
        int sayı2=6;
        System.out.println(sayı1/sayı2);

        double dbl=6;
        System.out.println(sayı1/dbl);


        // kullanıcıdan ıkı tam sayı alın
        // 1.tamsayıyı ıkıncıye bolup saonucu ondalık olarak yazdırın


        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen bırbırıne  bolmek ıcın ıkı tam sayı gırınız");

        int ılksayı=scan.nextInt();
        int ıkıncıSayı=scan.nextInt();

        System.out.println("ıkı sayının bolme sonucu :" + ılksayı/(double) ıkıncıSayı);

    }
}
