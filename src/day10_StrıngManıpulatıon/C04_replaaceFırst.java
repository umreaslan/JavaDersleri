package day10_StrıngManıpulatıon;

public class C04_replaaceFırst {
    public static void main(String[] args) {

        String str="Java heyecandır";

        //eger tum a ları degıhlde ılk a yı degıstırmek ıstersek

        System.out.println(str.replaceFirst("a", "A"));

        //ılk harf veya rakamı * yap

        System.out.println(str.replaceFirst("\\w", "*"));
    }
}
