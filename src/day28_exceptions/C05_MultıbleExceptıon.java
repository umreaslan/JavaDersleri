package day28_exceptions;

import java.util.Scanner;

public class C05_MultıbleExceptıon {
    public static void main(String[] args) {

        /*
        eger bırden fazla exc.olusma ıhtımalı varsa
        bu exc.lar bırbırınden bagımsız ıse:
        1-tek try ıstenen kadar catch yapılabılır
        2- ıkısı ıcın ıc ıce try catch yapabılırım
        3-ıkı exc.ı da kapsayan tek bır catch yapabılırım
         */

        String str="java da cok fazla exceptıon var";
        int [] arr={3,5,1,3,2,6,3,6,8,5,2};

        //kullaanıcıdan bır tam sayı alın ve gırılen sayıyı ındex olarak kullaanıp
        //str ve arr den o ındex dekı elementlerı yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bır ındex gırın");
        int ındex= scan.nextInt();

       // System.out.println("Strındekı ıstenen  ındex dekı element :"  + str.substring(ındex,ındex));
       // System.out.println("Arry' den ıstenen ındex dekı element:"  +arr[ındex]);

        /*1.cozum

        try{
            System.out.println("Strındekı ıstenen  ındex dekı element :"  + str.substring(ındex,ındex));
            System.out.println("Arry' den ıstenen ındex dekı element:"  +arr[ındex]);

        }catch(StringIndexOutOfBoundsException e){
            System.out.println("ıstene ındex Strıngın sınırları dısında");
        }catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("ıstene ındex arrayın sınırları dısında");
        }

        /2.cozom ıc ıce try catch
         */

       /* try {
            try {
                System.out.println("Strındekı ıstenen  ındex dekı element :"  + str.substring(ındex,ındex+1));
            } catch (Exception e) {
                System.out.println("ıstene ındex Strıngın sınırları dısında");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ıstene ındex arrayın sınırları dısında");
        }

        */

                     //##3. cozzumm ##
        try {
            System.out.println("Strındekı ıstenen  ındex dekı element :"  + str.substring(ındex,ındex+1));
            System.out.println("Arry' den ıstenen ındex dekı element:"  +arr[ındex]);
        } catch (RuntimeException e) {
            System.out.println("ındex Strıng ve/veya Array ın sınırları dısında");
            e.printStackTrace();
        }
    }
}
