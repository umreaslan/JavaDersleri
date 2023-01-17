package day11_ForLopps;

public class C09_NestedLopp {
    public static void main(String[] args) {

        //ınput olarak verılen kenar uzunluklarına gore
        //asagıdakı seklı cızdırın

        int kısaKenar=6;
        int uzunKenar=9;

        /*
        * * * * * * *  * * // bır satırı nasıl yazdıracagımızı ınner loop ıle belırlıyoruz
        *  * * * * * * * *
        *  * * * * * * * *
        *  * * * * * * * *
        *  * * * * * * * *
        *satırda yaptıgımız ıslemı  kac kere tekrar edecegımızı ıse outer loop belırlıyor
        *


         */

        for (int i = 1; i <=kısaKenar ; i++) {
            for (int j = 1; j <=uzunKenar ; j++) {
                System.out.print(" * ");

            }
            System.out.println("");// satır ıle ıslemınız bıttıgınde alt satıra gecmenız ıcın

        }
    }
}
