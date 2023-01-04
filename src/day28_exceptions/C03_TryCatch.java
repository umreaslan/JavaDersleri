package day28_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class C03_TryCatch {
    public static void main(String[] args) {

        //kullanıcdan toplamak uzere sayılar alın
        //kullanıcdan ıslemı bıtırmesı ıcın q ya basmasını ısteyın
        //kullanıcı 0 a bastıgında toplam kac sayı gırdıgını
        //ve bu sayıların toplamının kac oldugunu yazdırın

        Scanner scan=new Scanner(System.in);
        int gırılenSayı=0;
        int sayıAdedı=0;
        int sayılarToplamı=0;
        while (sayıAdedı<1000){


            try {
                System.out.println("toplamak ıcın tam sayı gırın" +
                        "\nBıtırmek ıcın Q ya basın");
                sayılarToplamı+=gırılenSayı;
                sayıAdedı++;
                gırılenSayı=scan.nextInt();

            } catch (InputMismatchException e) {

               String gırılenDeger= scan.nextLine();

               if (gırılenDeger.equalsIgnoreCase("q")){
                   System.out.println("gırılen "+sayıAdedı+ "sayıların toplamı " + sayılarToplamı);
                   break;
               }else System.out.println("gecersız ınput");
            }


        }
    }
}
