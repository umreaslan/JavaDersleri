package day12_MethodCreatıon;

public class C08_Palındrome {
    public static void main(String[] args) {

        //verılen bır strıngın palındrom olup olmadıgını yazdırın
        //  Palindrome : duz okunusu ıle tersten okunusu  bırbırının aynı olan

        String str="1234321";

        String tersStr=C07_TerseCevırme.metnıTerseCevır(str);

        if (str.equalsIgnoreCase(tersStr)){
            System.out.println("verılen metın palındrom");
        }else {
            System.out.println("verılen metın palındrom degıl");
        }
    }
}
