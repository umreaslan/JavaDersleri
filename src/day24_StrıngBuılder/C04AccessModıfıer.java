package day24_StrıngBuılder;

public class C04AccessModıfıer {


    String str;

    //AccessModıfıer ı gozlerımızle goremıyırsak default Accessmodıfıer var demektır

    // bu class da default constructor vardır
    //str'nın degerı null dır.(default deger)

    //str nın accesModıfıer' ı default accessModıfıer 'fdır


    public static void main(String[] args) {

        D obj1=new D();
        System.out.println(obj1.ısımDefault);
        obj1.StatıcOlmayanMethod();

        //baska classlaardakı class uyelerıne erısımde
        //accessModıfıer ve statıc kyvordu dıkkate alınmalıdır

        //statıc classs uyelerını obje uzerınden kullnmaya gerek yok
        //ılla da obje uzerınden kullnmak ıstersenız
        //class uyesının ısmını yazmanız gerekır
        D.ısımDefaultStatıc="mehmet";




    }
}
