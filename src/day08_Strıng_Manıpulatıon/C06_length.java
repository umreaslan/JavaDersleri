package day08_Strıng_Manıpulatıon;

import java.util.Random;

public class C06_length {
    public static void main(String[] args) {

        String str="Java her gecen gun daha da guzellesıyor, degıl mı?";

        //sondan 3.karakterı yazdrın
        System.out.println(str.charAt(str.length()-5));// y

        System.out.println(str.length());//49

        //Rastgele bır karakterını yazdıralım

        Random rnd=new Random();//rnd degerı ıcın 0 ıle 1 arasında rastgele bır deger olusturur

        int index=rnd.nextInt(str.length());//str.lenght den kucuk rastgele bır ınt uretır

        System.out.println(str.charAt(index));


    }
}
