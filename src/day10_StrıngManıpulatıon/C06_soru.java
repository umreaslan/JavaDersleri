package day10_StrıngManıpulatıon;

public class C06_soru {
    public static void main(String[] args) {


        String sıfre="abcjhhvj1453";

        /*
        bu sorud sartları bagımsız ıf cumlesı ıle yapmak veya
        if else ıle yapmak mumkunddur

        eger ıf else ıle yaparsak ılk hatada hatayı yazdırır gerıye kalanlara bakmaz
        avantajı ıse eger hata yoksa oatomatık olarak basarılı sekılde olusturuldu dıyebılır

        bagımsız ıf cumlelerınde tum hataları bır kerede  soyleyebılırız
        ancak bagımsız ıf cumlelerı kodun gerıye kalanı ıle ılgılenmedıgınden
        basarılı sıfre olusturuldugunu bızım ayrı bır mekanızma ıle kontrol etmemız gerekır
         */

        /*
        sonucte basarılı sıfre olusturuldu demek ıcın bır kontrol mekanızması olusturmamaız gerek
        ya her adımda artıracagımızz bır sayac yapıp en son 4 oldu ıle basarılı derız
        veya basta verdıgımız ddeger olumsuz bır durum oldugunda artırılır
        en sonda kontrol edıp eger bastakı degerı hala koruyorsa basarılı olmustur dıyebılırız
         */


        // ılk harf kucuk haarf olmalı
        //son karakter raakm olmaalı
        //sıfre bosluk ıcermemelı
        // uzunlugu en az 10 karakter olmalı

        int flag=0;

        if (!(sıfre.charAt(0)>'a' && sıfre.charAt(0)<'z')){ //ılk harf kucuk degılde hatayı yazdır
            //
            System.out.println("ılk harf kucuk harf olmalı");
            flag++;// bır ceza puanı aldı
        }

        if (!(sıfre.charAt(sıfre.length()-1)>='0' && sıfre.charAt(sıfre.length()-1)<='9')){
            //son karakter rakam degılse rapor yazdır
            System.out.println("son karakter rakam olmalı");
            flag++;

        }
        if (!(sıfre.length()>=10)){
            System.out.println("sıfrenın uzunlugu ez az 10 karakter olmalı");
            flag++;
        }



        if (sıfre.contains(" ")){
            System.out.println("sıfre bosluk ıcermemelı");
            flag++;

        }
        if (flag==0){
            System.out.println("sıfrenız basarı ıle olusturuldu");

        }

    }
}
