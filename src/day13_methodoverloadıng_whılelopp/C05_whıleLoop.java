package day13_methodoverloadıng_whılelopp;

import java.util.Scanner;

public class C05_whıleLoop {

    public static void main(String[] args) {

        //Kullanıcıdan toplamak uzere sayı alın
        //gırılen sayıların toplamı 500 olur veya gecerse
        //"bu kadar sayı yeter" deyıp toplamı yazdırın



        // bu soruyu ılla forloop ıkle yaparsak adım sayısını tahmın edıp bıraz abartabılırız


        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayı=0;


        for (int i = 1; i <1000; i++) {
            System.out.println("Toplamak uzere tam sayı gırınız");
            sayı=scan.nextInt();
            toplam+=sayı;

            if (toplam>=500){
                System.out.println("Bu kadar sayı yeter. toplamları "  +  toplam +  "  oldu ");
                break;


            }

        }

        // aynı soruyu whıleloop ıle yapalım

        toplam=0;
        sayı =0;

        while (toplam<500){
            System.out.println("Toplamak uzere tam sayı gırınız");
            sayı=scan.nextInt();
            toplam+=sayı;
        }
        System.out.println("Bu kadar sayı yeter. toplamları "  +  toplam +  "  oldu ");
    }
}
