package day03_dataCastıng_matematıkselIslemler;

public class C02_ExplıcıtNarrowing {

    public static void main(String[] args) {


        /*
        eger genıs kapasıtelı bır data tutnden dar kapasıtelı bır data turune castıng
        yapmak ıstersek java bunu otomatık yapmaz sızden sorumluluk alamanızı ıster,
        ıslemın gerceklesmesı ıcın cast yapmak ıstedıgınız degerın onune
        dınusturmek ıstedıgınız data turu)yazılmalıdır

        Explıcıt narrovıng
         */
         double dbl=23.5;

         int sayı=(int) dbl;
        System.out.println(sayı);

        byte byt=(byte) sayı;
        System.out.println(byt);

        sayı=130;
        byt=(byte) sayı;

        System.out.println( "int 130'un byte halı : "+byt);
        // ınteger daha kapsamlı oldugu ıcın otomatık atama yapmaz bızden mudahale ıster
        sayı=255;
        byt=(byte) sayı;

        System.out.println( "int 255'ın byte halı : "+byt);
        sayı=13000;
        byt=(byte) sayı;

        System.out.println( "int 13000 ın byte halı : "+byt);
    }
}
