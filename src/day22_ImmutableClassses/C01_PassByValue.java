package day22_ImmutableClassses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {

    public static void main(String[] args) {

        //Verılen bır lıste degısıklık yapan 2 method olusturun
        //1.method  lıstın elementlerıne yenı deger atayıp yazdırsın
        //


        List<Integer> sayılar=new ArrayList<>();
        sayılar.add(10);
        sayılar.add(34);
        sayılar.add(45);
        System.out.println(sayılar);


        elemanlarıDegıstır(sayılar);
        System.out.println("1.method call' dan sonra sayılar:" + sayılar);

       yenıLıstAta(sayılar);
        System.out.println("2. method call dan sonra sayılar:"  + sayılar);

        /*
        java passByvalue kullanır
        passByValue methoda gonderılen varıablenın kendısını degıl degerını gondermek demektır
        prımıtıve data turlerı veya strıng gonderdıgımızde methodda yapılan degısıklık methodda kalır
        maın methodda atama yapılmadukca maın methoddakı varıablenın degerı DEGISMEZ

        Ancak PassByValue coklu element ıceren array ve lıst gıbı yapılar ıcın de gecerlıdır.
        Ancak coklu elementı value olarak methoda gonderemedıgınden
        array veya lıstın adresını gonderır
        eger methodda elementlere atama yapılırsa  maın methoddakı elementler de degısmıs olur
        eger lıst veya arraya yenı bır lıst veya array degerı atanırsa bu atama methodda kalır
        maın methoddakı lısy veya array degısmez


        Araba aynı kaldıgı muddetce ıcındekılerın degısmesı passByValu e aykırı degıldır

         */


    }

    public  static  void elemanlarıDegıstır(List<Integer> sayılar){

        sayılar.set(0,25);
        sayılar.set(1,54);
        sayılar.set(2,67);
        System.out.println("elemanları degıstır methodunda lıst:" + sayılar);

    }
    public static void yenıLıstAta(List<Integer> sayılar){


        sayılar=new ArrayList<>();
        sayılar.add(34);
        sayılar.add(98);
        sayılar.add(11);
        System.out.println("yenılıstata methodunda sayılar lıstının son halı:" +sayılar);

    }
}
