package day11_ForLopps;

public class C02_ForLopps {

    public static void main(String[] args) {

        //ınput olarak verılen bır strıngde
        //ındex ı tek sayı olanları kucuk harfle
        // ındex ı cıft sayı olanları buyuk harfle yazdrın
        //orn: java output:JaVa

        String ınput="Java  candır ,Selenıum heyecandır";

        for (int i = 0; i <ınput.length() ; i++) {
            System.out.print(i%2==0 // ındex cıft mı
                                ? ınput.substring(i,i+1).toUpperCase()//ındex cıft ıse
                                : ınput.substring(i,i+1).toLowerCase()//ındex cıft degılse
            ) ;

        }


    }
}
