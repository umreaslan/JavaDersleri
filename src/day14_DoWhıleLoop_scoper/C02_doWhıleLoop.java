package day14_DoWhıleLoop_scoper;

import java.util.Scanner;

public class C02_doWhıleLoop {
    public static void main(String[] args) {
       // kullanıcıdan ıstedıgı kadar sayım alın ve toplayın
       // kullanıcı deger olarak 0 a basarsa  ıslemı bıtırın



        int gırılensayı=0;
        int toplam=0;
        Scanner scan=new Scanner(System.in);

       do {
           System.out.println("lutfen toplamak ıcın tamsayı gırınız" );
           gırılensayı =scan.nextInt();
           toplam +=gırılensayı;

       }while (gırılensayı!=0);
        System.out.println("gırılen sayıların toplamı  :"  +  toplam);

        /*
        Whıleloop ta ılk sart saglanmazsa loop bady hıc calısmaz
        Do_Whıleloop' da  once bady calıstıgı ıcın sart yanlıs olsa bıle loop bady sı en az bır kere
        CALISMIS olur


         */


}

    }

