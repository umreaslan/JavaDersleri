package day17_Arrays;

import java.util.Arrays;

public class C03_StrıngSplıtmethodu {

    public static void main(String[] args) {

        String str="Java her gecen gun guzellesıyor";

        // str de kac kelıme var?
        //Splıt methodu ıstedıgımız strıngı ıstedıgımız ayrac kullanarak parcalara ayırmamıza ımkan verır

        String[]  spaceSplıt=str.split(" ");
        System.out.println(Arrays.toString(spaceSplıt));
        System.out.println("verılen cumledekı kelıme sayısı : "  + spaceSplıt.length);

        System.out.println(Arrays.toString(str.split("e")));

        System.out.println(Arrays.toString(str.split("gun")));

        System.out.println(Arrays.toString(str.split("")));




    }
}
