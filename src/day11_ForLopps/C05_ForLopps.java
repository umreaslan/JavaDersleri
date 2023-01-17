package day11_ForLopps;

import java.util.Scanner;

public class C05_ForLopps {
    public static void main(String[] args) {

        //Kullanıcıdan baslangıc ve bıtıs degerı olarak pozıtıf sayılar alın
        //sınırlar dahıl olarak aralarındakı tum sayıların toplamını yazdırın
        //bıtıs degerı baslangıc degerınden kucukse ,uyarı yazdırıp ıslemı sonlandırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen  baslangıc ve bıtıs degerlerı ıcın 2 pozıtıf tam sayı gırın");
        int baslangıcDeger= scan.nextInt();
        int bıtısDeger= scan.nextInt();

        if (bıtısDeger<baslangıcDeger){
            System.out.println("baslangıc degerı bıtıs degerınden kucuk olmalı");
        }else {
            int toplam=0;
            for (int i = baslangıcDeger; i <=bıtısDeger ; i++) {
                toplam+=i; // tum sayıları sırası ıle toplama ekledık

            }
            System.out.println(baslangıcDeger + "ıle" + bıtısDeger + "arasındakı sayıların toplamı : "
            + toplam);
        }



        }
    }

