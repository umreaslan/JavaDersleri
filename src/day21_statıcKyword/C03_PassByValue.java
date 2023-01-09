package day21_statıcKyword;

public class C03_PassByValue {

    public static void main(String[] args) {

        int s=20;
        System.out.println(s);

       // int sayı=30;// java buna ızın vermez.bu skop ta zaten tanımladın bır kere daha yazmana gerek yok

        //String sayı="hasan"; //data turunu degıstırsek bıle kabul etmez.

        //data turunun degıstırrerek yenıden tanımlamak da   mumkun degıldır.
        // cunku kullanırken varıable nın ısmını yazdıgımızda hangı sayı varıaablee ını kullnacagı

        method1();


    }
    public  static void method1(){
        method2(5);
        String s="Hasan";
        System.out.println(s.toLowerCase());// hasan
    }
    public static void method2(int s){
        s=s*s;
        System.out.println(s);

    }



    }

