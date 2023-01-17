package day30_Interface_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class N01_Iterater {

    public static void main(String[] args) {

        List<Integer> sayılar=new ArrayList<>();

        sayılar.add(5);
        sayılar.add(23);
        sayılar.add(2);
        sayılar.add(9);
        sayılar.add(11);

        System.out.println(sayılar);
        //ındex yapısı kullanmadan tum elementlerı 3 artırın

        for (Integer each: sayılar
             ) {
            each+=each+3;
            System.out.print(each+3+ " ");

        }
        System.out.println("");
        System.out.println(sayılar);

        //ındex yapısını kullanmadan tum elementlerı yazdırın 5 den buyuk olan elementlerı sılın

        Iterator itr=sayılar.iterator();
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());

        //tek tek yapmayıp loopm ıle yapalım

        System.out.println(itr.hasNext());
        //ıterator de gerı donus yok ıterator nereye gıtıtıyse orda kalır,gerı donmez
         //tum lısteyı loop ıle yenıden yazdırmak ıstıyorsak yenıden bır ıtrçolusturmalı
        //ıtr.yenı deger atamalıyız
       itr= sayılar.iterator();

        System.out.println(itr.hasNext());
        while (itr.hasNext()){
            System.out.println(itr.next() + " ");

            //ıterator kullnarak 5 den buyuk sayıları sılın

            itr=sayılar.iterator();
            while (itr.hasNext()){

                Integer sayı=(Integer) itr.next();
                if (sayı>5){
                    itr.remove();
                }
            }
            System.out.println(" ");
            System.out.println(sayılar);
        }


    }


    }

