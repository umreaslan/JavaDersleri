package day09_strıngManıpulatıon;

public class C02_contains {

    public static void main(String[] args) {

        String str="Java ogren mutlu ol";

        // str mutlu ıcerıyor mu ?

        System.out.println(str.contains("mutlu")); //true

        //charSequense : char dizisi
        //aradıgımız metnın strıng olması sart degıl char da olabılır

        System.out.println(str.contains("j"));//false
        System.out.println(str.contains(" "));

        //concatıons methodu kac tane olduguna degıl sadece var olup olmadıgına bakar

        System.out.println(str.contains("Java") && str.contains("mutlu")); //true

    }
}
