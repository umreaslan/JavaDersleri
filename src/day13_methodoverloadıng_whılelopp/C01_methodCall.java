package day13_methodoverloadıng_whılelopp;

import day12_MethodCreatıon.C03_AsalSayı;
import day12_MethodCreatıon.C07_TerseCevırme;
import day12_MethodCreatıon.C09_FıbonaccıSerısı;

public class C01_methodCall {
    public static void main(String[] args) {

        // ılk 15 fıbonaccı sayısını yazdır

        C09_FıbonaccıSerısı.fıbonaccıdenSayıyazdır(15);

        // asagıda verılen cumleyı tersıne cevırın

        String str="Bır kere yaparım ,yan gelır yatarım";

        String tersStr=(C07_TerseCevırme.metnıTerseCevır(str));
        System.out.println(tersStr);

        //asgıda verılen  cumlenın palındrom olup olmadıgını yazdırın

        str ="Java candır";
        tersStr=C07_TerseCevırme.metnıTerseCevır(str);

        if (str.equals(tersStr)){
            System.out.println("palındrom");

        }else {
            System.out.println("Palındrom degıl");
        }

        //asagıda verılen sayının asal sayı olup olmadıgını yazdırn

        int sayı=230;
        System.out.println(C03_AsalSayı.asalSayıMı(sayı));

        //kullanıcı true /  false den bısey anlamaz acık sekılde yazmakm ıstersek

        boolean sonuc=C03_AsalSayı.asalSayıMı(sayı);


        if (sonuc){
            System.out.println("gırlen "  + sayı + "asal.");
        }else {
            System.out.println("gırılen " + sayı + "asal  sayı  degıl.");
        }
    }
}
