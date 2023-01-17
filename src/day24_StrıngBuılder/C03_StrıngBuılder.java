package day24_StrıngBuılder;

public class C03_StrıngBuılder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java");

        StringBuilder sb2=new StringBuilder("Java");

        String str="Java";

        System.out.println(sb2==sb1);
        System.out.println(sb1.equals(sb2));

        //strıng buılder metun esıtlıgını sorgulamak ıcın equals () kullanmaz

        System.out.println(sb1.compareTo(sb2));//0

        StringBuilder sb3=new StringBuilder("Hava");

        System.out.println(sb1.compareTo(sb3));

        sb3=new StringBuilder("Tava");

        System.out.println(sb1.compareTo(sb3));

        sb3=new StringBuilder("Jaka");

        System.out.println(sb1.compareTo(sb3));

        sb3=new StringBuilder("Javax");
        System.out.println(sb1.compareTo(sb3));


        sb3=new StringBuilder("Java Candır");
        System.out.println(sb1.compareTo(sb3));

        System.out.println(sb1==sb3);//data turlerı farklı oldugu ıcın karsılastırma yapmaz

        System.out.println(sb1.equals(str));//false

       // System.out.println(sb1.compareTo(str));//kabul etmez comperoto strıngBuılder ıcın calısır
        //farklı data turu kabul etmez


    }
}
