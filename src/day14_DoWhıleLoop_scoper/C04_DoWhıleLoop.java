package day14_DoWhıleLoop_scoper;

import java.util.Scanner;

public class C04_DoWhıleLoop {
    public static void main(String[] args) {

        //Kuulanıcıdan pozıtıf sayı ısteyın
        //sayının tam kare olup olmadıgını bulunuz
        //tam kare ıse true degılse false yazdırın
        //orn: ınput :16  ,ınput :4


        int ınput=144;
        int karekok=1;
        boolean sonuc=false;

        while (karekok*karekok <= ınput){
            if (karekok*karekok==ınput){
                System.out.println("gırılen sayının karakoku :"  + karekok);
                sonuc=true;
                break;
            }else {
                karekok++;
            }
        }
        System.out.println(sonuc);


        //dowhıleloop la yapalım

         ınput=144;
         karekok=1;
         sonuc=false;


         do {

             if (karekok*karekok==ınput){
                 System.out.println("gırılen sayının karakoku :"  + karekok);
                 sonuc=true;
                 break;
             }else {
                 karekok++;
             }

         }while (karekok*karekok< ınput);
        System.out.println(sonuc);




        }
    }

