package day31_coolectıons;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C02_LinkList {
    public static void main(String[] args) {

        //Lınk Lıst data turnde bır lınkedlıst  olusturalım


        List<String> harfler=new LinkedList<>();
        harfler.add("H");
        harfler.add("K");
        System.out.println(harfler);

        harfler.add("H");
        System.out.println(harfler);//aynı harflerı ekleyebılırz ama adresler farklı olur

        //1.ındex w m ekleyelım

        harfler.add(1,"M");
        System.out.println(harfler);

        //2.ındex dekı k yı l yapaılım

        harfler.set(2,"L") ;
        System.out.println(harfler);

        List<String> karakterler=new LinkedList<>();
        karakterler.add("*");
        karakterler.add("#");
        karakterler.add("9");
        karakterler.add(2,"M");
        System.out.println(karakterler);

        System.out.println(harfler.retainAll(karakterler));
        System.out.println(harfler);//ortak elementler dısındakı herseyı sıldı [M]

        harfler.addAll(karakterler);
        System.out.println(harfler); //[M, *, #, M, 9]

        System.out.println(harfler.removeAll(karakterler));// true

        System.out.println(harfler);// []

        System.out.println(karakterler.subList(1, 3));//[#, M]
        System.out.println(karakterler);//atama yaplamdıgımız ıcın karakterler degısmedı

        System.out.println(karakterler.hashCode());//2210822


    }
    }

