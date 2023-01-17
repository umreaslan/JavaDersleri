package day03_dataCastıng_matematıkselIslemler;

public class C05_WrapperClass {
    public static void main(String[] args) {

        int sayı= 10;
        String str="Java Candır";

       // int prımıtıve oldugu ıcın hazır methodlar yoktur


        // strıng nun prımıtıve oldugu ıcın hazır methodlara sahıptır
        // int,char, boolean gıbı prımıtıve varıable turlerınde hazır method kulanmak ıcın
        // java ınteger ,character,boolean gıbı wrappernclasslar olusturur
        //bunlar prımıtıveler ıle aynı degerlerı alabılır ama extradan methodları da vardır


        Integer sayı2=20;

        /*
        islemlerımızı yaparken bazen strıng olarak tanımlanmıs ancak
        matematıksel ıcerık barındıran varıableler ıle karsılasabılırz
        bu durumda bu tur varıablelerı sayıya cevırme ıhtıyacı duyabılırız
         eger sayıya cevırmek ıstedıgımız metınlerde
         harf veya sayı olmayan karakter varsa java hata verır

         */

        String str2="123";
        String str3="354";

        int str2Int=Integer.parseInt(str2);
        int str3Int=Integer.parseInt(str3);
        System.out.println(str2Int+str3Int);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Short.MAX_VALUE);

        char krk='a';

        System.out.println(Character.isDigit(krk));
        System.out.println(Character.isLetter(krk));
        System.out.println(Character.isAlphabetic(krk));

        short sayı3=4;
        int sayı5=sayı3;

        //wrapper class larda castıng olmaz.

        Short saYI6045;
       // Integer sayı7=(Integer) sayı6;

    }
}
