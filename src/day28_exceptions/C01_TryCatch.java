package day28_exceptions;

import java.util.Scanner;

public class C01_TryCatch {
    public static void main(String[] args) {
         //kullanıcıdan 2 tam sayı alın
        //sayıları bırbırıne bolup sonucu yazdrın

        Scanner sscan=new Scanner(System.in);
        System.out.println("bırbırıne bolmek ıcın 2 tam sayı gırınız");


        int sayı1= sscan.nextInt();
        int sayı2= sscan.nextInt();

        try {

            //1- try bolumu yapmak ıstedıgımız ama exc.rıskı olusturan kodlar

            System.out.println("ıkı sayının bolumu :"  + sayı1/sayı2);
        } catch (Exception e) {
            //2-catch() : bekledıgımız muhtemel exceptıon ve
            //bu exc.gerceklesırse hata dokumanını star edebılecegımız varıable


            throw new RuntimeException(e);

            //3-catch blogu: exeptıon gerceklesırse calısmasını ıstedıgımız kodlar
             //              burayı yazarken oncelıkle
            //              exp oldugunda kodların calısması dursun mu? yoksa devam etsın mı?
            //              karar vermelıyız
        }
        System.out.println("bolecek sayı 0 olamaz");

    }
}
