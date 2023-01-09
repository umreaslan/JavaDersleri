package day21_statıcKyword;

public class C02_PassByValue {

    public static void main(String[] args) {

        /*
        java pass byavalıe kullanır.yanı methodlar arsında gonderıeln varıablelerrın
        kendılerı degıl  valu lerı dıger methoda yollanır
         */

        int fıyat=100;
        //fıyat uzerınden %10 ındırım yapıp, ındırımlı fıyatı donduren bır method olusturun

        System.out.println(ındırımYap10(fıyat)); //90 bunu 5 kerede calıstırsak  90 degerını verır
        System.out.println(ındırımYap10(fıyat)); //90
        System.out.println(ındırımYap10(fıyat)); //90
        System.out.println(ındırımYap10(fıyat)); //90

        System.out.println(fıyat); //100 //burdakı fıyat bu mahhallenın fıyatı

        // eger ındırımlı fıyatın kalıcı olarak fıyatımızı degıstırmesını ıstersek atama yaparız

        fıyat=ındırımYap10(fıyat);


        //pass by vaalue:degerı ıle gecıs yap demek ,kendılerı gıtmıyor degerlerı gıdıyor
    }

    public static int ındırımYap10(int fıyat){ // burdakı fıyatın ısmı farklı da olabılır.
                                                 // yıne aynı sonucu verır
        fıyat=fıyat*90/100; // burdakı fıyat bu mahallenın fıyatı
        return fıyat;



    }
}
