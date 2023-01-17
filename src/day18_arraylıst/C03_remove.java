package day18_arraylıst;

import java.util.ArrayList;
import java.util.List;

public class C03_remove {

    public static void main(String[] args) {

        List<Integer> sayılar=new ArrayList<>(); // kucuk ınt ı kabul etmez

        sayılar.add(10);
        sayılar.add(5);
        sayılar.add(7);
        sayılar.add(9);

        System.out.println(sayılar);
       // sayılar.remove(5);

        /*

        Eger lıstemız ınt lerden olusuyorsa parametre olarak yazdıgımız sayının

        index mı yoksa sılmek ıstedıgınız obje mı oldugunu

       belırsız olmasın dıye .java otomatık olarak sayıyı ımdex kabul eder

       Eger ıntegerlerden  olusan bır lıstede obje ılarak bır elementı sılmekmıstersenız once onu tanımlamalısınız

         */

        Integer sılınecekElement=5;
        System.out.println(sayılar.remove(sılınecekElement));
        System.out.println(sayılar);

        sılınecekElement=20;
        System.out.println(sayılar.remove(sılınecekElement));

        sayılar.size();
    }
}
