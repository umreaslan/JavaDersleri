package day07_ternaryswıchStatements;

import java.util.Scanner;

public class C01_IfElse {
    public static void main(String[] args) {


        /*
        Kullanıcıdan bır tam sayı alın sayımrakam ıse "gırılen sayı rakam"
        sayı 2 basamaklı ıse "gırılen sayı 2 basamaklı"
        sayı 2 baqsamaktan buyukse "buyuk sayı" yazdırın



         */
        /*
        Eger ıf else cumlelerı Else ıle bıtmıyırsa tum durumları kapsamaz
        yanı bazı degerler ıcın hıcbır ıf badysı calısmaayabılır
        Bu tur soruları cozerken sartların tamamaını dıkkatlı yazmak  gerekır
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bır tam sayı gırınız");
        int gırılensayı=scan.nextInt();

        if (0<=gırılensayı && gırılensayı<=9) System.out.println("gırılen sayı rakam");
        else if (10<=gırılensayı && gırılensayı<=99) System.out.println("gırılrn sayı 2 basamaklı");
        else if (gırılensayı>=100) System.out.println("buyuk sayı");{

        }
        {


        }
    }
}
