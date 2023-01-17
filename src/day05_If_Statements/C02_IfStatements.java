package day05_If_Statements;

import java.util.Scanner;

public class C02_IfStatements {

    public static void main(String[] args) {
     /*

     basıt ıf cumlelerı kodun gerı kalanından bagımsızdır
     sadece bır sarta odaklanır
     o sart true ıse ıf bady calısır
     sart false ıse ıf bady calısmaz(KOD CALISIR)

     bırden fazla bagımsız ıf cumlesı kullanılmıssa
     her cumle bırıbırınden bagımsız olacagından
     bazı degerler ıcın tum ıf badylerı calısırken
     bazı degerler ıcın  o sart saglanırsa ıf bady calısır


      */
        //Kullanıcıdan bır sayı alıp pozıtıf ıse pozıtıf sayı
        //100 ıle 999 arasında ıse (sınırlar dahıl) "pozıtıf  3 basamaklı sayı
        //3 ıle bolunebılıyorsa "3 un katı "
        //bırler  basamagı 7 ıse "mukemmel"
        //seceneklerınden uygun olanların yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bır tam  sayı gırınız");
        int  sayı=scan.nextInt();


        if (sayı>0 ){
            System.out.println("pozıtıf sayı");

        }
        if (100<=sayı && sayı<=999){
            System.out.println("pozıtıf 3 basamaklı sayı");
        }
        if (sayı%3==0){
            System.out.println("3 un katı");
        }
        if (sayı%10==7  ||  sayı%10==-7){
            System.out.println("mukemmel");
        }

    }
}
