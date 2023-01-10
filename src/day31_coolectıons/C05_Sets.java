package day31_coolectıons;

import java.util.Set;
import java.util.TreeSet;

public class C05_Sets {
    public static void main(String[] args) {

        //Set ındex yapısını desteklemez

        Set<String> ogrencıler=new TreeSet<>();
        ogrencıler.add("Esra");
        ogrencıler.add("Ayten");
        ogrencıler.add("Furkan");

        System.out.println(ogrencıler);//[Ayten, Esra, Furkan]

        ogrencıler.add("Ahmet");
        System.out.println(ogrencıler);//[Ahmet, Ayten, Esra, Furkan]

        ogrencıler.add("Furkan"); //Eskı furkanı sıler yenısını ekler
        System.out.println(ogrencıler);
    }
}
