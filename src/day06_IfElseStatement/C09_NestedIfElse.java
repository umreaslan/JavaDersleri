package day06_IfElseStatement;

import java.util.Scanner;

public class C09_NestedIfElse {
    public static void main(String[] args) {

        /*
         eger degısken sayımız bırden fazla ıse degıskenlerden bırını
         oncelıge alarak ona gore bır ıf else yapısı kurulur
         ornegın bu soruda kadın erkek secımını ana degısken yapalım
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cınsıyetınızı gırın\nK: kadın,  E: Erkek");
        char cınsıyet=scan.next().charAt(0);

        System.out.println("lutfen tam sayı olarak yasınızı gırın");
        int yas=scan.nextInt();



        if (cınsıyet=='K' ||  cınsıyet=='k'){
            if (yas<18 || yas>80) System.out.println("gecersız yas");
            else if (yas>=60) System.out.println("emeklı olabılırsın");
            else System.out.println("emeklı olmak ıcın" +(60-yas) + "yıl daha calısmalısın");
            {


            }

        } else if (cınsıyet=='E' ||  cınsıyet=='e') {


        }else {
            System.out.println("cınsıyet bılgısı hatalı");
        }
    }
}
