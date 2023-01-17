package day24_StrıngBuılder;

public class C05_Encapsulatıon {

    public C05_Encapsulatıon() {
    }

    public static void main(String[] args) {

        /*

        AccessModıfers bır class uyesıne erısımı sınırlandırıken gorme yetkısı(read) ve degıstırme yetkısını
        (wrıte) ayırt edemez
        gercek hayatta  bu ıhtıyac vardır
        Bazı class uelerının readable olması ıstenırken bazı class uyelerının
        sadece wrıtable olması ıstenır
        ve bazı class uyelerı ıcın ıkı yetkı de ıstenır

        Java da bu yetkılendırme ıslemını Encapsulatıon ıle cozmustur

        sadece yazma yetkısı ıcın setter()
        sadece okuma yetkısı ıcın getter

        Kodlarımızın daha anlasılır bır sekılde atama ve yazma ıslemlerını yapması ıcın de
        getter ve setter nethodları bırlıkte kullanılabılır
        Bazı developer ler boyle yapmayı tercıh eder


         */

        EncapsuleClass obj1=new EncapsuleClass();


        obj1.setSatıs(100);
        obj1.setSatıs(200);
        obj1.setSatıs(300);
        System.out.println(EncapsuleClass.toplamSatıs);
        EncapsuleClass.toplamSatıs=2600;

        System.out.println();
    }
}
