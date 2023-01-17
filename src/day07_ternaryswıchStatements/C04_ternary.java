package day07_ternaryswıchStatements;

public class C04_ternary {

    public static void main(String[] args) {

        // Kullanıcıdan alınan deger
        //100 den buykse sayıyı 2 ıle carpın
        //100  esıt ve kucuk ıse sayıya 10 ekleyın

        int input=145;

        if (input>100){
            input*=2;
        }else {
            input+=10;


        }
        System.out.println( " ıf  else ile:" + input);

        input=145;
        input=input>100 ? input*2 : input+10;
        System.out.println("Ternary ile:" + input );

        /*
        verılen ınputu ınceleyelım
        eger 100 den buyukse  bunu 5 e bolup bolum sonucunun tek sayı olup olmadıgını kontrol ederız
        eger 100 den  buyuk degılse ,10 ıle bolumden kalanı bulup  bu kalanı 5 ıle
         */

    }
}
