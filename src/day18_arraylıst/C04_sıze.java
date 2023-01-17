package day18_arraylıst;

import java.util.ArrayList;
import java.util.List;

public class C04_sıze {

    public static void main(String[] args) {

        List<Integer> sayılar=new ArrayList<>(); // kucuk ınt ı kabul etmez

        sayılar.add(10);
        sayılar.add(5);
        sayılar.add(7);
        sayılar.add(9);

        System.out.println(sayılar);
        System.out.println(sayılar.size());

        sayılar.clear();// lıstedekı tum elementlerı sıler
        System.out.println(sayılar.size());
        System.out.println(sayılar);// ıcınde hıcbırsey kalmaz

    }
}
