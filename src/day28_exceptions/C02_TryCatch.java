package day28_exceptions;

import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {

        /*

        TRY_catch bloklarının amacı rıskı 0 yapmak degıl
        kodun ıyı analız yapıp javanın cozemeyecegı durumlarda
        ne yapmasını ıstedıgımızı kendısıne soylemektır

        Java try blogunda bas edemeyecegı bır sorunla karsılasırsa
        sız o sorunu declare edınceye kadar
        yanı catch satırırna kadar calısmayı durdurur bu durumda sorun olan satır ıle
        catch arasındakı kodlar calısmaz


         */


        Scanner sscan=new Scanner(System.in);
        System.out.println("bırbırıne bolmek ıcın 2 tam sayı gırınız");


        int sayı1= sscan.nextInt();
        int sayı2= sscan.nextInt();

        try {
            System.out.println("ıkı sayının bolumu " + sayı1/sayı2);

            System.out.println("kontrol1");//java bır sorunla karsılastıgı zaman sen sunu yap dıyene kadar
            System.out.println("kontrol2");// gerıye kalanları
            System.out.println("kontrol3");

        } catch (ArithmeticException e) {
            System.out.println("bolen sayı 0 olmasın");
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }
}
