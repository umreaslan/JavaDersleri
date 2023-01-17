package day04_Increment_Concatenatıon;

public class C03_Concatenatıon {

    public static void main(String[] args) {

        int a=10;
        int b=20;
        String str1="";
        String str2=" ";
        String str3="-";
        System.out.println(a+b);
        System.out.println(str1+a+b);
        System.out.println(str2+a+b);
        System.out.println(str3+a+b);
        System.out.println(a+str2+b);
        System.out.println(a+b+str3);
        System.out.println(str1+a*b);
        System.out.println(str2+(a+b));

       // System.out.println(str2-a);  + dısında hıcbır ıslem Strıngle kullanılamaz.
        //ısın ıcıne strıng gırınceye kadar  matematıksel ıslemler yapılır once
    }
}
