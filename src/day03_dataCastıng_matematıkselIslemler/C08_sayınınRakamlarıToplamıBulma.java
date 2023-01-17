package day03_dataCastıng_matematıkselIslemler;

import java.util.Scanner;

public class C08_sayınınRakamlarıToplamıBulma {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen 4 basamaklı pozıtıf bır tamsayı gırınız");

        int gırılenSayı=scan.nextInt();//2456
        //soru ıcın  lazım olacak varıableelrı hazırlayalım
        int bırlerBasamagı=0;

        int rakamlarToplamı=0;

        // sırasıyla herbır basamagı elde edıp rakamlar toplamına ekleyelım

        bırlerBasamagı=gırılenSayı % 10;
        rakamlarToplamı=rakamlarToplamı +bırlerBasamagı;
        gırılenSayı=gırılenSayı/10;

        bırlerBasamagı=gırılenSayı % 10;
        rakamlarToplamı=rakamlarToplamı +bırlerBasamagı;
        gırılenSayı=gırılenSayı/10;

        bırlerBasamagı =gırılenSayı % 10;
        rakamlarToplamı=rakamlarToplamı +bırlerBasamagı;
        gırılenSayı=gırılenSayı/10;

        bırlerBasamagı=gırılenSayı %10;
        rakamlarToplamı=rakamlarToplamı + bırlerBasamagı;
        gırılenSayı=gırılenSayı/10;

        System.out.println("gırılen sayının rakamlar toplamı : " + rakamlarToplamı);





    }
}
