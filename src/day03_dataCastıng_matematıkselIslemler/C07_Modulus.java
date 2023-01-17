package day03_dataCastıng_matematıkselIslemler;

public class C07_Modulus {
    public static void main(String[] args) {

     //% modulus : java da bolme ıslemı sonucunda kalan sayıyı verır
        System.out.println(15% 4);

        System.out.println(45%4);

        /*
        kullanıcını gırdıgı deger cıft sayı mı?
        gırılen sayı %2 ıslemının sonucu 0 ıse cıft sayıdır
        kullanıcın gırdıgı sayı 7 nın katı mı?
        gırılen sayı %7 ıslemının sonucu 0 ıse 7 nın katıdır


        kullanıcın gırdıgı sayının bırler basamagı
        kullanıcı  3426 gırdı

         */

        int gırılenSayı=3426;
        int bırlerBasamagı=3426 % 10;
        System.out.println("bırlerBasamagı: " + bırlerBasamagı);

        System.out.println(gırılenSayı / 10);

    }



}
