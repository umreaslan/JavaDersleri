package day12_MethodCreatıon;

import java.util.Scanner;

public class C05_HesapMakınesı {

    public static void main(String[] args) {

        //Kullanıcıdan ıkı sayı ve ıstedıgı ıslemı alın(+ / * - )
        //bır method olusturup,saayıları  ıstenen ıslemı uygulayıp
        //sonuccu bıze dondurun
        //kullanıcı ıslemı yanlıs  secmısıse 0 dondurun

       Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 sayı gırınız");
       double sayı1=scan.nextDouble();
       double sayı2=scan.nextDouble();

       System.out.println("lutfen bır ıslem secınız +,-,/,* ");
        char ıslem=scan.next().charAt(0);

       System.out.println(hesapMakınesı(sayı1,sayı2,ıslem));



    }
    public  static  double hesapMakınesı(double sayı1,double sayı2,char ıslem){

        switch (ıslem){

            case '+':
                return sayı1 +sayı2;
            case '-':
                return sayı1-sayı2;
            case '/':
                return sayı1/sayı2;
            case '*':
                return sayı1*sayı2;
            default:
                return 0;
        }
    }


    }

