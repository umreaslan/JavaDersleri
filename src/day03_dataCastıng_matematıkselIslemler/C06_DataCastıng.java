package day03_dataCastıng_matematıkselIslemler;

import java.util.Scanner;

public class C06_DataCastıng {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in) ;

        System.out.println("lutfen bır double sayı gırınız");

        double sayıDbl=scan.nextDouble();


        System.out.println("lutfen bıt tamsayı gırınız");
        int sayıInt= scan.nextInt();

        System.out.println((int) (sayıDbl/sayıInt));


    }
}
