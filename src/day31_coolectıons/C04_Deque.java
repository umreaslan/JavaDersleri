package day31_coolectıons;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    public static void main(String[] args) {

        //Deque double ended queque demektır
        // ıkı yonlu kuyruk
        // bu ıkı yonlu yapısından dolayı pek cok methodun fırst ve last versıyonu vaardır
        //null elementı kabul etmez

        Deque<String> harfler=new LinkedList<>();
        harfler.add("J");
        harfler.add("L");
        System.out.println(harfler);

        harfler.addFirst("B");
        System.out.println(harfler);
        System.out.println(harfler.removeFirst());// B
        System.out.println(harfler);
        harfler.addFirst("A");
        harfler.addLast("A");
        harfler.add("K");
        System.out.println(harfler);
        //sona dogru olan A yı sılın

        System.out.println(harfler.removeLastOccurrence("A"));
        System.out.println(harfler);//[A, J, L, K]

        System.out.println(harfler.removeLastOccurrence("T")); //false

        LinkedList<String> karakterler=new LinkedList<>();
        karakterler.push("A");//addFirst ıle aynı ıslemı yapar.
        karakterler.push("B");
        System.out.println(karakterler);

        System.out.println(karakterler.clone());

        LinkedList<String> kopyaKarakterler=(LinkedList<String>) karakterler.clone();
        System.out.println(kopyaKarakterler);


    }
}
