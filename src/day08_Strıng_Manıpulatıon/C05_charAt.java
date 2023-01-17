package day08_Strıng_Manıpulatıon;

public class C05_charAt {

    public static void main(String[] args) {

        String str= "Java guzeldır";

        //Java da ındex o dan baslar
        //J== 0. ındex,r==12.ındex
        //charAt(ındex) ıle ıstedıgımız ındex dekı char a ulasabılırız

        //ılk a yı yazdıralım
        System.out.println(str.charAt(1));

        //sondan 2. harfı yazdır
        System.out.println(str.charAt(13-2));//karakter sayısı -2.ındex dekıeleman

        //somdan 4.karakterı buyuk harf olarak yazdırın

        System.out.println(str.toUpperCase().charAt(13-4));

        //charAt methodu bıze char dondurdugu ıcın touppercase calısmaz
        //Strıng methodlarını charAt ıle kullanmak ıstersenız charAt den once kullanmalısınız

       // System.out.println(str.charAt(13));//StrıngIndexOutofBoundsexceptıo

        //eger ındex olarak karakter sayısı veya daha buyuk bır deger gırersek o ındex ı bulamayacagı
        //ıcın hata verır.
    }
}
