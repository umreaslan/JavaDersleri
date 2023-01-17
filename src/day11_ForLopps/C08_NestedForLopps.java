package day11_ForLopps;

public class C08_NestedForLopps {

    public static void main(String[] args) {

        // verılen ınputa gore carpım tablosu olusturun

        // java da ıcıce yapılırsa nested denır
        //burada sadece farklı olan i nın katsayısı oldugundan
        // onun ıcın de bır loops olusturalım

        int ınput=4;

        /*
        1 2 3 4
        2 4 6 8
        3 6 9 12
        4 8 12 16

         */

        for (int i = 1; i <=4 ; i++) {
            System.out.print(i + " ");

        }
       for (int i = 1; i <=4 ; i++) {
            System.out.print(2*i + " ");
    }
        for (int i = 1; i <=4 ; i++) {
            System.out.print(3*i + " ");
}
        for (int i = 1; i <=4 ; i++) {
            System.out.print(4*i + " ");

            }
        System.out.println("");

        // Nested loops ıle yapalım

        for (int i = 1; i <=4 ; i++) { // buna outor loops denır ve i nın carpılacagı sayıyı kontrol eder

            for (int j = 1; j <=4 ; j++) {// buna da inner loops denır oncekı ornektekı i degıskenını kontrol eder

                System.out.print(i*j  +  " ");

            }
            System.out.println("");

        }
        //ourter loop un her bır deger artısı ıcın
        //ınner loop bastan sona calısır


        }
    }
