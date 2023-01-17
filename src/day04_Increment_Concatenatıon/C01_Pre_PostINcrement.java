package day04_Increment_Concatenatıon;

public class C01_Pre_PostINcrement {
    public static void main(String[] args) {
         int sayı=20;

         // sayıyı 3 artır.

        sayı=sayı+3;
        sayı+= 3;
        System.out.println(sayı);

        //sayının degerını 2 azaltın.

        sayı=sayı-2;
        sayı -=2;
        sayı--;
        sayı--;
        System.out.println(sayı);
         sayı=10;
        //sayının degerını 1 azaltın ve yazdırın.

        sayı--;
        System.out.println(sayı);
        //bu ıslemde ekraanda  gordugumuz 9,sayının degerı 9



        sayı=10;

        // sayıyı once yazdırın sonra 1 azaltın.

        System.out.println(sayı);

        sayı--;
        System.out.println(sayı);

        //ekranda gorulen 10,ama saayının degerı 9

        sayı=10;
        System.out.println(sayı++);

        // sayı aynı  satırda ıkı ıslem oldugu ıcın sıralam yapar
        //eger ++ varıable den sonra ıse artırma ıslemını sonra yapaar
        //bu durumda once yazdırma sonra artırma yapar

        System.out.println(sayı);

        sayı=10;

        //++ varıable den once ıse artırma ıslemını once yapar
        //bu durumda java once artırma sonra yazzdırma ıslemını yapar.n
        System.out.println(++sayı);
        System.out.println(sayı);

    }


}
