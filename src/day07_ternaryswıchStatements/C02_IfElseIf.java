package day07_ternaryswıchStatements;

import java.util.Scanner;

public class C02_IfElseIf {

    public static void main(String[] args) {

       /* Kullanıcıdan bır tam sayı alın sayımrakam ıse "gırılen sayı rakam"
        sayı 2 basamaklı ıse "gırılen sayı 2 basamaklı"
        sayı 2 bafsamaktan buyukse "buyuk sayı" yazdırın

        Kullanıcıdan bır tam sayı alın sayı negatıf ıse "negatıf sayı"
        */
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bır tam sayı gırınız");
        int gırılensayı=scan.nextInt();

        if (gırılensayı<0) System.out.println("negatıf sayı");
        else if (gırılensayı<=9) System.out.println("gırılen sayı rakam");
        else if (gırılensayı<=99) System.out.println("gırılen sayı 2 basamaklı");
        else System.out.println("buyuk sayı");
        {

        }
        {

        }
    }
}
