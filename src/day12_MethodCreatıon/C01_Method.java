package day12_MethodCreatıon;

public class C01_Method {

    public static void main(String[] args) {


         String str="Java da yolu yarıladık";

         str.isEmpty();// boolean sonuc dondu ama kullanmadık

        //methodun dondurdugu sonucu kullanmak ıstersenz
        //ya yazdırırsınız ya da donen sonucu  ılerde kullanacaksak atama yapabılırım

         str.isBlank();

         // methodlar bazen  cok basıt ıslemlerı bazende komplex ıslemlerı yapabılır
        // bız o ıslemlerı nasıl yapabılırız dıye dusunmek yerıne hazır methodu kullanmayı tercıh  ederız
        // bızdxen sınra kodu ınceleyecek  kısılerde hazır  method ısınlerınden ne yapmak ıstedıgımızı
        // anlayabılır.ayrıca kodu her yazdıgımızda yapabılecegımız muhtemel hatalardan kurtulmus oluruz.
        //voıd se yazdırıyor bıze bısey dondurmez.

        String buyukaHarflıHalı=str.toUpperCase();

    }
}
