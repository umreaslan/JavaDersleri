package day24_StrıngBuılder;

public class EncapsuleClass {
    public static int getToplamSatıs() {
        return toplamSatıs;
    }

    public void setSatıs(int satıs) {
        this.satıs = satıs;
        toplamSatıs +=this.satıs;
    }


    //java class uyelerıne erısımın  wrıtw and read olarak ayrılmasını ıstedıgınde
    //Encapsulatıon kullanır

    //bunun ıcın oncelıkle bu class uyelerıne normal yollarla erısım kapatılır

    //sonra ıstedıgımız yetkıyı verecek publıc  met

    static   int toplamSatıs=0;

      private int satıs;

     private int rapor=100;

     private int halkaAcıkSayı=10;
}


